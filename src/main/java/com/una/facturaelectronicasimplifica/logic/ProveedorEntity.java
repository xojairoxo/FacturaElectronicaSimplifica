package com.una.facturaelectronicasimplifica.logic;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "proveedor", schema = "facturaelectronicasimplifica", catalog = "")
public class ProveedorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_Proveedor")
    private String idProveedor;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Contrasena")
    private String contrasena;
    @Basic
    @Column(name = "CorreoElectronico")
    private String correoElectronico;
    @Basic
    @Column(name = "Telefono")
    private Integer telefono;
    @Basic
    @Column(name = "Direccion")
    private String direccion;

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedorEntity that = (ProveedorEntity) o;
        return Objects.equals(idProveedor, that.idProveedor) && Objects.equals(nombre, that.nombre) && Objects.equals(contrasena, that.contrasena) && Objects.equals(correoElectronico, that.correoElectronico) && Objects.equals(telefono, that.telefono) && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedor, nombre, contrasena, correoElectronico, telefono, direccion);
    }
}
