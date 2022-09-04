package com.example.consumer;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(consumerGroup = "consumer-group",topic = "topic2",consumeMode = ConsumeMode.ORDERLY)
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println(s);
    }
}
