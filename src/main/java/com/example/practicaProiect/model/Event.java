package com.example.practicaProiect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="Event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventID;

    @ManyToOne
    @JoinColumn(name="VenueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name="EventTypeID")
    private EventType eventType;

    @Column(name="Name")
    private String name;

    @Column(name="Description")
    private String description;

    @Column(name="StartDate")
    private LocalDateTime startDate;

    @Column(name="EndDate")
    private LocalDateTime endDate;


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
}

