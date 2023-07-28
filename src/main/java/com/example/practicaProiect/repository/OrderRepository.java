package com.example.practicaProiect.repository;

import com.example.practicaProiect.Dto.OrderDto;
import com.example.practicaProiect.model.Event;
import com.example.practicaProiect.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer> {

    @Query("SELECT o FROM Order o")
    public List<OrderDto> findAllOrders();

    public List<Order> findAllOrdersByUser_UserID(Integer userID);
}
