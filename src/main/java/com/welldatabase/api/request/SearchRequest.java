package com.welldatabase.api.request;

public class SearchRequest<T extends CommonFilters> {
    public T filters;

    public SearchRequest(T filters) {
        this.filters = filters;
    }
}

