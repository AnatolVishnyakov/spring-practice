package com.project.dddexample.dao;

import com.project.dddexample.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {
    void save(Order order);

    Order findOrderById(Long id);
}
