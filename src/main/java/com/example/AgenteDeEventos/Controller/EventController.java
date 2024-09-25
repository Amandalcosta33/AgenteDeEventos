package com.example.AgenteDeEventos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AgenteDeEventos.DTO.Request.EventRequestDTO;
import com.example.AgenteDeEventos.Domain.Event.Event;
import com.example.AgenteDeEventos.Service.EventService;

@RestController
@RequestMapping("/api/user")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<Event> postMethodName(@RequestBody EventRequestDTO entity) throws Exception {

        Event newEvent = eventService.createNewEvent(entity);
        return ResponseEntity.ok(newEvent);
    }
}
