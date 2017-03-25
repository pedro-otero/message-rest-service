package com.message.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by other on 23/03/2017.
 */
@RestController
public class MessageController {

    @RequestMapping(value = "/v1/messages/{id}", method = RequestMethod.GET)
    public ResponseEntity<Message> message(@PathVariable("id") String id) {
        String message = MessagesRepository.findById(id);
        if (message == null) {
            return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
        } else {
            Message messageObject = new Message(id, message);
            return new ResponseEntity<Message>(messageObject, HttpStatus.OK);
        }
    }
}
