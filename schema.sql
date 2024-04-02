DROP DATABASE IF EXISTS FacturaElectronicaSimplifica;
CREATE DATABASE FacturaElectronicaSimplifica;
USE FacturaElectronicaSimplifica;



CREATE TABLE Proveedor (
ID_Proveedor VARCHAR(12) NOT NULL, 
Nombre VARCHAR(100),
Contrasena VARCHAR(100),
CorreoElectronico VARCHAR(100),
Telefono integer,
Direccion varchar(50),
constraint PK_proveedor primary key(ID_Proveedor)
 ); 


CREATE TABLE Cliente (
 id_Cliente VARCHAR(12) NOT NULL,
 idProveedor VARCHAR(30),
 direccion VARCHAR(30), 
 nombre VARCHAR(255),
 tipoCliente VARCHAR(30), -- físico y jurídico
 correoElectronico VARCHAR(30),
CONSTRAINT PK_Cliente PRIMARY KEY (id_Cliente),
CONSTRAINT FK_Proveedor FOREIGN KEY (id_Proveedor) REFERENCES Proveedor (id_Proveedor)
);
 
 CREATE TABLE Administrador (
  id_Administrador VARCHAR(12) NOT NULL,
  contrasena VARCHAR(20) NOT NULL
);

-- CREATE TABLE Factura (
--   idFactura INT PRIMARY KEY AUTO_INCREMENT,
--   numeroFactura VARCHAR(20),
--   fechaEmision DATE,
--   nombreCliente VARCHAR(100),
--   detalles TEXT,
--   total DECIMAL(10, 2),
--   idProveedor INT,
--   FOREIGN KEY (idProveedor) REFERENCES Proveedor(idProveedor)
-- );

-- CREATE TABLE Producto (
--   idProducto INT PRIMARY KEY AUTO_INCREMENT,
--   nombre VARCHAR(100),
--   descripcion TEXT,
--   precio DECIMAL(10, 2),
--   impuestosAplicables DECIMAL(5, 2),
--   categoria VARCHAR(50)
-- );

 
 

INSERT INTO Proveedor (id_Proveedor, Nombre, Contrasena, CorreoElectronico, Telefono, Direccion)
VALUES ('PROV0001', 'Proveedor Uno', 'contrasena123', 'proveedor1@example.com', 1234567890, 'Calle Principal 123');
INSERT INTO Proveedor (id_Proveedor, Nombre, Contrasena, CorreoElectronico, Telefono, Direccion)
VALUES ('PROV0002', 'Proveedor dos', 'contrasena124', 'proveedor2@example.com', 1234567899, 'Calle Principal 122');


