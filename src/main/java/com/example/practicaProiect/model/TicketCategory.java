package com.example.practicaProiect.model;

import jakarta.persistence.*;


@Entity
@Table(name="TicketCategory")
public class TicketCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TicketCategoryID;

    @ManyToOne
    @JoinColumn(name="EventID")
    private Event event;

    @Column(name="Description")
    private String description;

    @Column(name="Price")
    private Float price;

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, Event eventID, String description, Float price) {
        TicketCategoryID = ticketCategoryID;
        this.event = eventID;
        this.description = description;
        this.price = price;
    }

    public int getTicketCategoryID() {
        return TicketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        TicketCategoryID = ticketCategoryID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event eventID) {
        this.event = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
