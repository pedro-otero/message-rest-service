package com.message.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by other on 25/03/2017.
 */
public class MessagesRepositoryTest {

    @Test
    public void testMessage1() {
        String message = MessagesRepository.findById("id1");
        assertEquals("Message #1", message);
    }

    @Test
    public void testMessage2() {
        String message = MessagesRepository.findById("id2");
        assertEquals("Message #2", message);
    }

    @Test
    public void testMessage3() {
        String message = MessagesRepository.findById("id3");
        assertEquals("Message #3", message);
    }

    @Test
    public void testMessage4() {
        String message = MessagesRepository.findById("id4");
        assertEquals("Message #4", message);
    }

    @Test
    public void testMessage5() {
        String message = MessagesRepository.findById("id5");
        assertEquals("Message #5", message);
    }

    @Test
    public void testNonExistentMessage() {
        String message = MessagesRepository.findById("xxxx");
        assertNull(message);
    }
}