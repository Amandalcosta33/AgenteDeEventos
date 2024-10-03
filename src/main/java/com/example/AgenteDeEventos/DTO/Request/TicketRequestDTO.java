package com.example.AgenteDeEventos.DTO.Request;

import java.util.UUID;

public class TicketRequestDTO {

    private UUID event;
    private String cpf;

    // Construtor 
    public TicketRequestDTO(UUID event, String cpf) {
        this.event = event;
        this.cpf = cpf;
    }

    // Getters
    public UUID getEvent() {
        return event;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setEvent(UUID event) {
        this.event = event;
    }

    public void setCpg(String cpf) {
        this.cpf = cpf;
    }
}
