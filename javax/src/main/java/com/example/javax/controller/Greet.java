package com.example.javax.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
    @RequestMapping("/hello")
    public String hello() {
       
        return "Hello, World!";
    }
}