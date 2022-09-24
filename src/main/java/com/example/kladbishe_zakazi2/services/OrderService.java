package com.example.kladbishe_zakazi.services;

import com.example.kladbishe_zakazi.model.Order;
import com.example.kladbishe_zakazi.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class OrderService {
    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void getAllOrders() {
    }

    public Collection<Order> getOrderByData(String text) {
        return orderRepository.findAll();
    }

    public Order addOrder() {
        Order o = null;
        return o;
    }

    public Object changeOrder() {
        return null;
    }

    public Object deleteOrder() {
        return null;
    }
}
