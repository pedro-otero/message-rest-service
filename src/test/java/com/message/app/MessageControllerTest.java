package com.message.app;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by other on 25/03/2017.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MessageController.class)
public class MessageControllerTest extends TestCase {
    @Autowired
    private MockMvc mvc;

    private String mediaType;

    @Before
    public void setup() {
        mediaType = "application/json";
    }

    @Test
    public void testGetMessage1() throws Exception {
        String url = "/v1/messages/id1";
        ResultMatcher correctResult = content().json("{\"id\": \"id1\", \"message\": \"Message #1\"}");
        MockHttpServletRequestBuilder action = get(url).accept(mediaType);
        mvc.perform(action).andExpect(correctResult);
    }

    @Test
    public void testGetMessage2() throws Exception {
        String url = "/v1/messages/id2";
        ResultMatcher correctResult = content().json("{\"id\": \"id2\", \"message\": \"Message #2\"}");
        MockHttpServletRequestBuilder action = get(url).accept(mediaType);
        mvc.perform(action).andExpect(correctResult);
    }

    @Test
    public void testGetMessage3() throws Exception {
        String url = "/v1/messages/id3";
        ResultMatcher correctResult = content().json("{\"id\": \"id3\", \"message\": \"Message #3\"}");
        MockHttpServletRequestBuilder action = get(url).accept(mediaType);
        mvc.perform(action).andExpect(correctResult);
    }

    @Test
    public void testGetMessage4() throws Exception {
        String url = "/v1/messages/id4";
        ResultMatcher correctResult = content().json("{\"id\": \"id4\", \"message\": \"Message #4\"}");
        MockHttpServletRequestBuilder action = get(url).accept(mediaType);
        mvc.perform(action).andExpect(correctResult);
    }

    @Test
    public void testGetMessage5() throws Exception {
        String url = "/v1/messages/id5";
        ResultMatcher correctResult = content().json("{\"id\": \"id5\", \"message\": \"Message #5\"}");
        MockHttpServletRequestBuilder action = get(url).accept(mediaType);
        mvc.perform(action).andExpect(correctResult);
    }

    @Test
    public void testNonExistentGetMessage() throws Exception {
        String url = "/v1/messages/xxx";
        MockHttpServletRequestBuilder action = get(url).accept(mediaType);
        mvc.perform(action).andExpect(status().is(HttpServletResponse.SC_NOT_FOUND));
    }
}