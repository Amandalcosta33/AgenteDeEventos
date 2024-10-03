package com.example.AgenteDeEventos.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AgenteDeEventos.DTO.Request.TicketRequestDTO;
import com.example.AgenteDeEventos.Domain.Ticket.Ticket;
import com.example.AgenteDeEventos.Service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public ResponseEntity createNewTicket(@RequestBody TicketRequestDTO entity) throws Exception {

        Ticket newEvent = ticketService.createNewTicket(entity);
        if (newEvent != null) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping("/list/{status}/{event}")
    public ResponseEntity<List<Ticket>> GetAllStatusTicket(@PathVariable byte status, @PathVariable UUID event) throws Exception {
        List<Ticket> allSoldTickets = ticketService.GetAllStatusTicket(event, status);
        return ResponseEntity.ok(allSoldTickets);
    }

    @GetMapping("/{cpf}/{event}")
    public ResponseEntity<Ticket> getTicket(@PathVariable String cpf, @PathVariable UUID event) throws Exception {
        Ticket ticket = ticketService.getTicket(event, cpf);
        return ResponseEntity.ok(ticket);
    }
}
