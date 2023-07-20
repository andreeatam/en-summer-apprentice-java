package com.example.practicaProiect.repository;

import com.example.practicaProiect.model.EventType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventTypeRepository extends CrudRepository <EventType,Integer> {

    //List<EventType> findAllEventTypeByID(Integer eventTypeID);
}
