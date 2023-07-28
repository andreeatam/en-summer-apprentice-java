package com.example.practicaProiect.service;

import com.example.practicaProiect.Dto.AddOrderDTO;
import com.example.practicaProiect.Dto.OrderDto;
import com.example.practicaProiect.mapper.OrderToOrderDtoMapper;
import com.example.practicaProiect.model.Order;
import com.example.practicaProiect.model.TicketCategory;
import com.example.practicaProiect.repository.OrderRepository;
import com.example.practicaProiect.repository.TicketCategoryRepository;
import com.example.practicaProiect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private TicketCategoryRepository ticketCategoryRepository;
    private OrderToOrderDtoMapper orderToOrderDtoMapper;

    private UserRepository userRepository;

    public OrderService(UserRepository userRepository, OrderRepository orderRepository, OrderToOrderDtoMapper orderToOrderDtoMapper, TicketCategoryRepository ticketCategoryRepository) {
        this.orderRepository = orderRepository;
        this.orderToOrderDtoMapper = orderToOrderDtoMapper;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.userRepository = userRepository;
    }

    public List<OrderDto> getAllOrders() {
        return orderRepository.findAllOrders();
    }

    public List<OrderDto> filteredOrdersByUserID(Integer userID) {
        List<OrderDto> list = new ArrayList<>();
        orderRepository.findAll().forEach(order -> {
            list.add(orderToOrderDtoMapper.OrderToOrderDto(order));
        });
        return list;
    }

    public Order createOrder(AddOrderDTO newOrder) throws Exception {
        Order order = new Order();

        Optional<TicketCategory> ticketCategory = ticketCategoryRepository.findById(newOrder.getTicketCategoryID());
        if (ticketCategory.isEmpty()) {
            throw new Exception("Ticket category not valid!");
        } else {
            order.setTicketCategory(ticketCategory.get());
            order.setNumberOfTickets(newOrder.getNumberOfTickets());

            float totalPrice = order.getNumberOfTickets() * ticketCategory.get().getPrice();
            order.setTotalPrice(totalPrice);

            order.setOrderedAt(LocalDate.now().atStartOfDay());
            if (userRepository.findById(1).isEmpty()) {
                throw new Exception("User does not exist!");
            } else {
                order.setUser(userRepository.findById(1));
                return orderRepository.save(order);
            }
        }
    }

}


























/*

    //mai trb cele de jos?
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public List<Order> filteredOrdersByUserID(Integer userID){
        return orderRepository.findAllOrdersByUser_UserID(userID);
    }

    public Order createOrder(Order newOrder){
        return orderRepository.save(newOrder);
    }
    */
