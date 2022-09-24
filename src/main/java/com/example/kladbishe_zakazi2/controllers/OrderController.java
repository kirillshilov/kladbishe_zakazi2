package com.example.kladbishe_zakazi2.controllers;

import com.example.kladbishe_zakazi2.model.Order;
import com.example.kladbishe_zakazi2.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

// Show all orders
    @GetMapping
    public Collection <Order> getAllOrder() {
        return orderService.getAllOrders();
    }

// findOrders By Param
    @GetMapping("{text}")
    public Collection <Order> getOrderByData(@PathVariable String textForSearch) {
        return orderService.getOrderByString(textForSearch);
    }

// Save Order
    @PostMapping("/add")
    public ResponseEntity addOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.addOrder(order));
    }

// Change Order,  create new custom Exception 404 if Order not found
    @PutMapping("/change")
    public ResponseEntity changeOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.changeOrder(order));
    }

    // Delete Order,  create new custom Exception 404 if Order not found
    @DeleteMapping("/delete")
    public ResponseEntity deleteOrder(@RequestParam Long id) {
        return ResponseEntity.ok(orderService.deleteOrder(id));
    }

}
