package com.una.facturaelectronicasimplifica.logic;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "proveedor", schema = "facturaelectronicasimplifica", catalog = "")
public class ProveedorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_proveedor")
    private String idProveedor;
    @Basic
    @Column(name = "cedula")
    private String cedula;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "usuario")
    private String usuario;
    @Basic
    @Column(name = "contrasena")
    private String contrasena;
    @Basic
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Basic
    @Column(name = "telefono")
    private Integer telefono;
    @Basic
    @Column(name = "direccion")
    private String direccion;

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        return Objects.equals(idProveedor, that.idProveedor) && Objects.equals(cedula, that.cedula) && Objects.equals(nombre, that.nombre) && Objects.equals(usuario, that.usuario) && Objects.equals(contrasena, that.contrasena) && Objects.equals(correoElectronico, that.correoElectronico) && Objects.equals(telefono, that.telefono) && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedor, cedula, nombre, usuario, contrasena, correoElectronico, telefono, direccion);
    }
}
