package com.walgotech.churchspringapp.payload.response;

public class MessageResponse {

    private String message;

    // Constructors, getters, and setters (if needed)

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
