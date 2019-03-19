-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-03-2019 a las 16:36:48
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `helpdesk`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abierto`
--

CREATE TABLE `abierto` (
  `ID` int(100) NOT NULL,
  `Fecha` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `Nombres` varchar(100) NOT NULL,
  `Carrera` varchar(100) NOT NULL,
  `Cuatrimestre` varchar(100) NOT NULL,
  `Departamento` varchar(100) NOT NULL,
  `Tema` varchar(100) NOT NULL,
  `Problema` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abierto`
--

INSERT INTO `abierto` (`ID`, `Fecha`, `correo`, `Nombres`, `Carrera`, `Cuatrimestre`, `Departamento`, `Tema`, `Problema`) VALUES
(1, '18-03-2019', '201700057', 'Fernando Araujo Cruz', 'Ing. Software', 'Quinto Cuatrimestre', 'Lab. Software', 'Inmobiliario', 'Se cayo el techo we'),
(2, '18/2/2019', 'test', 'test', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', 'Daño', 'test'),
(3, '18/2/2019', 'test2', 'test2', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', 'Daño', 'test2'),
(4, '18/2/2019', 'test3', 'test3', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', 'Daño', 'test3'),
(5, '18/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Otros', 'Se me aparecio el ayuwoki '),
(6, '19/2/2019', '201700082', 'Angel de Jesus Garza Marquez', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Pagina Web', 'Otros', 'Esta es una prueba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cerrado`
--

CREATE TABLE `cerrado` (
  `ID` int(100) NOT NULL,
  `Fecha` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `carrera` varchar(50) NOT NULL,
  `cuatrimestre` varchar(50) NOT NULL,
  `Departamento` varchar(100) NOT NULL,
  `Tema` varchar(100) NOT NULL,
  `Problema` varchar(100) NOT NULL,
  `Solucion` varchar(50) NOT NULL,
  `FechaC` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `abierto`
--
ALTER TABLE `abierto`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `cerrado`
--
ALTER TABLE `cerrado`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `abierto`
--
ALTER TABLE `abierto`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
