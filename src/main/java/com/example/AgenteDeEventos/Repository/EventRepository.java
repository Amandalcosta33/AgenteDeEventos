package com.example.AgenteDeEventos.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.AgenteDeEventos.Domain.Event.Event;

public interface EventRepository extends JpaRepository<Event, UUID> {

    @Query("SELECT e FROM Event e")
    List<Event> findAllEvent();

    @Query("SELECT e FROM Event e WHERE e.id = :event_id")
    Event findAllById(@Param("event_id") UUID event_id);

}
