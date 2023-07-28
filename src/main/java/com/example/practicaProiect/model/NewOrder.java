package com.example.practicaProiect.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewOrder {
    private int eventId;
    private int ticketCategoryId;
    private int numberOfTickets;
}
