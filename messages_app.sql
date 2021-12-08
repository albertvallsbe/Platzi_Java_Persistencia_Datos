-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Temps de generació: 08-12-2021 a les 19:51:45
-- Versió del servidor: 10.4.17-MariaDB
-- Versió de PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de dades: `messages_app`
--

CREATE DATABASE `messages_app`;

-- --------------------------------------------------------

--
-- Estructura de la taula `messages`
--

CREATE TABLE `messages` (
  `id_message` int(7) NOT NULL,
  `message` varchar(280) NOT NULL,
  `message_author` varchar(50) NOT NULL,
  `message_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Bolcament de dades per a la taula `messages`
--

INSERT INTO `messages` (`id_message`, `message`, `message_author`, `message_date`) VALUES
(1, 'Hello World! ', 'Albert', '2021-12-08 17:19:11'),
(2, 'Hello beatiful world!', 'titucabe', '2021-12-08 17:38:03'),
(4, 'Definitive message', 'Root', '2021-12-08 18:36:24');

--
-- Índexs per a les taules bolcades
--

--
-- Índexs per a la taula `messages`
--
ALTER TABLE `messages`
  ADD PRIMARY KEY (`id_message`);

--
-- AUTO_INCREMENT per les taules bolcades
--

--
-- AUTO_INCREMENT per la taula `messages`
--
ALTER TABLE `messages`
  MODIFY `id_message` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
