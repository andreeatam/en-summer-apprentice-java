package com.example.practicaProiect.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Table(name="Orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int orderID;

    @ManyToOne
    @JoinColumn(name="UserID")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name="TicketCategoryID")
    private TicketCategory ticketCategory;

    @Column(name="OrderedAt")
    private LocalDateTime orderedAt;

    @Column(name="NumberOfTickets")
    private int numberOfTickets;

    @Column(name="TotalPrice")
    private float totalPrice;

    public Order() {
    }

    public Order(int orderID,User userID, TicketCategory ticketCategoryID, LocalDateTime orderedAt, int numberOfTickets, float totalPrice) {
        this.user = userID;
        this.orderID=orderID;
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

    public void setUser(Optional<User> user) {
        this.user = user.get();
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategoryID) {
        this.ticketCategory = ticketCategoryID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", user=" + user +
                ", ticketCategory=" + ticketCategory +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

