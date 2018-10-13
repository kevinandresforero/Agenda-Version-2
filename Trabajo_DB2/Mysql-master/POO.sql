-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: agenda
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contactos`
--

DROP TABLE IF EXISTS `contactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `contactos` (
  `con_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del contacto',
  `con_nombre` varchar(30) NOT NULL COMMENT 'nombre del contacto',
  `con_apellido` varchar(30) NOT NULL COMMENT 'apellido del contacto',
  `con_telefono_domicilio` varchar(15) NOT NULL COMMENT 'telefono de la casa',
  `con_telefono_oficina` varchar(15) NOT NULL COMMENT 'telefono trabajo',
  `con_celular` varchar(20) NOT NULL COMMENT 'celular personal',
  `con_correo` varchar(150) NOT NULL COMMENT 'email personal',
  `con_direccion_residencia` varchar(150) NOT NULL COMMENT 'direccion de residencia',
  `con_direccion_trabajo` varchar(150) NOT NULL COMMENT 'direccion de trabajo',
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='tabla con los nombres de conocidos';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos`
--

LOCK TABLES `contactos` WRITE;
/*!40000 ALTER TABLE `contactos` DISABLE KEYS */;
INSERT INTO `contactos` VALUES (1,'juan antonio','perez diaz','2621119','8654321','3127890987','jperezd@mail.com','cra 22 # 30 -98','trans 23 # 45 -7'),(2,'Johan','Rincon Amaya','8932066','8654321','7007894469','Johanrmania@hotmail.com','cra 12 # 10 -45','trans 63 # 23 -2'),(3,'Nicolas','Gutierres Morales','4974320','7007894469','3143364257','nclgutierrezm@udistrital.edu.co','cra 3 # 60 -35','trans 13 # 33 -12'),(4,'jose','Diaz Aguilar','4610710','8197908439','3106010259','nikolozgotve@hotmail.com','cra 1 # 11 -89','trans 1 # 13 -72'),(5,'Cristian','Yara Pardo','5701252','5297324739','3204231096','cmyarap@udistrital.edu.co','cra 3 # 21 -19','trans 32 # 54 -24'),(6,'Juan Felipe','Herrera Poveda','8285065','51732323739','3188419339','jfherrerap@udistrital.edu.co','cra 24 # 65 -2','trans 72 # 4 -14'),(7,'Fabian Enrique','Leon','4516130','52838934739','3207649016','feleon;@udistrital.edu.co','cra 74 # 5 -12','trans 53 # 1 -31'),(8,'juan antonio','perez diaz','2621119','8654321','3127890987','jperezd@mail.com','cra 22 # 30 -98','trans 23 # 45 -7'),(9,'Esteban','Norato Triana','2517629','47328129273','3193398040','jenoratot@udistrital.edu.co','cra 24 # 1 -9','trans 93 # 3 -1'),(10,'Ivan Santiago','Chauta Gaviria','3529102','41332324312243','3506632164','Santiagochauta@gmail.com','cra 71  # 3 -19','trans 1 # 10 -83'),(11,'kevin Forero','Guaitero','4178898','6133433412243','3204178898','Kevinandresforero@hotmail.com','cra 11  # 43 -59','trans 31 # 20 -63'),(12,'Alex','Rodriguez','7156701','63234356712243','3138040642','alexho2401@hotmail.com','cra 88  # 13 -79','trans 02 # 9 -9'),(13,'Vivian','Peña Hutado','7427353','7654321312','3114612307','Pavipehu1@gmail.com','cra 91 # 10 -7','trans 21 # 39 -27'),(14,'Alejandro','Gonzáles','7033212','5654321313','3173881033','diegobermu1003@gmail.com','cra 99 # 1 -72','trans 21 # 99 -77'),(15,'Nicolas','Valderrama','4022153','3654321311','3143155135','expectropatrum@gmail.com','cra 89 # 18 -47','trans 11 # 91 -21'),(16,'Camilo Andrés','Caimán','4610589','4654321324','3005931246','caimanco8@gmail.com','cra 9 # 28 -474','trans 21 # 11 -11'),(17,'Kevin Duvam','Bernal Ortiz','7782636','2654321329','3132248033','kevinbernalortiz@gmail.com','cra 19 # 88 -77','trans 28 # 71 -61'),(18,'Julian Felipe','Olaya Torres','43811237','2154321326','3202881648','julianfelipeoxd@outlook.es','cra 39 # 18 -37','trans 08 # 11 -21'),(19,'Leider ',' Correa','7367012','8154321329','3205366740','leiderre14@gmail.com','cra 25 # 58 -57','trans 04 # 81 -91'),(20,'Jefferson ',' Bojaca','2981148','715458971321','3204333497','manuel.bojaca@outlook.com','cra 75 # 19 -77','trans 41 # 31 -81');
/*!40000 ALTER TABLE `contactos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-30 21:26:45
