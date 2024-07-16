create database chatiTienda;
use chatiTienda;

create table tb_productos(
	idprodu int auto_increment primary key,
    generoprodu ENUM('M','F') not null,
    nombreprodu varchar(80),
	precioventaprodu double,
    preciocompraprodu double,
    cantidad int,
    idtipoprodu int,
    idproveedor int,
	FOREIGN KEY (idtipoprodu) REFERENCES tbTipoProducto(idtipoprodu),
    FOREIGN KEY (idproveedor) REFERENCES tbProveedor(idproveedor)
);



create table tbTipoProducto(
	idtipoprodu int auto_increment primary key,
    nombretipoprpodu varchar(20)
);

create table tbProveedor(
	idproveedor int auto_increment primary key,
	rucproveedor int,
    nombreprove varchar(80),
    direccionprove varchar(90),
    telefonoprove int,
    CONSTRAINT chck_rucproveedor CHECK (rucproveedor BETWEEN 10000000000 AND 99999999999),
    CONSTRAINT chck_telefono CHECK (telefonoprove BETWEEN 900000000 AND 999999999)
);

insert into tbTipoProducto values(1,'bermuda');
insert into tbTipoProducto values(2,'pantalon');
insert into tbTipoProducto values(3,'short');
insert into tbTipoProducto values(4,'casaca');
insert into tbTipoProducto values(5,'torero');
insert into tbTipoProducto values(6,'polo');
insert into tbTipoProducto values(7,'polera');







