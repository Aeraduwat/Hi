-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2017 a las 21:33:52
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `drones`
--

CREATE TABLE `drones` (
  `equipo` varchar(10) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo_marca` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `num_serie` varchar(16) COLLATE utf8_spanish2_ci NOT NULL,
  `cantidad` int(3) NOT NULL,
  `helice` int(3) NOT NULL,
  `control` int(3) NOT NULL,
  `bateria` int(3) NOT NULL,
  `protectores_de_helice` int(3) NOT NULL,
  `adaptador` int(3) NOT NULL,
  `maleta` int(3) NOT NULL,
  `gimball` int(3) NOT NULL,
  `helice_repuesto` int(3) NOT NULL,
  `cables_usb` int(3) NOT NULL,
  `cargador_baterias` int(3) NOT NULL,
  `enchufe_cargador` int(3) NOT NULL,
  `otros` text COLLATE utf8_spanish2_ci,
  `observaciones` text COLLATE utf8_spanish2_ci,
  `adaptador_bateria` int(3) NOT NULL,
  `estado_actual` varchar(15) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado_2` varchar(15) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `drones`
--

INSERT INTO `drones` (`equipo`, `modelo_marca`, `num_serie`, `cantidad`, `helice`, `control`, `bateria`, `protectores_de_helice`, `adaptador`, `maleta`, `gimball`, `helice_repuesto`, `cables_usb`, `cargador_baterias`, `enchufe_cargador`, `otros`, `observaciones`, `adaptador_bateria`, `estado_actual`, `estado_2`) VALUES
('AJK', '3 DR SOLO', 'ajk1', 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 0, '', ''),
('ASDF', 'asdf', 'asdf1', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 0, '', ''),
('DRONE', '3 DR SOLO', 'asdjahskdj', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 0, '', ''),
('DRONE', '3 DR SOLO', 'S1', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 0, '', ''),
('DRONE', '3 DR SOLO', 'S111A5002524', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 0, '', ''),
('DRONE', '3 DR SOLO', 'S111A5A13112', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 0, '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `drones`
--
ALTER TABLE `drones`
  ADD PRIMARY KEY (`num_serie`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
