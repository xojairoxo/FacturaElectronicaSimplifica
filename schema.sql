DROP DATABASE IF EXISTS FacturaElectronicaSimplifica;
CREATE DATABASE FacturaElectronicaSimplifica;
USE FacturaElectronicaSimplifica;


DROP table Proveedor;
CREATE TABLE Proveedor (
    id_proveedor INT auto_increment, 
    cedula VARCHAR(12) NOT NULL,
    nombre VARCHAR(100),
    usuario VARCHAR(100),
    contrasena VARCHAR(100),
    correo_electronico VARCHAR(100),
    telefono INTEGER,
    direccion VARCHAR(50),
    CONSTRAINT PK_proveedor PRIMARY KEY(id_proveedor)
);



CREATE TABLE Cliente (
 id_cliente VARCHAR(12) NOT NULL,
 proveedor_id VARCHAR(30),
 direccion VARCHAR(30), 
 nombre VARCHAR(255),
 tipo_cliente VARCHAR(30), -- físico y jurídico
 correo_electronico VARCHAR(30),
CONSTRAINT PK_Cliente PRIMARY KEY (id_Cliente),
CONSTRAINT FK_Proveedor FOREIGN KEY (proveedor_id) REFERENCES Proveedor (id_proveedor)
);
 
 CREATE TABLE Administrador (
  id_administrador VARCHAR(12) NOT NULL,
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

 
 

INSERT INTO Proveedor (id_proveedor, nombre, contrasena, correo_electronico, telefono, direccion)
VALUES ('PROV0001', 'Proveedor Uno', 'contrasena123', 'proveedor1@example.com', 1234567890, 'Calle Principal 123');
INSERT INTO Proveedor (id_proveedor, nombre, contrasena, correo_electronico, telefono, direccion)
VALUES ('PROV0002', 'Proveedor dos', 'contrasena124', 'proveedor2@example.com', 1234567899, 'Calle Principal 122');


