package com.example.AgenteDeEventos.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.AgenteDeEventos.Domain.EventTicket.EventTicket;

public interface EventTicketRepository extends JpaRepository<EventTicket, UUID> {

    @Query("SELECT e FROM EventTicket e")
    List<EventTicket> findAllEventTicket();

}
