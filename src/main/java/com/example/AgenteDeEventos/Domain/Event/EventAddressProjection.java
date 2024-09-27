package com.example.AgenteDeEventos.Domain.Event;

import java.util.Date;

public interface EventAddressProjection {

    String getTitle();

    String getDescription();

    Date getDate();

    String getCity();

    String getState();

    String getCep();

    String getComplemento();

    String getAddress();
}
