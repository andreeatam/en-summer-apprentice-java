package com.example.practicaProiect.Dto;

import com.example.practicaProiect.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class AddOrderDTO {
    private int eventId;
    private int ticketCategoryID;
    private int numberOfTickets;

}
