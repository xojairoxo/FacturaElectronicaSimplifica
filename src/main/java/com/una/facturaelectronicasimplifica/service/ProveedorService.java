package com.una.facturaelectronicasimplifica.service;

import com.una.facturaelectronicasimplifica.data.ProveedorRepository;
import com.una.facturaelectronicasimplifica.logic.ProveedorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;
    public ProveedorService() {
    }
    public Iterable<ProveedorEntity> ProveedorFindAll() {
        return proveedorRepository.findAll();
    }
    public void proveedorSave(ProveedorEntity proveedor) {
        proveedorRepository.save(proveedor);
    }

    public ProveedorEntity proveedorFindById(String id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public void proveedorDeleteById(String id) {
        proveedorRepository.deleteById(id);
    }
}
