package com.una.facturaelectronicasimplifica.logic;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "facturaelectronicasimplifica", catalog = "")
public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "identificacion")
    private String identificacion;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "clienteByCliente")
    private Collection<PolizaEntity> polizasByIdentificacion;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return Objects.equals(identificacion, that.identificacion) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion, nombre);
    }

    public Collection<PolizaEntity> getPolizasByIdentificacion() {
        return polizasByIdentificacion;
    }

    public void setPolizasByIdentificacion(Collection<PolizaEntity> polizasByIdentificacion) {
        this.polizasByIdentificacion = polizasByIdentificacion;
    }
}
