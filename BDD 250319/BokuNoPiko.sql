-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-03-2019 a las 08:02:58
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
  `Asignado` varchar(50) NOT NULL,
  `Tema` varchar(100) NOT NULL,
  `Problema` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abierto`
--

INSERT INTO `abierto` (`ID`, `Fecha`, `correo`, `Nombres`, `Carrera`, `Cuatrimestre`, `Departamento`, `Asignado`, `Tema`, `Problema`) VALUES
(1, '18-03-2019', '201700057', 'Fernando Araujo Cruz', 'Ing. Software', 'Quinto Cuatrimestre', 'Lab. Software', '', 'Inmobiliario', 'Se cayo el techo we'),
(2, '18/2/2019', 'test', 'test', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', '', 'Daño', 'test'),
(3, '18/2/2019', 'test2', 'test2', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', '', 'Daño', 'test2'),
(4, '18/2/2019', 'test3', 'test3', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', '', 'Daño', 'test3'),
(5, '18/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', '', 'Otros', 'Se me aparecio el ayuwoki '),
(6, '19/2/2019', '201700082', 'Angel de Jesus Garza Marquez', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Pagina Web', '', 'Otros', 'Esta es una prueba'),
(7, '19/2/2019', '', '', 'Ingenieria en Software', 'Primer Cuatrimestre', 'Pagina Web', '', 'Daño', ''),
(8, '20/2/2019', '201700105@estudiantes.upqroo.edu.mx', 'Karen Tijera', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Sofware', 'Otros', 'Test'),
(11, '25/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Software', 'Problemas tecnicos', 'Tengo Problemas con el Internet del Salon'),
(12, '25/2/2019', '201700057', 'fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Software', 'Problemas tecnicos', 'Problemas ayudaaaaaa'),
(13, '25/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Sistemas', 'Problemas tecnicos', 'Ayudaaa');

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
  `Asignado` varchar(50) NOT NULL,
  `Tema` varchar(100) NOT NULL,
  `Problema` varchar(100) NOT NULL,
  `FechaC` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cerrado`
--

INSERT INTO `cerrado` (`ID`, `Fecha`, `correo`, `Nombres`, `carrera`, `cuatrimestre`, `Departamento`, `Asignado`, `Tema`, `Problema`, `FechaC`) VALUES
(9, '21/2/2019', 'oppaiskoibito@gmail.com', 'Fernando Araujo', 'Quinto Cuatrimestre', 'Ingenieria en Software', 'Pagina Web', 'Software', 'Problemas tecnicos', 'Problema', '25/2/2019'),
(10, '24/03/2019', 'HelpdeskUPQROO@gmail.com', 'Server Admin', 'N/A', 'N/A', 'N/A', 'Software', 'test', 'Problema', '25/2/2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `turno` int(50) NOT NULL,
  `ID` int(50) NOT NULL,
  `hora` varchar(50) NOT NULL,
  `respuesta` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`turno`, `ID`, `hora`, `respuesta`, `tipo`) VALUES
(1, 9, '24/2/2019', 'Gracias por acudir a soporte tecnico', 'admin'),
(2, 9, '24/2/2019', 'Estamos para servirte', 'admin'),
(3, 11, '25/2/2019', 'Podrias Ayudarme?', 'usuario'),
(4, 11, '25/2/2019', 'Este es un test de respuesta', 'admin'),
(5, 11, '25/2/2019', 'estas ahi we?', 'usuario'),
(6, 13, '25/2/2019', 'Ayuda x2', 'usuario'),
(7, 13, '25/2/2019', 'Soy de Software', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Matricula` int(50) NOT NULL,
  `correos` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `carrera` varchar(50) NOT NULL,
  `cuatrimestre` varchar(50) NOT NULL,
  `tipo` enum('admin','usuario') NOT NULL,
  `password` varchar(50) NOT NULL,
  `encargado` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Matricula`, `correos`, `nombre`, `carrera`, `cuatrimestre`, `tipo`, `password`, `encargado`) VALUES
(1, 'HelpdeskUPQROO@gmail.com', 'Server Admin', 'N/A', 'N/A', 'admin', '123456789', 'Software'),
(201700057, '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', 'sopademacaco123', 'nada');

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
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`turno`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Matricula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `abierto`
--
ALTER TABLE `abierto`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `turno` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
