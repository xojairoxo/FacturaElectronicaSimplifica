package com.una.facturaelectronicasimplifica.service;
import com.una.facturaelectronicasimplifica.data.UsuarioRepository;
import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import com.una.facturaelectronicasimplifica.logic.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository proveedorRepository;
    List<ClienteEntity> clientes;
    public Iterable<UsuarioEntity> proveedorFindAll(){
        return proveedorRepository.findAll();
    }
    public boolean proveedorLogin(String usuario, String contrasena){
        return proveedorRepository.findByContrasenaAndIdUsuario(contrasena, usuario) != null;
    }
    public void proveedorSave(UsuarioEntity proveedor){
        proveedorRepository.save(proveedor);
    }
    public UsuarioEntity proveedorById(String id){
      return  proveedorRepository.findByIdUsuario(id);
    }

}
