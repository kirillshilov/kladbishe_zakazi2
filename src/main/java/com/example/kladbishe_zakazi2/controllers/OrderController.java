package com.example.kladbishe_zakazi2.controllers;

import com.example.kladbishe_zakazi2.model.Order;
import com.example.kladbishe_zakazi2.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;



@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Collection<Order> getAllOrder() {
        orderService.getAllOrders();
        return new ArrayList<>();
    }

    @GetMapping("{text}")
    public Collection<Order> getOrderByData(@PathVariable String text) {
        return orderService.getOrderByData(text);
    }

    @PostMapping("/add")
    public ResponseEntity addOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.addOrder(order));
    }

    @PutMapping("/change")
    public ResponseEntity changeOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.changeOrder());
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteOrder(@RequestParam Long id) {
        return ResponseEntity.ok(orderService.deleteOrder());
    }

}
