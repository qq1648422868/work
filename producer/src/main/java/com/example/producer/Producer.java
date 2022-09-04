package com.example.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
    @Autowired
    RocketMQTemplate rocketMQTemplate;
    @GetMapping("/send")
    String send(){
        rocketMQTemplate.convertAndSend("topic1","Hello world!");
        return "send success";
    }
    @GetMapping("/sendOrderly")
    String sendOrderly(){
        rocketMQTemplate.syncSendOrderly("topic2","hello1","1");
        rocketMQTemplate.syncSendOrderly("topic2","hello2","2");
        rocketMQTemplate.syncSendOrderly("topic2","hello3","3");
        return "sendOrderly success";
    }
}
