package com.example.AgenteDeEventos.Domain.Status;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "ticket_status")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketStatus {

    @Id
    @GeneratedValue
    private UUID ticket_status_id;
    private String description;
    private Date date_created;
}
