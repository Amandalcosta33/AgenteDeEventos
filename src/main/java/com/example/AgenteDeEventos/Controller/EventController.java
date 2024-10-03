package com.example.AgenteDeEventos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AgenteDeEventos.DTO.Request.EventRequestDTO;
import com.example.AgenteDeEventos.Domain.Event.Event;
import com.example.AgenteDeEventos.Service.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public ResponseEntity createNewEvent(@RequestBody EventRequestDTO entity) throws Exception {

        Event newEvent = eventService.createNewEvent(entity);
        if (newEvent != null) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<Event>> getAllEvent() throws Exception {

        List<Event> newEvent = eventService.getAllEvent();
        return ResponseEntity.ok(newEvent);
    }
}
