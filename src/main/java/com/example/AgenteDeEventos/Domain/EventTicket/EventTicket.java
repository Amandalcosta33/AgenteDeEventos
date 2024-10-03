package com.example.AgenteDeEventos.Domain.EventTicket;

import java.util.Date;
import java.util.UUID;

import com.example.AgenteDeEventos.Domain.Event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "event_tickets")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventTicket {

    @Id
    @GeneratedValue
    private UUID event_tickets_id;
    private int total_tickets;
    private Date date_created;
    private Date date_updated;

    @ManyToOne
    @JoinColumn(name = "event")
    private Event event;
}
