CREATE DATABASE cajeroJuanjo;
USE cajeroJuanjo;

CREATE TABLE clientes (
    id int(5) NOT NULL,
    numtarjeta int(4) NOT NULL,
    IBAN varchar(7) NOT NULL,
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
    id_cliente int(5) NOT NULL,
    tipo varchar(20) NOT NULL,
    importe double(10,2) NOT NULL,
    fecha date NOT NULL
);
CREATE TABLE tarjetas (
    numero int(4) NOT NULL,
    propietario int(5) NOT NULL,
    pin int(4) NOT NULL,
    saldo double(10,2) NOT NULL
);

ALTER TABLE clientes ADD CONSTRAINT pk_id PRIMARY KEY(id);
ALTER TABLE bajas ADD CONSTRAINT pk_idbajas PRIMARY KEY(id_baja);
ALTER TABLE movimientos ADD CONSTRAINT pk_idmovimiento PRIMARY KEY(id_movimiento);
ALTER TABLE tarjetas ADD CONSTRAINT pk_numero PRIMARY KEY(numero);


INSERT INTO clientes (id, numtarjeta, IBAN, nombre, direccion) VALUES
(101,4485,'ES91210','Juan Perez','Calle Principal nº12'),
(102,4916,'ES91001','Maria Rodriguez','Avenida Central nº2 1ºA'),
(103,4567,'ES91208','Pedro Sanchez','Plaza Mayor nº32'),
(104,4556,'ES91306','Laura Gomez','Calle Secundaria nº1 3ºC'),
(105,4532,'ES91123','Carlos Lopez','Avenida Norte nº20');

INSERT INTO tarjetas (numero, propietario, pin, saldo) VALUES
(4485, 101, 4321, 1000.30),
(4916, 102, 8765, 2500.50),
(4567, 103, 2109, 500.25),
(4556, 104, 6543, 150.75),
(4532, 105, 1987, 3800.00);

INSERT INTO movimientos (id_movimiento, id_cliente, tipo, importe, fecha) VALUES
(1, 101, "Ingreso", 50.00, '2023-05-15'),
(2, 101, "Retiro", 100.00, '2023-05-18'),
(3, 103, "Transferencia", 200.00, '2023-05-20'),
(4, 102, "Retiro", 75.00, '2023-05-22'),
(5, 105, "Ingreso", 30.00, '2023-05-25');


ALTER TABLE clientes ADD CONSTRAINT fk_numtarjeta FOREIGN KEY(numtarjeta) REFERENCES tarjetas(numero);
ALTER TABLE bajas ADD CONSTRAINT fk_cliente FOREIGN KEY(cliente) REFERENCES clientes(id);
ALTER TABLE movimientos ADD CONSTRAINT fk_id_cliente FOREIGN KEY(id_cliente) REFERENCES clientes(id);
ALTER TABLE tarjetas ADD CONSTRAINT fk_propietario FOREIGN KEY(propietario) REFERENCES clientes(id);

