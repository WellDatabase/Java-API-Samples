package com.welldatabase.api.request;

public class Request<T extends CommonFilters> {
    public T filters;

    public Request(T filters) {
        this.filters = filters;
    }
}