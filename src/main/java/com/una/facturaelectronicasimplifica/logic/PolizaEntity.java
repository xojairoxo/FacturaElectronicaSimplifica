package com.una.facturaelectronicasimplifica.logic;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "poliza", schema = "facturaelectronicasimplifica", catalog = "")
public class PolizaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numero")
    private int numero;
    @Basic
    @Column(name = "placa")
    private String placa;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "cliente", referencedColumnName = "identificacion", nullable = false)
    private ClienteEntity clienteByCliente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolizaEntity that = (PolizaEntity) o;
        return numero == that.numero && Objects.equals(placa, that.placa) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, placa, descripcion);
    }

    public ClienteEntity getClienteByCliente() {
        return clienteByCliente;
    }

    public void setClienteByCliente(ClienteEntity clienteByCliente) {
        this.clienteByCliente = clienteByCliente;
    }
}
