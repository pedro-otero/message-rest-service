package com.message.app;

/**
 * Created by other on 23/03/2017.
 */
public class Message {
    private final String id;
    private final String message;

    public Message(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
