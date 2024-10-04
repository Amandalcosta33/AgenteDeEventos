package com.example.AgenteDeEventos.DTO.Request;

import java.util.UUID;

public class TicketRequestDTO {

    private UUID event;
    private String cpf;
    private String name;
    private String email;

    // Construtor 
    public TicketRequestDTO(UUID event, String cpf, String name, String email) {
        this.event = event;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    // Getters
    public UUID getEvent() {
        return event;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setEvent(UUID event) {
        this.event = event;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
