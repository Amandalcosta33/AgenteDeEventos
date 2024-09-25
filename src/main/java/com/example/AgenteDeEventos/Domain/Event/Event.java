package com.example.AgenteDeEventos.Domain.Event;

import java.util.Date;
import java.util.UUID;

import com.example.AgenteDeEventos.Domain.Address.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tickets")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue
    private UUID event_id;

    private String title;
    private String description;
    private Date date;
    private byte status;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
