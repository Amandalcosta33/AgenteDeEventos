package com.example.AgenteDeEventos.Service;

import java.util.List;

import com.example.AgenteDeEventos.Domain.Address.Address;

public interface AddressService {

    public List<Address> getAllAddress() throws Exception;
}
