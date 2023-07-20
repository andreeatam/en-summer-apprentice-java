package com.example.practicaProiect.service;

import com.example.practicaProiect.model.Order;
import com.example.practicaProiect.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAllOrders();
    }

    public List<Order> filteredOrdersByUserID(Integer userID){
        return orderRepository.findAllOrdersByUser_UserID(userID);
    }

    public Order createOrder(Order newOrder){
        return orderRepository.save(newOrder);
    }
}
