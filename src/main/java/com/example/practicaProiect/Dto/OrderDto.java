package com.example.practicaProiect.Dto;

import com.example.practicaProiect.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class OrderDto {
    private LocalDateTime orderedAt;
    private TicketCategory ticketCategoryID;
    private int numberOfTickets;
    private Float totalPrice;
    private int eventID;

}
