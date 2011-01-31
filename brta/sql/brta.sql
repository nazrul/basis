-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 21, 2011 at 12:57 PM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `national_id_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `brta_record`
--

CREATE TABLE IF NOT EXISTS `brta_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL,
  `national_id` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `vehicle_reg_no` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `vehicle_chais_no` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `vehicle_engine_no` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `national_id` (`national_id`),
  UNIQUE KEY `vehicle_reg_no` (`vehicle_reg_no`),
  UNIQUE KEY `vehicle_chais_no` (`vehicle_chais_no`),
  UNIQUE KEY `vehicle_engine_no` (`vehicle_engine_no`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Dumping data for table `brta_record`
--
