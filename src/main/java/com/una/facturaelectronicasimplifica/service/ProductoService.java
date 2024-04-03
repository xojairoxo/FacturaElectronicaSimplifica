package com.una.facturaelectronicasimplifica.service;
import com.una.facturaelectronicasimplifica.data.ProductoRepository;
import com.una.facturaelectronicasimplifica.logic.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Iterable<ProductoEntity> productoFindAll(){
        return productoRepository.findAll();
    }

    public void productoSave(ProductoEntity producto){
        productoRepository.save(producto);
    }


}