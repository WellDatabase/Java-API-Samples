package com.welldatabase.api;

import com.google.gson.*;
import com.welldatabase.api.model.Casing;
import com.welldatabase.api.model.Production;
import com.welldatabase.api.model.Well;
import com.welldatabase.api.request.*;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class ApiClient {

    private String appKey;
    private String appName;
    private String apiBase = "https://app.welldatabase.com/api/v2/";

    public ApiClient( String appName, String appKey) {
        this.appKey = appKey;
        this.appName = appName;
    }


    public <T, TFilters extends CommonFilters> PagedApiResponse<T> getPaged(TFilters filters, String route, Class<T> type) throws IOException {

        if(route == null || route.isEmpty()) {
            throw new InputMismatchException("Route value can not be null or empty");
         }
        if(route.startsWith("/")) {
            route = route.replaceAll("^/+", "");
        }
        String postUrl = apiBase + route;

        //Create http client
        HttpClient httpClient = createHttpClient();
        PagedApiResponse<T> response = processResponse(httpClient, new Request(filters), postUrl, type);

        return response;
    }
    public PagedApiResponse<Well> searchWells(WellFilters filters) throws IOException {
        String postUrl = "/wells/search";
        return getPaged(filters, postUrl, Well.class);
    }
    public PagedApiResponse<Production> searchProduction(ProductionVolumeFilters filters) throws IOException {
        String postUrl = "/productionVolumes/search";
        return getPaged(filters, postUrl, Production.class);
    }
    public PagedApiResponse<Casing> searchCasings(CasingFilters filters) throws IOException {
        String postUrl = "/casings/search";
        return getPaged(filters, postUrl, Casing.class);
    }

    private <T> PagedApiResponse<T>  processResponse(HttpClient httpClient, Object data, String route, Class<T> type) throws IOException {

        String dateFormatLiteral = "yyyy-MM-dd'T'HH:mm:ss";
        Gson gson = new GsonBuilder().setDateFormat(dateFormatLiteral).create();

        String content = gson.toJson(data);//gson.tojson() converts your pojo to json
        StringEntity postingString = new StringEntity(content);

        HttpPost post = new HttpPost(route);
        post.setEntity(postingString);

        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String response = httpClient.execute(post, responseHandler);

        JsonObject myObject = gson.fromJson(response, JsonObject.class);

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

    private HttpClient createHttpClient() {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        Header userAgent = new BasicHeader(HttpHeaders.USER_AGENT, this.appName);
        Header apiKey = new BasicHeader("Api-Key", this.appKey);
        List<Header> headers = new ArrayList<Header>();
        headers.add(contentType);
        headers.add(userAgent);
        headers.add(apiKey);
        return HttpClientBuilder.create().setDefaultHeaders(headers).build();
    }
}
