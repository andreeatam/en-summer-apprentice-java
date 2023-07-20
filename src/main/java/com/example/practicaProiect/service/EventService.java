package com.example.practicaProiect.service;

import com.example.practicaProiect.model.Event;
import com.example.practicaProiect.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;


//mai trb ceva adnotari
@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents(){
       return eventRepository.findAllEvents();
    }

    public List<Event> getFilteredByVenue_EventType(int venueID, String nameType){
        return eventRepository.findByVenue_VenueIDAndEventType_Name(venueID,nameType);
    }

    public Event createEvent(Event newEvent){
        return eventRepository.save(newEvent);
    }
}
