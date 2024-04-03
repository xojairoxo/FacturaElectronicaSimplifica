package com.una.facturaelectronicasimplifica.data;
import com.una.facturaelectronicasimplifica.logic.ProductoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public interface ProductoRepository extends JpaRepository<ProductoEntity,Integer> {
}