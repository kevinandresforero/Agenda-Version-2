-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: citas
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
-- Table structure for table `seleccionados`
--

DROP TABLE IF EXISTS `seleccionados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `seleccionados` (
  `con_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del contacto',
  `con_nombre` varchar(30) NOT NULL COMMENT 'nombre del contacto',
  `con_apellido` varchar(30) NOT NULL COMMENT 'apellido del contacto',
  `con_telefono` varchar(15) NOT NULL COMMENT 'numero celular',
  `con_cita_agenda` varchar(15) NOT NULL COMMENT 'Fecha de la cita',
  `con_dirección` varchar(20) NOT NULL COMMENT 'Dirección de la cita',
  `con_hora` varchar(150) NOT NULL COMMENT 'Hora de la cita',
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='tabla con los nombres de conocidos';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seleccionados`
--

LOCK TABLES `seleccionados` WRITE;
/*!40000 ALTER TABLE `seleccionados` DISABLE KEYS */;
INSERT INTO `seleccionados` VALUES (1,'Julian','Olaya Torres','3202882648','4/10/18','cra 22 # 30 -98','2:30 PM'),(2,'Nicolas','Valderrama','3143155135','12/10/18','cra 1 #10 -71','12:00 PM'),(3,'Vivian','Peña Hurtado','3114612307','23/11/18','cra 4 #21 -36','6:00 AM'),(4,'Alex','Rodriguez','3138040642','1/12/18','cra 1 #12 -25','9:00 AM'),(5,'Johan','Rincon Amaya','3007879469','3/12/18','cra 1 #12 -25','11:00 AM');
/*!40000 ALTER TABLE `seleccionados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-03 19:08:58
