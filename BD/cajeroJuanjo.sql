CREATE DATABASE cajeroJuanjo;
USE cajeroJuanjo;

-- Tablas --
CREATE TABLE clientes (
    id int(5) NOT NULL,
    numtarjeta int(16) NOT NULL,
    nombre varchar(30) NOT NULL,
    direccion varchar(40) NOT NULL
);
CREATE TABLE bajas (
    id_baja int(5) NOT NULL,
    cliente int(5) NOT NULL,
    motivo varchar(50),
    observaciones varchar(100)
);
CREATE TABLE movimientos (
    id_movimiento int(5) NOT NULL,
    id_cliente varchar(5) NOT NULL,
    tipo varchar(20) NOT NULL,
    importe double NOT NULL,
    fecha date NOT NULL,
);
CREATE TABLE tarjetas (
    numero int(16) NOT NULL,
    propietario int(5) NOT NULL,
    pin int(4) NOT NULL,
    saldo double(10) NOT NULL
);

-- Restricciones --
ALTER TABLE clientes ADD CONSTRAINT pk_id PRIMARY KEY(id);
ALTER TABLE bajas ADD CONSTRAINT pk_idbajas PRIMARY KEY(id_baja);
ALTER TABLE movimientos ADD CONSTRAINT pk_idmovimiento PRIMARY KEY(id_movimiento);
ALTER TABLE tarjetas ADD CONSTRAINT pk_numero PRIMARY KEY(numero);

ALTER TABLE clientes ADD CONSTRAINT fk_numtarjeta FOREIGN KEY(numtarjeta) REFERENCES tarjetas(numero);
ALTER TABLE bajas ADD CONSTRAINT fk_cliente FOREIGN KEY(cliente) REFERENCES clientes(id);
ALTER TABLE movimientos ADD CONSTRAINT fk_idcliente FOREIGN KEY(id_cliente) REFERENCES clientes(id);
ALTER TABLE tarjetas ADD CONSTRAINT fk_propietario FOREIGN KEY(propietario) REFERENCES clientes(id);

-- Datos --
INSERT INTO clientes (id, numtarjeta, nombre, direccion) VALUES
(101, 4485769012345678, 'Juan Perez', 'Calle Principal nº12'),
(102, 4916319823456789, 'Maria Rodriguez', 'Avenida Central nº2 1ºA'),
(103, 4567890123456789, 'Pedro Sanchez', 'Plaza Mayor nº32'),
(104, 4556129734567890, 'Laura Gomez', 'Calle Secundaria nº1 3ºC'),
(105, 4532890176543210, 'Carlos Lopez', 'Avenida Norte nº20');

INSERT INTO tarjeta (numero, propietario, pin, saldo) VALUES
(4485769012345678, 101, 4321, 1000.30),
(4916319823456789, 102, 8765, 2500.50),
(4567890123456789, 103, 2109, 500.25),
(4556129734567890, 104, 6543, 150.75),
(4532890176543210, 105, 0987, 3800.00);

INSERT INTO movimiento (id_movimiento, id_cliente, tipo, importe, fecha) VALUES
(111, "101", "Ingreso", 50.00, '2023-05-15'),
(222, "101", "Retiro", 100.00, '2023-05-18'),
(333, "103", "Transferencia", 200.00, '2023-05-20'),
(444, "102", "Retiro", 75.00, '2023-05-22'),
(555, "105", "Ingreso", 30.00, '2023-05-25');

-- La tabla bajas viene sin datos predefinidos ya que se empiezan a añadir datos cuando se da la orden --

