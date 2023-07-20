package com.example.practicaProiect.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventTypeID;

    @Column(name="Name")
    private String name;

    public EventType() {
    }

    public EventType(int eventTypeID, String name) {
        this.eventTypeID = eventTypeID;
        this.name = name;
    }

    public int getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

