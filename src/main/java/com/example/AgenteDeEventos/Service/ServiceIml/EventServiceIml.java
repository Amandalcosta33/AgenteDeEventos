package com.example.AgenteDeEventos.Service.ServiceIml;

import com.example.AgenteDeEventos.DTO.Request.EventRequestDTO;
import com.example.AgenteDeEventos.Domain.Event.Event;
import com.example.AgenteDeEventos.Service.EventService;

public class EventServiceIml implements EventService {

    @Override
    public Event createNewEvent(EventRequestDTO entity) throws Exception {

        try {

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNewEvent'");
    }

}
