package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${hello}")
    private String s;

    @GetMapping("/hello")
    String hello(){
        return "world";
    }

    @GetMapping("/hello2")
    String hello2(){
        return s;
    }
}
