package com.una.facturaelectronicasimplifica.service;

import com.una.facturaelectronicasimplifica.data.ClienteRepository;
//import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service("service")
public class Service {

    @Autowired
    private ClienteRepository clienteRepository;


    public Iterable<ClienteEntity> clienteFindALL() {
        return clienteRepository.findAll();
    }



}