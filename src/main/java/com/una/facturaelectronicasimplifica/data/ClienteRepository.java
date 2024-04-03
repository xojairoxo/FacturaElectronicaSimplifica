package com.una.facturaelectronicasimplifica.data;

import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ClienteRepository extends JpaRepository<ClienteEntity,String> {
}