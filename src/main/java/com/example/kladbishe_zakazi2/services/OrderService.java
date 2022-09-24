package com.example.kladbishe_zakazi2.services;

import com.example.kladbishe_zakazi2.Exceptions.OrderNotFoundException;
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

    // Show all orders
    public Collection<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // findOrders By Param
    public Collection<Order> getOrderByString(String textForSearch) {
        return orderRepository.
                findAllByListOfWorksContainingIgnoreCaseOrNumberOfDistrictContainingIgnoreCaseOrNameOfDeadManContainingIgnoreCase
                        (textForSearch,
                                textForSearch,
                                textForSearch);
    }

    // Save Order
    public Order addOrder(Order order) {
        if (order != null) {
            return orderRepository.save(order);
        }
        throw new IllegalArgumentException("Неверные данные");
    }

    // Change Order,  create new custom Exception 404 if Order not found
    public Order changeOrder(Order order) {
        Order temp = orderRepository.findById(order.getId()).orElseThrow(() -> new OrderNotFoundException("Заказ не найден"));
        return orderRepository.save(order);
    }

    // Delete Order,  create new custom Exception 404 if Order not found
    public Order deleteOrder(Long id) {
        Order temp = orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("Заказ не найден"));
        orderRepository.deleteById(id);
        return temp;
    }
}
