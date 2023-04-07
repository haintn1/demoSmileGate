package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseData<T> {
    public ResponseData() {
    }

    public ResponseData(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("message")
    private String message;

    @JsonProperty("description")
    private String description;

    @JsonProperty("data")
    private T result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
