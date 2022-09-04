package com.example.service;

import com.example.entity.Order;
import com.example.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public List<Order> list(){
        return orderMapper.list();
    }
}
