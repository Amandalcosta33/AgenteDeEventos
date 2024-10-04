package com.example.AgenteDeEventos.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.AgenteDeEventos.Domain.Ticket.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {

    @Query("SELECT t FROM Ticket t")
    List<Ticket> findAllTicket();

    @Query("SELECT t FROM Ticket t WHERE t.status = :status and t.event = :event")
    List<Ticket> findAllByStatusAndEvent(@Param("status") Byte status, @Param("event") UUID event);

    @Query("SELECT t FROM Ticket t WHERE t.cpf = :cpf AND t.event = :event")
    Ticket findByCpfAndEvent(@Param("cpf") String cpf, @Param("event") UUID event);

}
