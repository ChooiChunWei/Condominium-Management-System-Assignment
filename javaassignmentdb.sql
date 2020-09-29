-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 29, 2020 at 08:45 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaassignmentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `Payment_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Payment_Date` date NOT NULL,
  `Due_Date` date DEFAULT NULL,
  `Payment_Amount` decimal(5,2) NOT NULL,
  `Resident_ID` int(11) NOT NULL,
  PRIMARY KEY (`Payment_ID`),
  KEY `FOREIGN_KEY` (`Resident_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`Payment_ID`, `Payment_Date`, `Due_Date`, `Payment_Amount`, `Resident_ID`) VALUES
(21, '2019-02-27', NULL, '200.00', 28),
(20, '2019-03-11', NULL, '200.00', 27),
(19, '2019-04-10', NULL, '200.00', 26),
(18, '2019-04-10', NULL, '200.00', 25),
(17, '2019-04-10', NULL, '200.00', 24);

-- --------------------------------------------------------

--
-- Table structure for table `resident`
--

DROP TABLE IF EXISTS `resident`;
CREATE TABLE IF NOT EXISTS `resident` (
  `Resident_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Resident_Name` varchar(50) NOT NULL,
  `Resident_Phone_Number` varchar(11) NOT NULL,
  `Resident_Password` varchar(255) DEFAULT NULL,
  `Resident_Email` varchar(70) NOT NULL,
  `Account_Status` text NOT NULL,
  PRIMARY KEY (`Resident_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resident`
--

INSERT INTO `resident` (`Resident_ID`, `Resident_Name`, `Resident_Phone_Number`, `Resident_Password`, `Resident_Email`, `Account_Status`) VALUES
(28, 'tjlaw', '0194660133', 'e99a18c428cb38d5f260853678922e03', 'tjlaw@gmail.com', 'Deactivated'),
(27, 'kokyoung', '0126611874', 'd6e1a83c913dd149e3d854d59aa7e3c8', 'kokyoung@gmail.com', 'Active'),
(26, 'bonn', '01699226191', 'e99a18c428cb38d5f260853678922e03', 'bonn@gmail.com', 'Active'),
(25, 'hohyoung', '0126611874', NULL, 'hohyoung@gmail.com', 'Deleted'),
(24, 'jozhua', '0120099887', '0a5e98b020adc5bd17603540a27bf602', 'jozhua@gmail.com', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `Staff_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Staff_Name` varchar(50) NOT NULL,
  `Staff_Password` varchar(70) NOT NULL,
  PRIMARY KEY (`Staff_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`Staff_ID`, `Staff_Name`, `Staff_Password`) VALUES
(1, 'chunwei', 'f30b12ae3475e0496973265ccd586f7e'),
(2, 'admin', '0192023a7bbd73250516f069df18b500'),
(3, 'bryan', '1cccac669845692733cea74f16ff4b6d');

-- --------------------------------------------------------

--
-- Table structure for table `unit`
--

