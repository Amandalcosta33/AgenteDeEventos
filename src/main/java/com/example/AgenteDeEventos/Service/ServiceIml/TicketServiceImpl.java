package com.example.AgenteDeEventos.Service.ServiceIml;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgenteDeEventos.DTO.Request.TicketRequestDTO;
import com.example.AgenteDeEventos.Domain.Event.Event;
import com.example.AgenteDeEventos.Domain.Ticket.Ticket;
import com.example.AgenteDeEventos.Repository.EventRepository;
import com.example.AgenteDeEventos.Repository.TicketRepository;
import com.example.AgenteDeEventos.Service.QrCodeService;
import com.example.AgenteDeEventos.Service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private QrCodeService qrCodeService;

    @Override
    public Ticket createNewTicket(TicketRequestDTO entity) throws Exception {
        try {

            if (entity.getCpf().length() != 11) {
                throw new Exception("CPF Inválido");
            }

            Event event = eventRepository.findById(entity.getEvent()).orElseThrow(() -> new Exception("Evento não encontrado"));
            String qrCode = qrCodeService.createNewQrCode();

            if (qrCode == null) {
                throw new Exception("QR CODE não foi gerado.");
            }

            Ticket ticket = new Ticket();
            ticket.setCpf(entity.getCpf());
            ticket.setEvent(event);
            ticket.setStatus((byte) 0);
            ticket.setQrcode_token(qrCode);

            ticketRepository.save(ticket);

            return ticket;
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public List<Ticket> GetAllStatusTicket(UUID event, byte status) throws Exception {
        try {
            List<Ticket> allSoldTickets = ticketRepository.findAllByStatusAndEvent(status, event);
            if (allSoldTickets.isEmpty()) {
                throw new Exception("Nenhum ticket encontrado.");
            }
            return allSoldTickets;
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Ticket getTicket(UUID event, String cpf) throws Exception {
        try {
            Ticket ticket = ticketRepository.findByCpfAndEvent(cpf, event);
            if (ticket == null) {
                throw new Exception("Nenhum ticket encontrado.");
            }
            return ticket;
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
