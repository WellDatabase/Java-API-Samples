package com.welldatabase.api;

import java.util.ArrayList;

public class PagedApiResponse<T> extends ApiResponse{
    private int total;
    private int page;
    private int pageSize;
    private ArrayList<T> items;

    public PagedApiResponse(int total, int page, int pageSize, ArrayList<T> items) {
        this.total = total;
        this.page = page;
        this.pageSize = pageSize;
        this.items = items;
    }


    public ArrayList<T> getItems() {
        return items;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPage() {
        return page;
    }

    public int getTotal() {
        return total;
    }
}
