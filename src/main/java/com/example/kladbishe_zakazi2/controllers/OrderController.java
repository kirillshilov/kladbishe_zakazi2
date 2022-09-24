package com.example.kladbishe_zakazi.controllers;

import com.example.kladbishe_zakazi.model.Order;
import com.example.kladbishe_zakazi.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;



@RestController
@RequestMapping("Orders")
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
        return ResponseEntity.ok(orderService.addOrder());
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
