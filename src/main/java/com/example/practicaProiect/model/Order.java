package com.example.practicaProiect.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderID;

    @ManyToOne
    @JoinColumn(name="UserID")
    private User user;

    @ManyToOne
    @JoinColumn(name="TicketCategoryID")
    private TicketCategory ticketCategory;

    @Column(name="OrderedAt")
    private Date orderedAt;

    @Column(name="NumberOfTickets")
    private float numberOfTickets;

    @Column(name="TotalPrice")
    private float totalPrice;

    public Order() {
    }

    public Order(int orderID, User userID, TicketCategory ticketCategoryID, Date orderedAt, float numberOfTickets, float totalPrice) {
        this.orderID = orderID;
        this.user = userID;
        this.ticketCategory = ticketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User userID) {
        this.user = userID;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategoryID) {
        this.ticketCategory = ticketCategoryID;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public float getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(float numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}

