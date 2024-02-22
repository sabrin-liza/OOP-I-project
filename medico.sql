-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2023 at 05:51 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medico`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `password`) VALUES
('liza', 'liza5768'),
('sabrin', 'sabrin');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `patientName` varchar(50) NOT NULL,
  `docType` varchar(50) NOT NULL,
  `appDate` varchar(50) NOT NULL,
  `appTime` varchar(50) NOT NULL,
  `presentCondition` varchar(200) NOT NULL,
  `desease` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`patientName`, `docType`, `appDate`, `appTime`, `presentCondition`, `desease`) VALUES
('Taslima Akter', 'Pediatrician', '23-7-23', 'Morning', 'chest pain', 'no'),
('Sadika Sharmin', 'ENT', '25may,2023', '[Evening]', 'ear pain', 'Diabeates'),
('Sultanus Salehin', 'Cardiologist', '23-7-23', 'Evening', 'Xoss', 'no'),
('Naznin Sumyia', 'Gynecologist ', '10-06-23', 'Morning', 'Regular checkup', 'no'),
('liza', 'Oncologist', '23-6-23', 'Morning', 'regular', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `docName` varchar(50) NOT NULL,
  `docGender` varchar(50) NOT NULL,
  `specialist` varchar(50) NOT NULL,
  `docContact` varchar(50) NOT NULL,
  `docAddress` varchar(50) NOT NULL,
  `docEmail` varchar(50) NOT NULL,
  `docUsername` varchar(50) NOT NULL,
  `docPassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`docName`, `docGender`, `specialist`, `docContact`, `docAddress`, `docEmail`, `docUsername`, `docPassword`) VALUES
('Dr.Harun R Rashid', 'Male', 'Pediatrician', '01987123456', 'Uttara', 'rashid@gmail.com', 'rashid', 'rashid'),
('Dr.Atif', 'Male', 'Pediatrician', '01987654321', 'uttara', 'atifff@gmail.com', 'atif', 'atif'),
('Dr.Asif', 'Male', 'Cardiologist', '0178654321234', 'Dhaka', 'asif@gmail.com', 'asif', 'asif'),
('Sarmin Sultana', 'Female', 'Gynecologist ', '01654321789', 'Mirpur', 'sarmin@gmail.com', 'sarmin', 'sarmin'),
('Safina sarwar', 'Female', 'Oncologist', '0178654321', 'Savar', 'safina@gmail.com', 'safina', 'safina'),
('asik', 'male', 'Pediatrician', '028', 'savar', 'asi@', 'jgdsb', 'dhsk');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patientName` varchar(50) NOT NULL,
  `selectGender` varchar(50) NOT NULL,
  `dateofBirth` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `contactno` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientName`, `selectGender`, `dateofBirth`, `address`, `contactno`, `email`, `userName`, `password`) VALUES
('Nupur Akter', 'Female', '1 Jan,2002', 'Dhanmondi', '01987654321', 'numur@gmail.com', 'nupur01', 'nupur2002'),
('Sultanus Salehin', 'Male', '15 Apr,2000', 'Cox\'s bazar', '01978654321', 'salehin@gmail.com', 'salehin', 'salehin15'),
('Fahiz Siddiqur', 'Male', '1-1-2000', 'Jhinaidha', '0162167638', 'fahiz@gamil.com', 'fahiz', 'fahiz'),
('Naznin sumyia', 'Select', '20-12-1990', 'Mymenshingh', '01987123456', 'naznin@gmail.com', 'naznin', 'naznin123'),
('Sumyia', 'Female', '23-9-99', 'Uttara', '01987651234', 'liza@yahoo.com', 'liza', 'liza');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
