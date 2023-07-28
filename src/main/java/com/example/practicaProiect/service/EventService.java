package com.example.practicaProiect.service;

import com.example.practicaProiect.Dto.EventDTO;
import com.example.practicaProiect.Dto.TicketCategoryDTO;
import com.example.practicaProiect.Dto.VenueDTO;
import com.example.practicaProiect.model.Event;
import com.example.practicaProiect.model.TicketCategory;
import com.example.practicaProiect.repository.EventRepository;
import com.example.practicaProiect.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAllEvents();
    }

    public List<Event> eventFind(int venueID, String nameType){
        return eventRepository.findByVenue_VenueIDAndEventType_Name(venueID,nameType);
    }

    public Event createEvent(Event newEvent){
        return eventRepository.save(newEvent);
    }

    public static EventDTO eventFindBy(Event event) {
        EventDTO eventDTO= new EventDTO();
        eventDTO.setEventID(event.getEventID());
        eventDTO.setEventName(event.getName());
        eventDTO.setEventDescription(event.getDescription());
        eventDTO.setVenueDTO(new VenueDTO(event.getVenue()));
        eventDTO.setStartDate(event.getStartDate());
        eventDTO.setEndDate(event.getEndDate());
        
        List<TicketCategoryDTO> ticketCategoryDTOs=new ArrayList<>();

        for(TicketCategory t:event.getTicketCategoryList()){
            TicketCategoryDTO ticketCategoryDTO=new TicketCategoryDTO();
            ticketCategoryDTO=ticketCategoryDTO.conversion(t);
            ticketCategoryDTOs.add(ticketCategoryDTO);
        }
        eventDTO.setTicketCategoryDTOList(ticketCategoryDTOs);
        return eventDTO;
    }
}
