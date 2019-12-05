package com.test.service.testservice;

public class ResponseBean {
    private String message;

    public ResponseBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
