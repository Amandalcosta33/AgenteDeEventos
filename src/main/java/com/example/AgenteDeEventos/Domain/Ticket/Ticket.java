package com.example.AgenteDeEventos.Domain.Ticket;

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

@Table(name = "ticket")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue
    private UUID ticket_id;
    private String qrcode_token;
    private String cpf;
    private Byte status;
    private Date date_created;
    private Date date_updated;
    private String name;

    @ManyToOne
    @JoinColumn(name = "event")
    private Event event;

}
