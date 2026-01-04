package com.brownhouse46.server.common.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON-001", "Internal server error"),
    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "COMMON-002", "Invalid request");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }

    public HttpStatus httpStatus() {
        return httpStatus;
    }

    public String code() {
        return code;
    }

    public String message() {
        return message;
    }
}
