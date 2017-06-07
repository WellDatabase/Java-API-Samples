package com.welldatabase.samples;

import com.google.gson.*;
import com.welldatabase.api.ApiClient;
import com.welldatabase.api.OverRequestLimitException;
import com.welldatabase.api.PagedApiResponse;
import com.welldatabase.api.model.Casing;
import com.welldatabase.api.model.Well;
import com.welldatabase.api.request.CasingFilters;
import com.welldatabase.api.request.Request;
import com.welldatabase.api.request.WellFilters;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static String API_KEY = "PLEASE ENTER YOUR API KEY";

    public static void main(String[] args) throws IOException, ParseException {

        //ApiClientExample();

        ManualExample();
    }

    private static void ManualExample() throws IOException {

            CasingFilters filters = new CasingFilters();

            String postUrl = "https://app.welldatabase.com/api/v2/casings/search";

            //Create http client
            HttpClient httpClient = createHttpClient();
            PagedApiResponse<Casing> response = processResponse(httpClient, new Request(filters), postUrl, Casing.class);

            for (Casing item : response.getItems()) {
                System.out.println(item.getDateLastModified());
            }
        
    }

    private static HttpClient createHttpClient() {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        Header userAgent = new BasicHeader(HttpHeaders.USER_AGENT, "Please Enter Your App Name");
        Header apiKey = new BasicHeader("Api-Key", API_KEY);
        List<Header> headers = new ArrayList<Header>();
        headers.add(contentType);
        headers.add(userAgent);
        headers.add(apiKey);
        return HttpClientBuilder.create().setDefaultHeaders(headers).build();
    }

    private static <T> PagedApiResponse<T>  processResponse(HttpClient httpClient, Object data, String route, Class<T> type) throws IOException {

        String dateFormatLiteral = "yyyy-MM-dd'T'HH:mm:ss";
        Gson gson = new GsonBuilder().setDateFormat(dateFormatLiteral).create();

        String content = gson.toJson(data);//gson.tojson() converts your pojo to json
        StringEntity postingString = new StringEntity(content);

        HttpPost post = new HttpPost(route);
        post.setEntity(postingString);

        HttpResponse httpResponse = httpClient.execute(post);
        String response = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");

        JsonObject myObject = gson.fromJson(response, JsonObject.class);

        Header rateLimitRemaining = httpResponse.getFirstHeader("RateLimit-Remaining");
        Header rateLimitUsed = httpResponse.getFirstHeader("RateLimit-Used");
        Header rateLimit = httpResponse.getFirstHeader("RateLimit-Limit");
        Header rateLimitNextReset = httpResponse.getFirstHeader("RateLimit-Reset");

        int total = myObject.get("total").getAsInt();
        int page = myObject.get("page").getAsInt();
        int pageSize = myObject.get("pageSize").getAsInt();
        JsonArray jsonItems = myObject.get("data").getAsJsonArray();
        ArrayList<T> items = new ArrayList<T>();

        for (int i = 0; i < jsonItems.size(); i++) {

           JsonElement entry = jsonItems.get(i);
            T result = gson.fromJson(entry, type);

            items.add(result);
        }

        return new PagedApiResponse<T>(total, page, pageSize, items);
    }



    private static void ApiClientExample() throws IOException, OverRequestLimitException {

        WellFilters filters = new WellFilters();

        filters.DateLastModified.Min = utils.addDays(new Date(), -3);

        ApiClient client = new ApiClient("Wdb Sample", API_KEY);
        PagedApiResponse<Well> clientResponse = client.searchWells(filters);

        for(Well item :  clientResponse.getItems()) {
            System.out.println(item.getDateLastModified());
        }

    }

}


