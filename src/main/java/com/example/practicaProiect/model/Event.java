package com.example.practicaProiect.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Event")

public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventID;

    @ManyToOne
    @JoinColumn(name="VenueID")
    //@JsonIgnore
    private Venue venue;

    @ManyToOne
    @JoinColumn(name="EventTypeID")
    //@JsonIgnore
    private EventType eventType;

    @Column(name="Name")
    //@JsonIgnore
    private String name;

    @Column(name="Description")
    //@JsonIgnore
    private String description;

    @Column(name="StartDate")
    //@JsonIgnore
    private LocalDateTime startDate;

    @Column(name="EndDate")
    //@JsonIgnore
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "event")
    @JsonManagedReference
    private List<TicketCategory> ticketCategoryList;
    public Event() {
    }

    public Event(int eventID, Venue venueID, EventType eventTypeID, String name, String description, LocalDateTime startDate, LocalDateTime endDate) {
        this.eventID = eventID;
        this.venue = venueID;
        this.eventType = eventTypeID;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public List<TicketCategory> getTicketCategoryList() {
        return ticketCategoryList;
    }

    public void setTicketCategoryList(List<TicketCategory> ticketCategoryList) {
        this.ticketCategoryList = ticketCategoryList;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venueID) {
        this.venue = venueID;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventTypeID) {
        this.eventType = eventTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", venue=" + venue +
                ", eventType=" + eventType +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

