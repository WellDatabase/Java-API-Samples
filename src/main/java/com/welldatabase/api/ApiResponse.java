package com.welldatabase.api;

import java.util.Date;

public class ApiResponse {
    private int rateLimitLeft;
    private int rateLimitUsed;
    private int rateLimit;
    private Date rateLimitReset;

    public int getRateLimitLeft() {
        return rateLimitLeft;
    }

    ApiResponse setRateLimitLeft(int rateLimitLeft) {
        this.rateLimitLeft = rateLimitLeft;
        return this;
    }

    public int getRateLimitUsed() {
        return rateLimitUsed;
    }

    ApiResponse setRateLimitUsed(int rateLimitUsed) {
        this.rateLimitUsed = rateLimitUsed;
        return this;
    }

    public int getRateLimit() {
        return rateLimit;
    }

    ApiResponse setRateLimit(int rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    public Date getRateLimitReset() {
        return rateLimitReset;
    }

    ApiResponse setRateLimitReset(Date rateLimitReset) {
        this.rateLimitReset = rateLimitReset;
        return this;
    }
}
