package com.example.practicaProiect.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="Venue")
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueID;

    @Column(name="Location")
    private String location;

    @Column(name="Type")
    private String type;

    @Column(name="Capacity")
    private int capacity;

    public Venue() {
    }

    public Venue(int venueID, String location, String type, int capacity) {
        this.venueID = venueID;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

