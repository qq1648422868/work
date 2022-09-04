package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;

@EnableScheduling
@Component
public class WebSocketScheduled {
    @Scheduled(cron = "0/100 * * * * ?")
    public void test() {
        System.err.println("********* 定时任务执行 **************");
        CopyOnWriteArraySet<WebSocket> webSocketSet = WebSocket.getWebSocketSet();
        webSocketSet.forEach(c -> {
            try {
                c.sendMessage(" 定时发送 " + new Date());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        System.err.println("/n 定时任务完成.......");
    }

}

