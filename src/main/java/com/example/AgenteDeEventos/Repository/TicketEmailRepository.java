package com.example.AgenteDeEventos.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AgenteDeEventos.Domain.TicketEmail.*;

public interface TicketEmailRepository extends JpaRepository<TicketEmail, UUID> {

}
