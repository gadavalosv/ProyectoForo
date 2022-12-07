drop database ceti_foro;
create database ceti_foro;

use ceti_foro;

create table usuario (
	id int not null AUTO_INCREMENT,
    -- nombre varchar(30) not null,
    -- apellidos varchar(30) not null,
	correo varchar(40) not null,
    tipo_usuario smallint not null,
    -- contrasenia varchar(50) not null,
    primary key (id)
);

create table baneo (
	id int not null AUTO_INCREMENT,
    id_usuario int not null,
    fecha_inicio datetime not null,
    fecha_fin datetime not null,
    primary key (id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

create table pregunta (
	id int not null auto_increment,
    id_usuario int not null,
    tipo_usuario bit not null, -- 0 => cliente || 1 => administrador
    pregunta varchar(500),
    titulo varchar(100),
    primary key(id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

create table respuesta (
	id int not null auto_increment,
    id_usuario int not null,
    tipo_usuario bit not null, -- 0 => cliente || 1 => administrador
    respuesta varchar(500),
    primary key(id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

create table calificacion_pregunta (
	id int not null AUTO_INCREMENT,
    id_usuario int not null,
    id_pregunta int not null,
    calificacion decimal(3,1),
    primary key (id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_pregunta) REFERENCES pregunta(id)
);

create table calificacion_respuesta (
	id int not null AUTO_INCREMENT,
    id_usuario int not null,
    id_respuesta int not null,
    calificacion decimal(3,1),
    primary key (id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_respuesta) REFERENCES respuesta(id)
);

INSERT INTO usuario (tipo_usuario, correo) VALUES
(1, 'gadv390@ceti.mx'),
(0, 'daniela32@ceti.mx'),
(0, 'jorgesalazar@gmail.com'),
(0, 'dan@cignuz.com'),
(0, 'maglez@hotmail.com'),
(0, 'dancav@hotmail.com'),
(0, 'isael@hotmail.com'),
(0, 'canario33@hotmail.com'),
(0, 'cisco32@hotmail.com'),
(0, 'mariana2bon@hotmail.com');