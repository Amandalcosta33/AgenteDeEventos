package com.example.AgenteDeEventos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AgenteDeEventos.Domain.Address.Address;
import com.example.AgenteDeEventos.Service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public ResponseEntity<List<Address>> getAllAddress() throws Exception {
        List<Address> address = addressService.getAllAddress();
        return ResponseEntity.ok(address);
    }

}
