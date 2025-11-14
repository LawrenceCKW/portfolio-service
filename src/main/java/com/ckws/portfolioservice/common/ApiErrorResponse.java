package com.ckws.portfolioservice.common;

import java.time.Instant;

public record ApiErrorResponse(
        boolean success,
        String code,
        String message,
        String path,
        Instant timestamp
) {
    public static ApiErrorResponse of(String code, String message, String path) {
        return new ApiErrorResponse(false, code, message, path, Instant.now());
    }
}