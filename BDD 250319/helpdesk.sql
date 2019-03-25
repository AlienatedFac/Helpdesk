-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-03-2019 a las 15:00:03
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
(8, '20/2/2019', '201700105@estudiantes.upqroo.edu.mx', 'Karen Tijera', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Sofware', 'Otros', 'Test'),
(11, '25/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Software', 'Problemas tecnicos', 'Tengo Problemas con el Internet del Salon'),
(12, '25/2/2019', '201700057', 'fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Software', 'Problemas tecnicos', 'Problemas ayudaaaaaa'),
(13, '25/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Sistemas', 'Problemas tecnicos', 'Ayudaaa'),
(14, '25/2/2019', 'pronto_reto@hotmail.com', 'Jesus Garza', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Software', 'Problemas tecnicos', 'Problemas de servicio'),
(15, '25/2/2019', '201700051@estudiantes.upqroo.edu.mx', 'Sergio Raul Aguilar Mendoza', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'Laboratorio de Software', 'Software', 'Otros', 'Mis compañeros dicen pendejadas');

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
(1, '18-03-2019', '201700057', 'Fernando Araujo Cruz', 'Quinto Cuatrimestre', 'Ing. Software', 'Lab. Software', '', 'Inmobiliario', 'Problema', '25/2/2019'),
(2, '18/2/2019', 'test', 'test', 'Primer Cuatrimestre', 'Ingenieria en Software', 'Pagina Web', '', 'Daño', 'Problema', '25/2/2019'),
(3, '18/2/2019', 'test2', 'test2', 'Primer Cuatrimestre', 'Ingenieria en Software', 'Pagina Web', '', 'Daño', 'Problema', '25/2/2019'),
(4, '18/2/2019', 'test3', 'test3', 'Primer Cuatrimestre', 'Ingenieria en Software', 'Pagina Web', '', 'Daño', 'Problema', '25/2/2019'),
(5, '18/2/2019', '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Quinto Cuatrimestre', 'Ingenieria en Software', 'Laboratorio de Software', '', 'Otros', 'Problema', '25/2/2019'),
(6, '19/2/2019', '201700082', 'Angel de Jesus Garza Marquez', 'Quinto Cuatrimestre', 'Ingenieria en Software', 'Pagina Web', '', 'Otros', 'Problema', '25/2/2019'),
(7, '19/2/2019', '', '', 'Primer Cuatrimestre', 'Ingenieria en Software', 'Pagina Web', '', 'Daño', 'Problema', '25/2/2019'),
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
(7, 13, '25/2/2019', 'Soy de Software', 'admin'),
(8, 14, '25/2/2019', 'Chingue usted a su madre, atentamente los zetas.', 'admin'),
(9, 14, '25/2/2019', 'nel', 'admin'),
(10, 14, '25/2/2019', 'pvto', 'admin'),
(11, 14, '25/2/2019', 'gggg', 'admin'),
(12, 15, '25/2/2019', 'Chingue usted a su madre xdxdxdxd', 'admin'),
(13, 15, '25/2/2019', 'OK', 'usuario');

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
(201700051, '201700051@estudiantes.upqroo.edu.mx', 'Sergio Raul Aguilar Mendoza', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700057, '201700057@estudiantes.upqroo.edu.mx', 'Fernando Araujo Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'admin', '', ''),
(201700064, '201700064@estudiantes.upqroo.edu.mx', 'Emmanuel Cahuich Ramos', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700071, '201700071@estudiantes.upqroo.edu.mx', 'Gerardo Antonio Chan Cima', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700075, '201700075@estudiantes.upqroo.edu.mx', 'Angel Leonardo Colli Ku', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700082, '201700082@estudiantes.upqroo.edu.mx', 'Angel de Jesus Garza Marquez', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'admin', '', ''),
(201700089, '201700089@estudiantes.upqroo.edu.mx', 'Arvi Jaziel Mis Lopez', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700090, '201700090@estudiantes.upqroo.edu.mx', 'Noel Moroni Mora Marentes', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700093, '201700093@estudiantes.upqroo.edu.mx', 'Moran Rodriguez Luis Elias', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700094, '201700094@estudiantes.upqroo.edu.mx', 'Manuel Ivan Mukul Gil', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700100, '201700100@estudiantes.upqroo.edu.mx', 'Johan Reyes Pierce', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700102, '201700102@estudiantes.upqroo.edu.mx', 'Anel Monica Roque Sanchez', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700103, '201700103@estudiantes.upqroo.edu.mx', 'Karla Vianney Salomon Leon', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201700105, '201700105@estudiantes.upqroo.edu.mx', 'Karen Tijera Perez', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'admin', '', ''),
(201700108, '201700108@estudiantes.upqroo.edu.mx', 'Freddy Urioustegui Cruz', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', ''),
(201800002, '2018000029@estudiantes.upqroo.edu.mx', 'Juan Carlos Mejia Guzman', 'Ingenieria en Software', 'Quinto Cuatrimestre', 'usuario', '', '');

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
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `turno` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
