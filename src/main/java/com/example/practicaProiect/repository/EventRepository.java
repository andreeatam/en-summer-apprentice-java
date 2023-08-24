package com.example.practicaProiect.repository;

import com.example.practicaProiect.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    @Query("SELECT e FROM Event e")
    public List<Event> findAllEvents();

    List<Event> findByVenue_VenueIDAndEventType_Name(int venueID, String nameType);


    /* sau: @Query("SELECT e FROM Event e WHERE e.venue.venueId = :venue_id AND e.eventType.name = :type_name")
    List<Event> searchByVenueAndType(@Param("venue_id") int venue_id, @Param("type_name") String type_name);
    */




}
