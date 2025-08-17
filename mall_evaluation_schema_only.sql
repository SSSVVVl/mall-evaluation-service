-- MySQL dump 10.13  Distrib 8.4.0, for macos14 (arm64)
--
-- Host: 127.0.0.1    Database: mall_evaluation
-- ------------------------------------------------------
-- Server version	8.4.5

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `consult`
--

DROP TABLE IF EXISTS `consult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consult` (
  `consult_id` bigint NOT NULL AUTO_INCREMENT,
  `add_time` datetime NOT NULL,
  `avatar` varchar(100) DEFAULT NULL,
  `class_id` int NOT NULL,
  `class_name` varchar(255) NOT NULL,
  `common_id` int NOT NULL,
  `consult_content` varchar(200) NOT NULL,
  `consult_reply` varchar(500) DEFAULT NULL,
  `consult_reply_state` int NOT NULL,
  `member_id` int NOT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `read_state` int NOT NULL,
  `reply_time` datetime DEFAULT NULL,
  `store_id` int NOT NULL,
  `store_name` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`consult_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `consult_class`
--

DROP TABLE IF EXISTS `consult_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consult_class` (
  `class_id` bigint NOT NULL AUTO_INCREMENT,
  `class_name` varchar(100) DEFAULT NULL,
  `class_sort` int DEFAULT NULL,
  `introduce` varchar(5000) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `evaluate_goods`
--

DROP TABLE IF EXISTS `evaluate_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluate_goods` (
  `evaluate_id` bigint NOT NULL AUTO_INCREMENT,
  `common_id` int DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `content_again` varchar(500) DEFAULT NULL,
  `evaluate_num` int DEFAULT NULL,
  `evaluate_time` datetime DEFAULT NULL,
  `evaluate_time_again` datetime DEFAULT NULL,
  `explain_content` varchar(500) DEFAULT NULL,
  `explain_content_again` varchar(500) DEFAULT NULL,
  `goods_full_specs` varchar(255) DEFAULT NULL,
  `goods_id` int DEFAULT NULL,
  `goods_image` varchar(255) DEFAULT NULL,
  `goods_name` varchar(255) DEFAULT NULL,
  `has_image` int DEFAULT NULL,
  `images` varchar(500) DEFAULT NULL,
  `images_again` varchar(500) DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `orders_id` int DEFAULT NULL,
  `orders_sn` bigint DEFAULT NULL,
  `orders_type` int DEFAULT NULL,
  `scores` int DEFAULT NULL,
  `store_id` int DEFAULT NULL,
  `store_name` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`evaluate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=399 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `evaluate_store`
--

DROP TABLE IF EXISTS `evaluate_store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluate_store` (
  `evaluate_id` bigint NOT NULL AUTO_INCREMENT,
  `delivery_credit` int DEFAULT NULL,
  `description_credit` int DEFAULT NULL,
  `evaluate_time` datetime DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `member_name` varchar(255) DEFAULT NULL,
  `orders_id` int DEFAULT NULL,
  `orders_sn` bigint DEFAULT NULL,
  `orders_type` int DEFAULT NULL,
  `service_credit` int DEFAULT NULL,
  `store_id` int DEFAULT NULL,
  `store_name` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint DEFAULT NULL,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` bigint DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`evaluate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=163 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-07  5:59:48
