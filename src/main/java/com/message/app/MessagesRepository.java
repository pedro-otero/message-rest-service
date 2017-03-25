package com.message.app;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by other on 25/03/2017.
 */
public class MessagesRepository {
    private static Map<String, String> messages;

    static {
        messages = new HashMap<>();
        messages.put("id1", "Message #1");
        messages.put("id2", "Message #2");
        messages.put("id3", "Message #3");
        messages.put("id4", "Message #4");
        messages.put("id5", "Message #5");
    }

    public static String findById(String id) {
        return messages.get(id);
    }
}
