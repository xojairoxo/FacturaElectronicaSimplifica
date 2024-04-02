package com.una.facturaelectronicasimplifica.data;

import com.una.facturaelectronicasimplifica.logic.ProveedorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository<ProveedorEntity, String> {
}
