package com.example.practicaProiect.controller;

import com.example.practicaProiect.Dto.EventDTO;
import com.example.practicaProiect.model.Event;
import com.example.practicaProiect.repository.EventRepository;
import com.example.practicaProiect.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")

public class EventController {

   private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/event")
    public List<Event> getAllEvents(@RequestParam (name="venueId") int newVenueID, @RequestParam(name="eventType") String eventTypeName){
        return eventService.eventFind(newVenueID,eventTypeName);
    }

    @GetMapping("/allEvents")
    public List<Event> getAllEventsFromBD(){
        return eventService.getAllEvents();
    }

    @PostMapping("/createEvent")
    public Event createNewEvent(@RequestBody Event newEvent) {
        return eventService.createEvent(newEvent);
    }

    @GetMapping("/event/findBy")
    public List<EventDTO> eventFindBy(@RequestParam int venueID, @RequestParam String eventTypeName){
        List<Event> events= eventService.eventFind(venueID, eventTypeName);
        return events.stream().map(EventService::eventFindBy).collect(Collectors.toList());
    }


}
