package com.demo.reactiveendpoint.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    //Note that the @Id here is from spring framework, it's not JPA related.
    @Id
    private int id;
    private String name;
    private int age;
}
