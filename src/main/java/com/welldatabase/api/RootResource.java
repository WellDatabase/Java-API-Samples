package com.welldatabase.api;

import com.welldatabase.api.request.CommonFilters;

import java.io.File;
import java.io.IOException;

public  class RootResource<T, TFilters extends CommonFilters> {

    private final ApiClient client;
    private final String route;
    private final Class<T> target;

    public RootResource(ApiClient client, String route, Class<T> target) {

        this.client = client;
        this.route = route;
        this.target = target;
    }
    public PagedApiResponse<T> search(TFilters filters) throws IOException, OverRequestLimitException {
        String postUrl =route + "/search";
        return client.getPaged(filters, postUrl, target);
    }

    public void export(TFilters filters, File target) throws IOException, OverRequestLimitException {
        String postUrl = route + "/export";
        client.getStream(filters, postUrl, target);
    }
}
