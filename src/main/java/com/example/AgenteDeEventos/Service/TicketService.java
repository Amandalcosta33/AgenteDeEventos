package com.example.AgenteDeEventos.Service;

import java.util.List;
import java.util.UUID;

import com.example.AgenteDeEventos.DTO.Request.TicketRequestDTO;
import com.example.AgenteDeEventos.Domain.Ticket.Ticket;

public interface TicketService {

    public Ticket createNewTicket(TicketRequestDTO entity) throws Exception;

    public List<Ticket> GetAllStatusTicket(UUID event, byte status) throws Exception;

    public Ticket getTicket(UUID event, String cpf) throws Exception;
}
