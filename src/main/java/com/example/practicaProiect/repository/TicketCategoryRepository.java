package com.example.practicaProiect.repository;

import com.example.practicaProiect.model.Order;
import com.example.practicaProiect.model.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory,Integer> {

   // List<TicketCategory> findAllTicketCategoryByID(Integer ticketCategoryID);
}
