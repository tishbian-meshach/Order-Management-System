package com.usecase.Delivery.order.controller;

import com.usecase.Delivery.order.entity.Order;
import com.usecase.Delivery.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    // ✅ POST /orders – Add a new order
    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return service.addOrder(order);
    }

    // ✅ GET /orders?agentId=5 – View agent's orders
    @GetMapping("/{agentId}")
    public List<Order> getOrdersByAgent(@PathVariable Long agentId) {
        return service.getOrdersByAgent(agentId);
    }
}
