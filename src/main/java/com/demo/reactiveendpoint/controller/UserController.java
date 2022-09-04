package com.demo.reactiveendpoint.controller;

import com.demo.reactiveendpoint.entity.User;
import com.demo.reactiveendpoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Note that in order to be Reactive, this method should not return normal json
    //data, instead, it should return an event stream.
    @GetMapping(value = "all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }
}
