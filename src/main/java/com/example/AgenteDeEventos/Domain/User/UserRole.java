package com.example.AgenteDeEventos.Domain.User;

public enum UserRole {
    MOD("mod"), // Event Owner
    ADMIN("admin"), // Application Owner
    USER("user"); // QR Code Reader and Event Entry Confirming User

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
