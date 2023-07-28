package com.example.practicaProiect.Dto;

import com.example.practicaProiect.model.Venue;

public class VenueDTO {
    public VenueDTO() {
    }

    private int venueID;
    private String location;
    private String type;
    private int capacity;

    public VenueDTO(Venue venue)
    {
        this.venueID=venue.getVenueID();
        this.location=venue.getLocation();
        this.type=venue.getType();
        this.capacity=venue.getCapacity();
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
}
