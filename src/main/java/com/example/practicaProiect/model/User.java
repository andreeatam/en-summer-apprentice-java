package com.example.practicaProiect.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;

    @Column(name="Name")
    private String name;

    @Column(name="Email")
    private String email;

    public User() {
    }

    public User(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

