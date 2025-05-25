package com.usecase.Delivery.order.repository;

import com.usecase.Delivery.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByAgentIdOrderByOrderDateAsc(Long agentId);
}