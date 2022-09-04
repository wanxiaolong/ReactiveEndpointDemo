package com.demo.reactiveendpoint.repository;

import com.demo.reactiveendpoint.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

//Note: No need to add any annotation here as SpringData would configure this bean automatically.
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

}
