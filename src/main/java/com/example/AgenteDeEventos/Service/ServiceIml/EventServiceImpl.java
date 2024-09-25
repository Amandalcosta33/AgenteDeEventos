package com.example.AgenteDeEventos.Service.ServiceIml;

import org.springframework.stereotype.Service;

import com.example.AgenteDeEventos.DTO.Request.EventRequestDTO;
import com.example.AgenteDeEventos.Domain.Event.Event;
import com.example.AgenteDeEventos.Service.EventService;

@Service
public class EventServiceImpl implements EventService {

    @Override
    public Event createNewEvent(EventRequestDTO entity) throws Exception {
        //TODO: Ajuste de logica e validações dentro do service, hoje finalizei desse jeito só para que rode.
        Event event = new Event();
        event.setTitle(entity.getTitle());
        event.setDescription(entity.getDescription());
        event.setDate(entity.getDate());

        return event;
    }
}
