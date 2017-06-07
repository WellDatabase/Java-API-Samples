package com.welldatabase.api;

import com.google.gson.*;
import com.welldatabase.api.model.Casing;
import com.welldatabase.api.model.Production;
import com.welldatabase.api.model.Well;
import com.welldatabase.api.request.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ApiClient {

    private String appKey;
    private String appName;
    private String apiBase = "https://app.welldatabase.com/api/v2/";

    public ApiClient(String appName, String appKey) {
        this.appKey = appKey;
        this.appName = appName;
    }

    public RootResource<Well, WellFilters> getWells() {
        return new RootResource<Well, WellFilters>(this, "wells", Well.class);
    }

    public RootResource<Casing, CasingFilters> getCasings() {
        return new RootResource<Casing, CasingFilters>(this, "casings", Casing.class);
    }

    public RootResource<Production, ProductionVolumeFilters> getProduction() {
        return new RootResource<Production, ProductionVolumeFilters>(this, "productionVolumes", Production.class);
    }


    <T, TFilters extends CommonFilters> PagedApiResponse<T> getPaged(TFilters filters, String route, Class<T> type) throws IOException, OverRequestLimitException {

        String postUrl = ensureRoute(route);

        //Create http client
        HttpClient httpClient = createHttpClient();
        PagedApiResponse<T> response = processResponse(httpClient, new SearchRequest(filters), postUrl, type);

        return response;
    }

    private String ensureRoute(String route) {
        if (route == null || route.isEmpty()) {
            throw new InputMismatchException("Route value can not be null or empty");
        }
        if (route.startsWith("/")) {
            route = route.replaceAll("^/+", "");
        }
        return apiBase + route;
    }

    private <T> PagedApiResponse<T> processResponse(HttpClient httpClient, Object data, String route, Class<T> type) throws IOException, OverRequestLimitException {

        Gson gson = getGson();

        HttpResponse httpResponse = sendRequest(httpClient, data, route, gson);
        HttpEntity entity = httpResponse.getEntity();
        String response = EntityUtils.toString(entity, "UTF-8");


        int total = 0;
        int page = 0;
        int pageSize = 0;
        ArrayList<T> items = new ArrayList<T>();

        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 429) {
            throw new OverRequestLimitException();
        }
        if (statusCode >= 200 && statusCode < 400 && response != null) {
            JsonObject myObject = gson.fromJson(response, JsonObject.class);

            total = myObject.has("total") ? myObject.get("total").getAsInt() : 0;
            page = myObject.has("page") ? myObject.get("page").getAsInt() : 0;
            pageSize = myObject.has("pageSize") ? myObject.get("pageSize").getAsInt() : 0;
            JsonArray jsonItems = myObject.get("data").getAsJsonArray();


            for (int i = 0; i < jsonItems.size(); i++) {

                JsonElement entry = jsonItems.get(i);
                T result = gson.fromJson(entry, type);

                items.add(result);
            }
        }

        PagedApiResponse<T> objectResponse = new PagedApiResponse<T>(total, page, pageSize, items);

        SetRequestLimits(httpResponse, objectResponse);

        return objectResponse;
    }

    private HttpResponse sendRequest(HttpClient httpClient, Object data, String route, Gson gson) throws IOException {
        String content = gson.toJson(data);//gson.tojson() converts your pojo to json
        StringEntity postingString = new StringEntity(content);

        HttpPost post = new HttpPost(route);
        post.setEntity(postingString);

        return httpClient.execute(post);
    }

    private Gson getGson() {
        String dateFormatLiteral = "yyyy-MM-dd'T'HH:mm:ss";
        return new GsonBuilder().setDateFormat(dateFormatLiteral).create();
    }

    private <T> void SetRequestLimits(HttpResponse httpResponse, PagedApiResponse<T> objectResponse) {
        Header rateLimitRemainingHeader = httpResponse.getFirstHeader("RateLimit-Remaining");
        Header rateLimitUsedHeader = httpResponse.getFirstHeader("RateLimit-Used");
        Header rateLimitHeader = httpResponse.getFirstHeader("RateLimit-Limit");
        Header rateLimitNextResetHeader = httpResponse.getFirstHeader("RateLimit-Reset");

        if (rateLimitHeader != null) {
            String rateLimitValue = rateLimitHeader.getValue();

            if (rateLimitValue != null) {
                Integer rateLimitParsed = Integer.parseInt(rateLimitValue);

                if (rateLimitParsed != null) {
                    objectResponse.setRateLimit(rateLimitParsed);
                }
            }
        }
        if (rateLimitRemainingHeader != null) {
            String rateLimitRemainingValue = rateLimitRemainingHeader.getValue();


            if (rateLimitRemainingValue != null) {
                Integer rateLimitLeft = Integer.parseInt(rateLimitRemainingValue);

                if (rateLimitLeft != null) {
                    objectResponse.setRateLimitLeft(rateLimitLeft);
                }
            }
        }
        if (rateLimitUsedHeader != null) {
            String rateLimitUsedValue = rateLimitUsedHeader.getValue();

            if (rateLimitUsedValue != null) {
                Integer rateLimitUsed = Integer.parseInt(rateLimitUsedValue);

                if (rateLimitUsed != null) {
                    objectResponse.setRateLimitUsed(rateLimitUsed);
                }
            }
        }
        if (rateLimitNextResetHeader != null) {
            String rateLimitNextResetValue = rateLimitNextResetHeader.getValue();

            if (rateLimitNextResetValue != null) {
                Long rateLimitNextREstUnixTimestamp = Long.parseLong(rateLimitNextResetValue);

                if (rateLimitNextREstUnixTimestamp != null) {
                    objectResponse.setRateLimitReset(new java.util.Date(rateLimitNextREstUnixTimestamp * 1000));
                }
            }
        }
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


    private void processStreamResponse(HttpClient httpClient, Object data, String route, File fileTarget) throws IOException {
        Gson gson = getGson();

        String postUrl = ensureRoute(route);

        HttpResponse httpResponse = sendRequest(httpClient, data, postUrl, gson);

        BufferedInputStream bis = new BufferedInputStream(httpResponse.getEntity().getContent());

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileTarget));
        int inByte;
        while ((inByte = bis.read()) != -1) bos.write(inByte);
        bis.close();
        bos.close();
    }

    <TFilters extends CommonFilters> void getStream(TFilters filters, String postUrl, File target) throws IOException {

        HttpClient httpClient = createHttpClient();
        processStreamResponse(httpClient, new ExportRequest(filters), postUrl, target);
    }
}
