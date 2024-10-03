package com.example.AgenteDeEventos.Service.ServiceIml;

import java.util.UUID;
import org.springframework.stereotype.Service;

import com.example.AgenteDeEventos.Service.QrCodeService;

@Service
public class QrCodeServiceImpl implements QrCodeService {

    @Override
    public String createNewQrCode() {
        return UUID.randomUUID().toString();
    }

}
