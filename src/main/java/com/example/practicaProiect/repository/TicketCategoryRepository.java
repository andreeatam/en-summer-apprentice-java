package com.example.practicaProiect.repository;

import com.example.practicaProiect.model.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory,Integer> {

    List<TicketCategory> findAll();
//    List<TicketCategory> findTicketCategoriesByEvent_EventID(Integer eventID);
//    TicketCategory findTicketCategoriesByTicketCategoryID(Integer ticketCategoryID);

}
