CREATE DATABASE FacturaElectronicaSimplifica;

USE FacturaElectronicaSimplifica;

create table Cliente (
  identificacion varchar(20) not null,
  nombre varchar(30) not null,
  Primary key(identificacion)
);

create table Poliza(
 numero integer auto_increment not null,
 placa varchar(10) not null,
 descripcion varchar(30),
 cliente varchar(20) not null,
 Primary key(numero)
);

alter table Poliza add foreign key (cliente) references Cliente(identificacion);

