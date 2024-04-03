package com.una.facturaelectronicasimplifica.service;
import com.una.facturaelectronicasimplifica.data.ClienteRepository;
import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public Iterable<ClienteEntity> clienteFindAll(){
        return clienteRepository.findAll();
    }

    public void clienteSave(ClienteEntity cliente){
        clienteRepository.save(cliente);
    }

}
