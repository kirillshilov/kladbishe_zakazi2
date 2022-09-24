package com.example.kladbishe_zakazi2.services;

import com.example.kladbishe_zakazi2.model.Order;
import com.example.kladbishe_zakazi2.repositories.OrderRepository;
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

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Object changeOrder() {
        return null;
    }

    public Object deleteOrder() {
        return null;
    }
}
