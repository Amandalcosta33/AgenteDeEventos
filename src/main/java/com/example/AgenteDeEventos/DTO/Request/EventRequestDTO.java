package com.example.AgenteDeEventos.DTO.Request;

import java.util.Date;

public record EventRequestDTO(String title, String description, Date date, String city, String state, String cep, String complemento, String address) {

}
