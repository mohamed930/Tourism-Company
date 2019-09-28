-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 30, 2019 at 11:03 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `TourismCompany`
--

-- --------------------------------------------------------

--
-- Table structure for table `Accompanying`
--

CREATE TABLE `Accompanying` (
  `Name` varchar(30) NOT NULL,
  `SSN` varchar(30) DEFAULT NULL,
  `PassProtNumber` varchar(9) DEFAULT NULL,
  `TelePhone` varchar(11) NOT NULL,
  `offerCode` int(6) NOT NULL,
  `SeateNumber` int(2) NOT NULL,
  `Photo` varchar(500) DEFAULT NULL,
  `PSSN1` bigint(14) DEFAULT NULL,
  `PASN2` varchar(9) DEFAULT NULL,
  `PASN3` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Accompanying`
--

INSERT INTO `Accompanying` (`Name`, `SSN`, `PassProtNumber`, `TelePhone`, `offerCode`, `SeateNumber`, `Photo`, `PSSN1`, `PASN2`, `PASN3`) VALUES
('خالد محمد حسن عبد الكريم', NULL, 'C32653M20', '01271292975', 300300, 12, '/home/mohamed/Downloads/FB_IMG_1563816661077.jpg', NULL, NULL, 'C32652M30'),
('إيهاب حسن عبد الكريم', NULL, 'C32653M21', '01011526937', 300300, 13, '/home/mohamed/Downloads/FB_IMG_1563817912816.jpg', NULL, NULL, 'C32652M30'),
('محمد على إبراهيم على', NULL, 'A11250N63', '01273101459', 300300, 14, '/home/mohamed/Pictures/Webcam/2019-07-01-190018.jpg', NULL, NULL, 'C32652M30'),
('عبد الله عصام صقر', NULL, 'C22M15321', '01278845323', 200200, 4, '/home/mohamed/Pictures/fd30ac30cf28580e68297bb5d5cd3938.jpg', NULL, 'C22M14320', NULL),
('زياد على إبراهيم على', NULL, 'C23M31341', '01227880422', 200200, 5, '/home/mohamed/Downloads/FB_IMG_1562848471823.jpg', NULL, 'C22M14320', NULL),
('طارق محمد رفعت', '29806130200095', NULL, '01542035012', 100201, 2, NULL, 20004270200095, NULL, NULL),
('أحمد محمد حكام', '29903160100095', NULL, '01227880422', 100201, 3, NULL, 20004270200095, NULL, NULL),
('محمد نصر البنا', '29805130200095', NULL, '01067380251', 100201, 44, NULL, 29805140200195, NULL, NULL),
('عبد الرحمن علاء الدين', '29808160200095', NULL, '01228718336', 100201, 45, NULL, 29805140200195, NULL, NULL),
('محمد احمد على', '29802040300093', NULL, '01273101459', 100201, 5, NULL, 29830605040100, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `Name` varchar(50) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `Telephone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Admin`
--

INSERT INTO `Admin` (`Name`, `userName`, `password`, `Telephone`) VALUES
('محمد على إبراهيم على', 'mohamed12', 'admin1', '01273101459');

-- --------------------------------------------------------

--
-- Stand-in structure for view `EditOffer`
-- (See below for the actual view)
--
CREATE TABLE `EditOffer` (
`trip_code` int(6)
,`trip_Name` varchar(20)
,`trip_coast` int(6)
,`trip_descrip` varchar(500)
,`Supervisor_id` int(6)
,`Name` varchar(20)
,`Telephone` varchar(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `EditOffer1`
-- (See below for the actual view)
--
CREATE TABLE `EditOffer1` (
`trip_code` int(6)
,`trip_Name` varchar(20)
,`trip_coast` int(6)
,`trip_descrip` varchar(500)
,`Id` int(6)
,`Name` varchar(20)
,`Telephone` varchar(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `EditOffer2`
-- (See below for the actual view)
--
CREATE TABLE `EditOffer2` (
`trip_code` int(6)
,`trip_Name` varchar(20)
,`trip_coast` int(6)
,`trip_descrip` varchar(500)
,`Id` int(6)
,`Name` varchar(20)
,`Telephone` varchar(11)
);

-- --------------------------------------------------------

--
-- Table structure for table `Employee`
--

CREATE TABLE `Employee` (
  `id` int(6) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `SSN` bigint(14) NOT NULL,
  `Telephone` varchar(11) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `SocialMartial` varchar(6) NOT NULL,
  `Salary` int(5) NOT NULL,
  `JobDescrib` varchar(10) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `PassWord` varchar(20) NOT NULL,
  `Age` int(2) NOT NULL,
  `photo` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Employee`
--

INSERT INTO `Employee` (`id`, `Name`, `SSN`, `Telephone`, `Address`, `SocialMartial`, `Salary`, `JobDescrib`, `userName`, `PassWord`, `Age`, `photo`) VALUES
(102102, 'زياد على إبراهيم على', 30004270300138, '01227880422', 'مساكن المعلمين عمارة قاسم امين مدخل أ', 'اعزب', 5800, 'مشرف', 'zyad950', 'zyad2000', 19, '/home/mohamed/Downloads/FB_IMG_1562848471823.jpg'),
(102103, 'محمد صالح سليم مسلم', 29811050600095, '01021471128', 'اشلاء السواحل عماره 22 مدخل أ', 'اعزب', 5500, 'مشرف', 'صالح12', '123123', 24, '/home/mohamed/Pictures/IMG_20181002_144802.jpg'),
(102104, 'كريم اسماعيل إبراهيم', 29705160500095, '01200129407', 'الزهور مساكن عمر بن الخطاب عماره 10', 'متزوج', 4500, 'مسئول خزنه', 'كيمو20', '123456', 22, '/home/mohamed/Downloads/IMG_20181002_125317_1~2.jpg'),
(102105, 'محمد علاء الحفنى', 29805140600095, '01289643240', 'حى الزهور عماره 6 مدخل أ شقه 12', 'اعزب', 7000, 'مشرف', 'hfny11', '123456', 21, '/home/mohamed/Downloads/FB_IMG_1562791071496.jpg'),
(102106, 'محمد حسن حسين عوف', 29815050300095, '01013633101', 'الزهور عماره 5 شقه 11', 'اعزب', 5500, 'مشرف', 'auf20', '123123', 21, '/home/mohamed/Pictures/Screenshot from 2019-07-11 13-25-31.png'),
(102107, 'محمد محمود على عطية ', 29805150400095, '01288853296', 'عمارات الهيئه امام مصيف الهيئه بروفؤاد', 'متزوج', 3500, 'مشرف', 'ghandour11', '123123', 21, '/home/mohamed/Downloads/FB_IMG_1562844674109.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `External_Reservarion`
--

CREATE TABLE `External_Reservarion` (
  `PassportNumber` varchar(9) NOT NULL,
  `cust_name` varchar(20) NOT NULL,
  `Telephone` varchar(11) NOT NULL,
  `cash` varchar(3) NOT NULL,
  `Offer_Code` int(6) NOT NULL,
  `Number_Seate` int(2) NOT NULL,
  `photo` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `External_Reservarion`
--

INSERT INTO `External_Reservarion` (`PassportNumber`, `cust_name`, `Telephone`, `cash`, `Offer_Code`, `Number_Seate`, `photo`) VALUES
('C32652M30', 'حسام حسن عبد الكريم', '01011526937', 'نعم', 300300, 11, '/home/mohamed/Downloads/FB_IMG.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `Internal_Reservarion`
--

CREATE TABLE `Internal_Reservarion` (
  `SSN` bigint(14) NOT NULL,
  `cust_name` varchar(20) NOT NULL,
  `Telephone` varchar(11) NOT NULL,
  `cash` varchar(3) NOT NULL,
  `Offer_Code` int(6) NOT NULL,
  `Number_Seate` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Internal_Reservarion`
--

INSERT INTO `Internal_Reservarion` (`SSN`, `cust_name`, `Telephone`, `cash`, `Offer_Code`, `Number_Seate`) VALUES
(20004270200095, 'زياد على إبراهيم على', '01227880422', 'نعم', 100201, 1),
(29805140200195, 'محمد وائل محمد', '01210758366', 'نعم', 100201, 43),
(29830605040100, 'رؤوف ابن عبد الخليف', '01227880422', 'نعم', 100201, 4);

-- --------------------------------------------------------

--
-- Table structure for table `Itinerary`
--

CREATE TABLE `Itinerary` (
  `trip_Name` varchar(20) NOT NULL,
  `trip_cover` varchar(80) NOT NULL,
  `trip_descrip` varchar(500) NOT NULL,
  `trip_coast` int(6) NOT NULL,
  `trip_code` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Itinerary`
--

INSERT INTO `Itinerary` (`trip_Name`, `trip_cover`, `trip_descrip`, `trip_coast`, `trip_code`) VALUES
('شرم شهر7', '/home/mohamed/Downloads/13269010084_c1179c8593_o-lr.jpg', 'اليوم الأول\nهنتسكن فى فندق خمس نجوم وبعدها ننزل البسيم ونلعب ونظقطط \nونروح خليج نعمة\nاليوم التانى \nهنروح اليخت نروح منطقة الشعب ونعمل الغوص والاسنوركلنج\nاليوم الاخير\nنروح السوق ونروح الممشى ونروح الشط للالعاب المائية وبليل نسهر سهره حلوه فى كافيه حلو ونرجع علطول', 2950, 100200),
('الغردقة نص شهر 7', '/home/mohamed/Downloads/170470326.jpg', 'اليوم الأول\nهنتسكن فى فندق خمس نجوم وبعدها ننزل البسيم ونلعب ونظقطط \nونروح اكوا بارك للرغبة\nاليوم التانى \nهنروح اليخت نروح منطقة الشعب ونعمل الغوص والاسنوركلنج\nاليوم الاخير\nنروح السوق ونروح الممشى ونروح الشط للالعاب المائية وبليل نسهر سهره حلوه فى كافيه حلو ونرجع علطول', 3200, 100201),
('رحلة إلى القاهره', '/home/mohamed/Downloads/170470326.jpg', 'القاهره يوم واحد هنزور فيه الاهرامات و مصر القديمه \nوبعدها على اخر النهار هنروح صبحى كابر نلمى التانك ونبقا جاهوين\nاننا نروح خان الخليلى ونصلى ونجيب تزكارتا ونروح كارفور نشترى\nالعروص الحصريه اللى هناك ونروح بالسلامه', 250, 100202),
('عمره شهر ذى القعده', '/home/mohamed/Downloads/العمرة.jpg', '10 ايام ما بين مكة و المدينه والرحله برى والاقامه فى فندق 4 نجوم ', 20500, 200200),
('عمره ذى القعده طيران', '/home/mohamed/Downloads/العمرة.jpg', 'الرحلة 10 ايام هنروح على مطار المدينه هنروح المدينه نزور الرسول\nونروح الروضه بتاعت الرسول ونزور الصحابة وبعدها نروح مكة نعمل\nالعمره ونرجع بلدنا', 30000, 200201),
('رحلة إلى فرنسا', '/home/mohamed/Downloads/france-large.jpg', 'الرحلة مكونه من اسبوع هنزور فيها معالم فرنسا كلها و هنسكن فى\nفندق خمس نجوم و الرحلة تحوى على فطار وعشاء وكمان فى الاسبوع\nهنزور الريف الفرنسى متحف اللوفر وهنسكن فى الريف مع الفلاحين\nالفرنسيين للتعرف على حياتهم', 23000, 300300);

-- --------------------------------------------------------

--
-- Table structure for table `Note`
--

CREATE TABLE `Note` (
  `Title` varchar(15) NOT NULL,
  `note` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Note`
--

INSERT INTO `Note` (`Title`, `note`) VALUES
('اسكندرية', 'بفكر نفسى انى اعمل رحلة لاسكندرية شهر 9 اللى جاى بسعر حنين'),
('القاهره', 'اعمل رحلة للقاهره شهر 10 بمزانية تتراوح ما بين 20 لل 350');

-- --------------------------------------------------------

--
-- Table structure for table `SuperViser_id`
--

CREATE TABLE `SuperViser_id` (
  `Supervisor_id` int(6) NOT NULL,
  `tripe_code` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `SuperViser_id`
--

INSERT INTO `SuperViser_id` (`Supervisor_id`, `tripe_code`) VALUES
(102102, 100202),
(102103, 100202),
(102104, 100200),
(102105, 100201);

-- --------------------------------------------------------

--
-- Table structure for table `SuperViser_id1`
--

CREATE TABLE `SuperViser_id1` (
  `Id` int(6) NOT NULL,
  `Trip_code` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `SuperViser_id1`
--

INSERT INTO `SuperViser_id1` (`Id`, `Trip_code`) VALUES
(102107, 200200),
(102106, 200201),
(102105, 200201);

-- --------------------------------------------------------

--
-- Table structure for table `SuperViser_id2`
--

CREATE TABLE `SuperViser_id2` (
  `Id` int(6) NOT NULL,
  `Trip_code` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `SuperViser_id2`
--

INSERT INTO `SuperViser_id2` (`Id`, `Trip_code`) VALUES
(102102, 300300),
(102106, 300300);

-- --------------------------------------------------------

--
-- Table structure for table `Umrah_Reservarion`
--

CREATE TABLE `Umrah_Reservarion` (
  `PassportNumber` varchar(9) NOT NULL,
  `cust_name` varchar(20) NOT NULL,
  `Telephone` varchar(11) NOT NULL,
  `cash` varchar(3) NOT NULL,
  `Offer_Code` int(6) NOT NULL,
  `Number_Seate` int(2) NOT NULL,
  `photo` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Umrah_Reservarion`
--

INSERT INTO `Umrah_Reservarion` (`PassportNumber`, `cust_name`, `Telephone`, `cash`, `Offer_Code`, `Number_Seate`, `photo`) VALUES
('C22M14320', 'على إبراهيم على', '01228483241', 'نعم', 200200, 3, '/home/mohamed/Downloads/SAM_0275.JPG');

-- --------------------------------------------------------

--
-- Structure for view `EditOffer`
--
DROP TABLE IF EXISTS `EditOffer`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `EditOffer`  AS  select `Itinerary`.`trip_code` AS `trip_code`,`Itinerary`.`trip_Name` AS `trip_Name`,`Itinerary`.`trip_coast` AS `trip_coast`,`Itinerary`.`trip_descrip` AS `trip_descrip`,`SuperViser_id`.`Supervisor_id` AS `Supervisor_id`,`Employee`.`Name` AS `Name`,`Employee`.`Telephone` AS `Telephone` from ((`Employee` join `Itinerary`) join `SuperViser_id`) where ((`SuperViser_id`.`Supervisor_id` = `Employee`.`id`) and (`Itinerary`.`trip_code` = `SuperViser_id`.`tripe_code`)) ;

-- --------------------------------------------------------

--
-- Structure for view `EditOffer1`
--
DROP TABLE IF EXISTS `EditOffer1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `EditOffer1`  AS  select `Itinerary`.`trip_code` AS `trip_code`,`Itinerary`.`trip_Name` AS `trip_Name`,`Itinerary`.`trip_coast` AS `trip_coast`,`Itinerary`.`trip_descrip` AS `trip_descrip`,`SuperViser_id1`.`Id` AS `Id`,`Employee`.`Name` AS `Name`,`Employee`.`Telephone` AS `Telephone` from ((`Employee` join `Itinerary`) join `SuperViser_id1`) where ((`SuperViser_id1`.`Id` = `Employee`.`id`) and (`Itinerary`.`trip_code` = `SuperViser_id1`.`Trip_code`)) ;

-- --------------------------------------------------------

--
-- Structure for view `EditOffer2`
--
DROP TABLE IF EXISTS `EditOffer2`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `EditOffer2`  AS  select `Itinerary`.`trip_code` AS `trip_code`,`Itinerary`.`trip_Name` AS `trip_Name`,`Itinerary`.`trip_coast` AS `trip_coast`,`Itinerary`.`trip_descrip` AS `trip_descrip`,`SuperViser_id2`.`Id` AS `Id`,`Employee`.`Name` AS `Name`,`Employee`.`Telephone` AS `Telephone` from ((`Employee` join `Itinerary`) join `SuperViser_id2`) where ((`SuperViser_id2`.`Id` = `Employee`.`id`) and (`Itinerary`.`trip_code` = `SuperViser_id2`.`Trip_code`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Accompanying`
--
ALTER TABLE `Accompanying`
  ADD UNIQUE KEY `PassportNumber` (`PassProtNumber`),
  ADD KEY `PSSN1` (`PSSN1`,`PASN2`,`PASN3`),
  ADD KEY `PSSN2` (`PASN2`),
  ADD KEY `PSSN3` (`PASN3`);

--
-- Indexes for table `Employee`
--
ALTER TABLE `Employee`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD UNIQUE KEY `SSN` (`SSN`);

--
-- Indexes for table `External_Reservarion`
--
ALTER TABLE `External_Reservarion`
  ADD PRIMARY KEY (`PassportNumber`),
  ADD KEY `Offer_Code` (`Offer_Code`);

--
-- Indexes for table `Internal_Reservarion`
--
ALTER TABLE `Internal_Reservarion`
  ADD PRIMARY KEY (`SSN`),
  ADD KEY `Offer_Code` (`Offer_Code`);

--
-- Indexes for table `Itinerary`
--
ALTER TABLE `Itinerary`
  ADD PRIMARY KEY (`trip_code`);

--
-- Indexes for table `Note`
--
ALTER TABLE `Note`
  ADD PRIMARY KEY (`Title`);

--
-- Indexes for table `SuperViser_id`
--
ALTER TABLE `SuperViser_id`
  ADD KEY `Supervisor_id` (`Supervisor_id`),
  ADD KEY `tripe_code` (`tripe_code`);

--
-- Indexes for table `SuperViser_id1`
--
ALTER TABLE `SuperViser_id1`
  ADD KEY `Id` (`Id`),
  ADD KEY `Trip_code_2` (`Trip_code`);

--
-- Indexes for table `SuperViser_id2`
--
ALTER TABLE `SuperViser_id2`
  ADD KEY `Trip_code` (`Trip_code`),
  ADD KEY `Id` (`Id`);

--
-- Indexes for table `Umrah_Reservarion`
--
ALTER TABLE `Umrah_Reservarion`
  ADD PRIMARY KEY (`PassportNumber`),
  ADD KEY `Offer_Code` (`Offer_Code`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Accompanying`
--
ALTER TABLE `Accompanying`
  ADD CONSTRAINT `Accompanying_ibfk_1` FOREIGN KEY (`PSSN1`) REFERENCES `Internal_Reservarion` (`SSN`),
  ADD CONSTRAINT `Accompanying_ibfk_2` FOREIGN KEY (`PASN2`) REFERENCES `Umrah_Reservarion` (`PassportNumber`),
  ADD CONSTRAINT `Accompanying_ibfk_3` FOREIGN KEY (`PASN3`) REFERENCES `External_Reservarion` (`PassportNumber`);

--
-- Constraints for table `External_Reservarion`
--
ALTER TABLE `External_Reservarion`
  ADD CONSTRAINT `External_Reservarion_ibfk_1` FOREIGN KEY (`Offer_Code`) REFERENCES `SuperViser_id2` (`Trip_code`);

--
-- Constraints for table `Internal_Reservarion`
--
ALTER TABLE `Internal_Reservarion`
  ADD CONSTRAINT `Internal_Reservarion_ibfk_1` FOREIGN KEY (`Offer_Code`) REFERENCES `SuperViser_id` (`tripe_code`);

--
-- Constraints for table `SuperViser_id`
--
ALTER TABLE `SuperViser_id`
  ADD CONSTRAINT `SuperViser_id_ibfk_2` FOREIGN KEY (`tripe_code`) REFERENCES `Itinerary` (`trip_code`),
  ADD CONSTRAINT `SuperViser_id_ibfk_3` FOREIGN KEY (`Supervisor_id`) REFERENCES `Employee` (`id`);

--
-- Constraints for table `SuperViser_id1`
--
ALTER TABLE `SuperViser_id1`
  ADD CONSTRAINT `SuperViser_id1_ibfk_3` FOREIGN KEY (`Trip_code`) REFERENCES `Itinerary` (`trip_code`),
  ADD CONSTRAINT `SuperViser_id1_ibfk_4` FOREIGN KEY (`Id`) REFERENCES `Employee` (`id`);

--
-- Constraints for table `SuperViser_id2`
--
ALTER TABLE `SuperViser_id2`
  ADD CONSTRAINT `SuperViser_id2_ibfk_3` FOREIGN KEY (`Trip_code`) REFERENCES `Itinerary` (`trip_code`),
  ADD CONSTRAINT `SuperViser_id2_ibfk_4` FOREIGN KEY (`Id`) REFERENCES `Employee` (`id`);

--
-- Constraints for table `Umrah_Reservarion`
--
ALTER TABLE `Umrah_Reservarion`
  ADD CONSTRAINT `Umrah_Reservarion_ibfk_1` FOREIGN KEY (`Offer_Code`) REFERENCES `SuperViser_id1` (`Trip_code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
