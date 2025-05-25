package com.usecase.Delivery.order.service;

import com.usecase.Delivery.order.entity.Order;
import com.usecase.Delivery.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repo;

    public Order addOrder(Order order) {
        return repo.save(order);
    }

    public List<Order> getOrdersByAgent(Long agentId) {
        return repo.findByAgentIdOrderByOrderDateAsc(agentId);
    }
}
