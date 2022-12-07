-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 07-12-2022 a las 11:39:12
-- Versión del servidor: 10.5.16-MariaDB
-- Versión de PHP: 7.3.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `id19074458_ceti_foro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `baneo`
--

CREATE TABLE `baneo` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `fecha_inicio` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `baneo`
--

INSERT INTO `baneo` (`id`, `id_usuario`, `fecha_inicio`, `fecha_fin`) VALUES
(1, 2, '2022-06-18 10:34:09', '2022-07-18 20:34:09'),
(2, 8, '2022-06-20 12:29:18', '2022-07-20 22:29:18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificacion_pregunta`
--

CREATE TABLE `calificacion_pregunta` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_pregunta` int(11) NOT NULL,
  `calificacion` decimal(3,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `calificacion_pregunta`
--

INSERT INTO `calificacion_pregunta` (`id`, `id_usuario`, `id_pregunta`, `calificacion`) VALUES
(1, 2, 5, 9.6),
(2, 4, 6, 7.4),
(3, 8, 7, 8.2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificacion_respuesta`
--

CREATE TABLE `calificacion_respuesta` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_respuesta` int(11) NOT NULL,
  `calificacion` decimal(3,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `calificacion_respuesta`
--

INSERT INTO `calificacion_respuesta` (`id`, `id_usuario`, `id_respuesta`, `calificacion`) VALUES
(1, 1, 5, 9.2),
(2, 7, 6, 8.1),
(3, 9, 7, 6.4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `tipo_usuario` bit(1) NOT NULL,
  `pregunta` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `titulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `id_usuario`, `tipo_usuario`, `pregunta`, `titulo`) VALUES
(1, 1, b'1', 'como se agrega una imagen svg?', 'imagen svg'),
(2, 2, b'0', 'como se manda llamar a un archivo js?', 'archivo js'),
(3, 3, b'0', 'como se agrega un radio button en android studio ejemplo', 'radio button android'),
(4, 4, b'0', 'como se llaman las propiedades de react js?', 'react js'),
(5, 5, b'0', 'porque me invoca este metodo?', 'metodo fallido'),
(6, 1, b'1', 'como agregar la libreria de material UI en react js', 'material ui'),
(7, 7, b'0', 'como accedo a una base de datos con mysql con php?', 'mysql'),
(8, 8, b'0', 'como creo una carpeta res en android studio?', 'carpeta android'),
(9, 9, b'0', 'que significa el override de android studio?', 'override');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `tipo_usuario` bit(1) NOT NULL,
  `respuesta` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_pregunta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`id`, `id_usuario`, `tipo_usuario`, `respuesta`, `id_pregunta`) VALUES
(1, 1, b'1', 'Respuesta 1 a la pregunta 1 por un cliente', 1),
(2, 2, b'0', 'Respuesta 1 a la pregunta 2 por un administrador', 2),
(3, 3, b'0', 'Respuesta', 3),
(4, 4, b'0', 'Respuesta', 4),
(5, 5, b'0', 'Respuesta', 5),
(6, 1, b'1', 'Respuesta', 6),
(7, 7, b'0', 'Respuesta', 7),
(8, 8, b'0', 'Respuesta', 8),
(9, 9, b'0', 'Respuesta', 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `correo` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `tipo_usuario` int(11) NOT NULL,
  `contrasenia` varchar(40) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `correo`, `tipo_usuario`, `contrasenia`) VALUES
(1, 'gadv390@ceti.mx', 1, 'admin'),
(2, 'daniela32@ceti.mx', 0, 'pass'),
(3, 'jorgesalazar@gmail.com', 0, 'pass'),
(4, 'dan@cignuz.com', 0, 'pass'),
(5, 'maglez@hotmail.com', 0, 'pass'),
(6, 'dancav@hotmail.com', 0, 'pass'),
(7, 'isael@hotmail.com', 0, 'pass'),
(8, 'canario33@hotmail.com', 0, 'pass'),
(9, 'cisco32@hotmail.com', 0, 'pass'),
(10, 'mariana2bon@hotmail.com', 0, 'pass');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `baneo`
--
ALTER TABLE `baneo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `calificacion_pregunta`
--
ALTER TABLE `calificacion_pregunta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_pregunta` (`id_pregunta`);

--
-- Indices de la tabla `calificacion_respuesta`
--
ALTER TABLE `calificacion_respuesta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_respuesta` (`id_respuesta`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_pregunta` (`id_pregunta`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `baneo`
--
ALTER TABLE `baneo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `calificacion_pregunta`
--
ALTER TABLE `calificacion_pregunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `calificacion_respuesta`
--
ALTER TABLE `calificacion_respuesta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `baneo`
--
ALTER TABLE `baneo`
  ADD CONSTRAINT `baneo_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `calificacion_pregunta`
--
ALTER TABLE `calificacion_pregunta`
  ADD CONSTRAINT `calificacion_pregunta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `calificacion_respuesta`
--
ALTER TABLE `calificacion_respuesta`
  ADD CONSTRAINT `calificacion_respuesta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `respuesta_ibfk_2` FOREIGN KEY (`id_pregunta`) REFERENCES `pregunta` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
