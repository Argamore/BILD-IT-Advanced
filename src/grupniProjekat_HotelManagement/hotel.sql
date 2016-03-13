-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2016 at 08:44 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` text,
  `password` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `archive`
--

CREATE TABLE `archive` (
  `idnumber` text,
  `username` text,
  `password` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `username` text,
  `password` text,
  `name` text,
  `surname` text,
  `gender` text,
  `idnumber` text NOT NULL,
  `age` int(3) DEFAULT NULL,
  `roomnumber` int(3) DEFAULT NULL,
  `roomtype` text,
  `timecheckedin` text,
  `numofdays` int(3) DEFAULT NULL,
  `gym` text,
  `pool` text,
  `restaurant` text,
  `sauna` text,
  `cinema` text,
  `active` binary(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `notifications`
--

CREATE TABLE `notifications` (
  `view` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `number` int(11) DEFAULT NULL,
  `type` text,
  `dayprice` double DEFAULT '0',
  `username` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`number`, `type`, `dayprice`, `username`) VALUES
(1, 'Suite', 60, 'null'),
(2, 'Suite', 60, 'null'),
(3, 'Suite', 60, 'null'),
(4, 'Suite', 60, 'null'),
(5, 'Suite', 60, 'null'),
(6, 'Suite', 60, 'null'),
(7, 'Suite', 60, 'null'),
(8, 'Suite', 60, 'null'),
(9, 'Suite', 60, 'null'),
(10, 'Suite', 60, 'null'),
(11, 'Double', 40, 'null'),
(13, 'Double', 40, 'null'),
(15, 'Double', 40, 'null'),
(16, 'Double', 40, 'null'),
(17, 'Double', 40, 'null'),
(18, 'Double', 40, 'null'),
(19, 'Double', 40, 'null'),
(20, 'Double', 40, 'null'),
(21, 'Double', 40, 'null'),
(22, 'Double', 40, 'null'),
(23, 'Double', 40, 'null'),
(24, 'Double', 40, 'null'),
(25, 'Double', 40, 'null'),
(26, 'Single', 20, 'null'),
(27, 'Single', 20, 'null'),
(28, 'Single', 20, 'kc'),
(29, 'Single', 20, 'null'),
(30, 'Single', 20, 'null'),
(31, 'Single', 20, 'null'),
(32, 'Single', 20, 'null'),
(33, 'Single', 20, 'null'),
(34, 'Single', 20, 'null'),
(35, 'Single', 20, 'null'),
(36, 'Single', 20, 'null'),
(37, 'Single', 20, 'null'),
(38, 'Single', 20, 'null'),
(39, 'Single', 20, 'null'),
(40, 'Single', 20, 'null'),
(12, 'Double', 40, 'null'),
(14, 'Double', 40, 'null');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