DROP TABLE IF EXISTS `unit`;
CREATE TABLE IF NOT EXISTS `unit` (
  `Unit_ID` char(5) NOT NULL,
  `Unit_Register_Date` date DEFAULT NULL,
  `Resident_ID` int(11) DEFAULT NULL,
  `Outstanding_Balance` decimal(5,2) DEFAULT NULL,
  `Due_Date` date DEFAULT NULL,
  PRIMARY KEY (`Unit_ID`),
  KEY `FOREIGN_KEY` (`Resident_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `unit`
--

INSERT INTO `unit` (`Unit_ID`, `Unit_Register_Date`, `Resident_ID`, `Outstanding_Balance`, `Due_Date`) VALUES
('A0101', '2019-04-10', 24, NULL, NULL),
('A0102', NULL, NULL, NULL, NULL),
('A0103', '2019-04-10', 26, NULL, NULL),
('A0104', NULL, NULL, NULL, NULL),
('A0105', NULL, NULL, NULL, NULL),
('A0201', '2019-02-27', 28, '200.00', '2019-04-03'),
('A0202', NULL, NULL, NULL, NULL),
('A0203', NULL, NULL, NULL, NULL),
('A0204', NULL, NULL, NULL, NULL),
('A0205', NULL, NULL, NULL, NULL),
('A0301', NULL, NULL, NULL, NULL),
('A0302', NULL, NULL, NULL, NULL),
('A0303', NULL, NULL, NULL, NULL),
('A0304', NULL, NULL, NULL, NULL),
('A0305', NULL, NULL, NULL, NULL),
('A0401', NULL, NULL, NULL, NULL),
('A0402', NULL, NULL, NULL, NULL),
('A0403', NULL, NULL, NULL, NULL),
('A0404', NULL, NULL, NULL, NULL),
('A0405', NULL, NULL, NULL, NULL),
('A0501', NULL, NULL, NULL, NULL),
('A0502', NULL, NULL, NULL, NULL),
('A0503', NULL, NULL, NULL, NULL),
('A0504', NULL, NULL, NULL, NULL),
('A0505', NULL, NULL, NULL, NULL),
('A0601', NULL, NULL, NULL, NULL),
('A0602', NULL, NULL, NULL, NULL),
('A0603', NULL, NULL, NULL, NULL),
('A0604', NULL, NULL, NULL, NULL),
('A0605', NULL, NULL, NULL, NULL),
('A0701', NULL, NULL, NULL, NULL),
('A0702', NULL, NULL, NULL, NULL),
('A0703', NULL, NULL, NULL, NULL),
('A0704', NULL, NULL, NULL, NULL),
('A0705', NULL, NULL, NULL, NULL),
('A0801', NULL, NULL, NULL, NULL),
('A0802', NULL, NULL, NULL, NULL),
('A0803', NULL, NULL, NULL, NULL),
('A0804', NULL, NULL, NULL, NULL),
('A0805', NULL, NULL, NULL, NULL),
('A0901', NULL, NULL, NULL, NULL),
('A0902', NULL, NULL, NULL, NULL),
('A0903', NULL, NULL, NULL, NULL),
('A0904', NULL, NULL, NULL, NULL),
('A0905', NULL, NULL, NULL, NULL),
('A1001', NULL, NULL, NULL, NULL),
('A1002', NULL, NULL, NULL, NULL),
('A1003', NULL, NULL, NULL, NULL),
('A1004', NULL, NULL, NULL, NULL),
('A1005', NULL, NULL, NULL, NULL),
('B0101', '2019-03-11', 27, '200.00', '2019-04-18'),
('B0102', NULL, NULL, NULL, NULL),
('B0103', NULL, NULL, NULL, NULL),
('B0104', NULL, NULL, NULL, NULL),
('B0105', NULL, NULL, NULL, NULL),
('B0201', NULL, NULL, NULL, NULL),
('B0202', NULL, NULL, NULL, NULL),
('B0203', NULL, NULL, NULL, NULL),
('B0204', NULL, NULL, NULL, NULL),
('B0205', NULL, NULL, NULL, NULL),
('B0301', NULL, NULL, NULL, NULL),
('B0302', NULL, NULL, NULL, NULL),
('B0303', NULL, NULL, NULL, NULL),
('B0304', NULL, NULL, NULL, NULL),
('B0305', NULL, NULL, NULL, NULL),
('B0401', NULL, NULL, NULL, NULL),
('B0402', NULL, NULL, NULL, NULL),
('B0403', NULL, NULL, NULL, NULL),
('B0404', NULL, NULL, NULL, NULL),
('B0405', NULL, NULL, NULL, NULL),
('B0501', NULL, NULL, NULL, NULL),
('B0502', NULL, NULL, NULL, NULL),
('B0503', NULL, NULL, NULL, NULL),
('B0504', NULL, NULL, NULL, NULL),
('B0505', NULL, NULL, NULL, NULL),
('B0601', NULL, NULL, NULL, NULL),
('B0602', NULL, NULL, NULL, NULL),
('B0603', NULL, NULL, NULL, NULL),
('B0604', NULL, NULL, NULL, NULL),
('B0605', NULL, NULL, NULL, NULL),
('B0701', NULL, NULL, NULL, NULL),
('B0702', NULL, NULL, NULL, NULL),
('B0703', NULL, NULL, NULL, NULL),
('B0704', NULL, NULL, NULL, NULL),
('B0705', NULL, NULL, NULL, NULL),
('B0801', NULL, NULL, NULL, NULL),
('B0802', NULL, NULL, NULL, NULL),
('B0803', NULL, NULL, NULL, NULL),
('B0804', NULL, NULL, NULL, NULL),
('B0805', NULL, NULL, NULL, NULL),
('B0901', NULL, NULL, NULL, NULL),
('B0902', NULL, NULL, NULL, NULL),
('B0903', NULL, NULL, NULL, NULL),
('B0904', NULL, NULL, NULL, NULL),
('B0905', NULL, NULL, NULL, NULL),
('B1001', NULL, NULL, NULL, NULL),
('B1002', NULL, NULL, NULL, NULL),
('B1003', NULL, NULL, NULL, NULL),
('B1004', NULL, NULL, NULL, NULL),
('B1005', NULL, NULL, NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
