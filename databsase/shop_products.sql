-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: shop
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(450) DEFAULT NULL,
  `category` varchar(450) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `image` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (2,'s','s',0,'C:xampphtdocs	wilight_terrace_hotelhomeassetsimagesgallery-1-final.jpg'),(3,'ssw','wdwd',0,'C:xampphtdocs	wilight_terrace_hotelhomeassetsimagesgallery-1-final.jpg'),(4,'de','eded',0,'C:xampphtdocs	wilight_terrace_hotelhomeassetsimagesgallery-1.jpg'),(5,'qsq','qsq',0,'uploads/null'),(6,'qsq','qsq',0,'uploads/null'),(7,'dwd','wddw',0,'uploads/1697854262923_gallery-1-final.jpg'),(8,'dwd','wddw',0,'uploads/1697854365826_gallery-4.jpg'),(9,'qsq','sqsq',0,'uploads/1697854448752_gallery-5-final.jpg'),(10,'wdwd','wdwd',0,'uploads/gallery-1-final.jpg'),(11,'qsqsq','qsqsqsq',0,'uploads/popular-2.jpg'),(12,'qwd','wwdw',0,'uploads/gallery-5.jpg'),(13,'effe','fefewfw',0,'uploads/gallery-5.jpg'),(14,'wdwwd','wdwd',0,'uploads/gallery-3.jpg'),(15,'wdw','wdwwd',0,'uploads/img9.jpg'),(16,'qs','qsq',0,'uploads/gallery-1-final.jpg'),(17,'qsq','qsqs',0,'uploads/gallery-2.jpg'),(18,'ww','wdwdw',0,'popular-1.jpg'),(19,'qwwq','w',0,'gallery-2.jpg'),(20,'w','w',0,'gallery-1-final.jpg');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-22  8:50:30
