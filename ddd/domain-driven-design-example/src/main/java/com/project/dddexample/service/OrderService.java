package com.project.dddexample.service;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void createOrder();

    void reviseOrder();

    void cancelOrder();
}
