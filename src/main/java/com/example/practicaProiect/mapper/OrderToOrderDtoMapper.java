package com.example.practicaProiect.mapper;

import com.example.practicaProiect.Dto.AddOrderDTO;
import com.example.practicaProiect.Dto.OrderDto;
import com.example.practicaProiect.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderDtoMapper {
    public OrderDto OrderToOrderDto(Order order) {
        OrderDto orderDto=new OrderDto();
        orderDto.setOrderedAt(order.getOrderedAt());
        orderDto.setNumberOfTickets(order.getNumberOfTickets());
        orderDto.setTicketCategoryID(order.getTicketCategory());
        orderDto.setTotalPrice(order.getTotalPrice());
        return orderDto;
    }
//    public Order AddOrderDtoToOrder(AddOrderDTO addOrderDTO){
//        Order orderDto=new Order();
//        orderDto.setNumberOfTickets(addOrderDTO.getNumberOfTickets());
//        orderDto.setTicketCategory(addOrderDTO.getTicketCategoryID());
//        return orderDto;
//    }
}
