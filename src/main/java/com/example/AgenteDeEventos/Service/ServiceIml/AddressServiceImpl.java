package com.example.AgenteDeEventos.Service.ServiceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgenteDeEventos.Domain.Address.Address;
import com.example.AgenteDeEventos.Repository.AddressRepository;
import com.example.AgenteDeEventos.Service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddress() throws Exception {
        try {
            return addressRepository.findAllAddresses();

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
