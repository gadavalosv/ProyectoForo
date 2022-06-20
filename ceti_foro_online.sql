-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 20-06-2022 a las 15:43:17
-- Versión del servidor: 10.5.12-MariaDB
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
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_administrador` smallint(6) NOT NULL,
  `tipo_usuario` bit(1) NOT NULL,
  `pregunta` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `titulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `id_cliente`, `id_administrador`, `tipo_usuario`, `pregunta`, `titulo`) VALUES
(1, 1, 1, b'0', 'como se agrega una imagen svg?', 'imagen svg'),
(2, 2, 2, b'1', 'como se manda llamar a un archivo js?', 'archivo js'),
(3, 3, 3, b'0', 'como se agrega un radio button en android studio ejemplo', 'radio button android'),
(4, 4, 4, b'1', 'como se llaman las propiedades de react js?', 'react js'),
(5, 5, 5, b'0', 'porque me invoca este metodo?', 'metodo fallido'),
(6, 6, 6, b'1', 'como agregar la libreria de material UI en react js', 'material ui'),
(7, 7, 7, b'0', 'como accedo a una base de datos con mysql con php?', 'mysql'),
(8, 8, 8, b'0', 'como creo una carpeta res en android studio?', 'carpeta android'),
(9, 9, 9, b'0', 'que significa el override de android studio?', 'override');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_administrador` (`id_administrador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `pregunta_ibfk_2` FOREIGN KEY (`id_administrador`) REFERENCES `administrador` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
