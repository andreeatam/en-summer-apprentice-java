package com.example.practicaProiect.controller;

import com.example.practicaProiect.Dto.AddOrderDTO;
import com.example.practicaProiect.Dto.OrderDto;
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
    public ResponseEntity<List<OrderDto>>getOrders(){
        int userID=3;
        List<OrderDto> allOrders=orderService.filteredOrdersByUserID(userID);
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody AddOrderDTO addOrderDTO) throws Exception {
        return orderService.createOrder(addOrderDTO);
    }

}
