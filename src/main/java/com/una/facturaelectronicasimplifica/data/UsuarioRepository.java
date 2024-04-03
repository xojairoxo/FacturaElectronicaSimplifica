package com.una.facturaelectronicasimplifica.data;


import com.una.facturaelectronicasimplifica.logic.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,String> {
    UsuarioEntity findByContrasenaAndIdUsuario(String contrasena, String usuario);
    UsuarioEntity findByIdUsuario(String id);
}

