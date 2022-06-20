drop database ceti_foro;
create database ceti_foro;

use ceti_foro;

create table administrador (
	id smallint not null AUTO_INCREMENT,
    -- nombre varchar(30) not null,
    -- apellidos varchar(30) not null,
	correo varchar(40) not null,
    -- contrasenia varchar(50) not null,
    primary key (id)
);

create table cliente (
	id int not null AUTO_INCREMENT,
    -- nombre varchar(30) not null,
    -- apellidos varchar(30) not null,
	correo varchar(40) not null,
    -- contrasenia varchar(50) not null,
    primary key (id)
);

create table baneo (
	id int not null AUTO_INCREMENT,
    id_cliente int not null,
	id_administrador smallint not null,
    fecha_inicio datetime not null,
    fecha_fin datetime not null,
    primary key (id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_administrador) REFERENCES administrador(id)
);

create table pregunta (
	id int not null auto_increment,
    id_cliente int not null,
    id_administrador smallint not null,
    tipo_usuario bit not null, -- 0 => cliente || 1 => administrador
    pregunta varchar(500),
    titulo varchar(100),
    primary key(id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_administrador) REFERENCES administrador(id)
);

create table respuesta (
	id int not null auto_increment,
    id_cliente int not null,
    id_administrador smallint not null,
    tipo_usuario bit not null, -- 0 => cliente || 1 => administrador
    respuesta varchar(500),
    primary key(id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_administrador) REFERENCES administrador(id)
);

create table calificacion_pregunta (
	id int not null AUTO_INCREMENT,
    id_cliente int not null,
    id_pregunta int not null,
    calificacion decimal(3,1),
    primary key (id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_pregunta) REFERENCES pregunta(id)
);

create table calificacion_respuesta (
	id int not null AUTO_INCREMENT,
    id_cliente int not null,
    id_respuesta int not null,
    calificacion decimal(3,1),
    primary key (id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_respuesta) REFERENCES respuesta(id)
);