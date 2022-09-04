package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private final RedisTemplate redisTemplate;

    public RedisController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
    @GetMapping("/redis")
    public void test()throws Exception{

        redisTemplate.opsForValue().set("hello","world");

        System.out.println(redisTemplate.opsForValue().get("hello"));

    }






}
