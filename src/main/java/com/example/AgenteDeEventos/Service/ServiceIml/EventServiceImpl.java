package com.example.AgenteDeEventos.Service.ServiceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgenteDeEventos.DTO.Request.EventRequestDTO;
import com.example.AgenteDeEventos.Domain.Address.Address;
import com.example.AgenteDeEventos.Domain.Event.Event;
import com.example.AgenteDeEventos.Domain.EventTicket.EventTicket;
import com.example.AgenteDeEventos.Repository.AddressRepository;
import com.example.AgenteDeEventos.Repository.EventRepository;
import com.example.AgenteDeEventos.Repository.EventTicketRepository;
import com.example.AgenteDeEventos.Service.EventService;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EventTicketRepository eventTicket;

    @Override
    public Event createNewEvent(EventRequestDTO entity) throws Exception {
        try {
            // Create and save the Address
            Address address = new Address();
            address.setCep(entity.getCep());
            address.setCity(entity.getCity());
            address.setAddress(entity.getAddress());
            address.setComplemento(entity.getComplemento());
            address.setUf(entity.getState());
            addressRepository.save(address);

            // Create and save the Event
            Event event = new Event();
            event.setTitle(entity.getTitle());
            event.setDescription(entity.getDescription());
            event.setDate(entity.getDate());
            event.setAddress(address);
            eventRepository.save(event);

            //Create and save the total tickets for the event
            EventTicket totalTicket = new EventTicket();
            totalTicket.setEvent(event);
            totalTicket.setTotal_tickets(entity.getTotalTickets());
            eventTicket.save(totalTicket);

            return event;
        } catch (Exception ex) {

            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public List<Event> getAllEvent() throws Exception {
        try {
            return eventRepository.findAllEvent();

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
