package com.example.AgenteDeEventos.DTO.Request;

import java.util.Date;

public class EventRequestDTO {

    private String title;
    private String description;
    private Date date;
    private String city;
    private String state;
    private String cep;
    private String complemento;
    private String address;

    // Construtor
    public EventRequestDTO(String title, String description, Date date, String city, String state, String cep, String complemento, String address) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.complemento = complemento;
        this.address = address;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
