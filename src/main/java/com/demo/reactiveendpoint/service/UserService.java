package com.demo.reactiveendpoint.service;

import com.demo.reactiveendpoint.entity.User;
import com.demo.reactiveendpoint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //this method would take 30s to execute
    public Flux<User> findAll() {
        return userRepository.findAll() // 6 elements in total in DB
                // for any elements, add a sleep duration
                .delayElements(Duration.ofSeconds(5));
    }
}
