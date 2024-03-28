package com.una.facturaelectronicasimplifica.data;



import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity,String> {

}
