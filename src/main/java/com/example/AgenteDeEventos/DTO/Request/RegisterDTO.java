package com.example.AgenteDeEventos.DTO.Request;

import com.example.AgenteDeEventos.Domain.User.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

}
