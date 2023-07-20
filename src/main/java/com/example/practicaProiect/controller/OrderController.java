package com.example.practicaProiect.controller;

import com.example.practicaProiect.model.Event;
import com.example.practicaProiect.model.Order;
import com.example.practicaProiect.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")

public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>>getOrders(){
        int userID=3;
        List<Order> allOrders=orderService.filteredOrdersByUserID(userID);
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }

    @PostMapping("/createOrder")
    public Order craeteOrder(@RequestBody Order newOrder){
        return orderService.createOrder(newOrder);
    }

}
