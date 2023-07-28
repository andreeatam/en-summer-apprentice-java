package com.example.practicaProiect.Dto;

import com.example.practicaProiect.model.Event;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonSerialize
public class EventDTO {
    public EventDTO() {
    }

    private int eventID;
    private String eventDescription;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<TicketCategoryDTO> ticketCategoryDTOList;

    private VenueDTO venueDTO;

    public EventDTO(Event event) {
        this.eventID = event.getEventID();
        this.eventDescription = event.getDescription();
        this.eventName = event.getName();
        this.startDate = event.getStartDate();
        this.endDate = event.getEndDate();
        this.venueDTO = new VenueDTO();
        this.ticketCategoryDTOList = new ArrayList<>();
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategoryDTO> getTicketCategoryDTOList() {
        return ticketCategoryDTOList;
    }

    public void setTicketCategoryDTOList(List<TicketCategoryDTO> ticketCategoryDTOList) {
        this.ticketCategoryDTOList = ticketCategoryDTOList;
    }

    public VenueDTO getVenueDTO() {
        return venueDTO;
    }

    public void setVenueDTO(VenueDTO venueDTO) {
        this.venueDTO = venueDTO;
    }
}
