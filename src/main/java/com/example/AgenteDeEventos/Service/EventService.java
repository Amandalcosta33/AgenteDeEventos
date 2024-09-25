package com.example.AgenteDeEventos.Service;

import com.example.AgenteDeEventos.DTO.Request.EventRequestDTO;
import com.example.AgenteDeEventos.Domain.Event.Event;

public interface EventService {

    Event createNewEvent(EventRequestDTO entity) throws Exception;
}
