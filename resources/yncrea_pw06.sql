CREATE DATABASE  IF NOT EXISTS `yncrea_pw06`;
USE `yncrea_pw06`;

DROP TABLE IF EXISTS calevent;

CREATE TABLE calevent (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `start` datetime DEFAULT NULL,
  `end` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;


LOCK TABLES calevent WRITE;

INSERT INTO calevent VALUES
(1 ,'2018-01-29 03:00:00','2018-01-29 04:00:00','Event 1', '#FF0000','Description Test 1'),
(2 ,'2018-01-31 04:00:00','2018-01-31 05:00:00','Event 2', '#00FF00','Description Test 2'),
(3 ,'2018-02-02 05:00:00','2018-02-02 06:00:00','Event 3', '#0000FF','Description Test 3'),
(4 ,'2018-02-04 06:00:00','2018-02-04 07:00:00','Event 4', '#FFFF00','Description Test 4'),
(5 ,'2018-02-06 07:00:00','2018-02-06 08:00:00','Event 5', '#FF00FF','Description Test 5'),
(6 ,'2018-02-08 08:00:00','2018-02-08 09:00:00','Event 6', '#00FFFF','Description Test 6'),
(7 ,'2018-02-10 09:00:00','2018-02-10 10:00:00','Event 7', '#CCCCCC','Description Test 7'),
(8 ,'2018-02-12 10:00:00','2018-02-12 11:00:00','Event 8', '#FF0000','Description Test 8'),
(9 ,'2018-02-14 11:00:00','2018-02-14 12:00:00','Event 9', '#00FF00','Description Test 9'),
(10,'2018-02-16 12:00:00','2018-02-16 13:00:00','Event 10','#0000FF','Description Test 10'),
(11,'2018-02-18 13:00:00','2018-02-18 14:00:00','Event 11','#FFFF00','Description Test 11'),
(12,'2018-02-20 14:00:00','2018-02-20 15:00:00','Event 12','#FF00FF','Description Test 12'),
(13,'2018-02-22 15:00:00','2018-02-22 16:00:00','Event 13','#00FFFF','Description Test 13'),
(14,'2018-02-24 16:00:00','2018-02-24 17:00:00','Event 14','#CCCCCC','Description Test 14'),
(15,'2018-02-26 17:00:00','2018-02-26 18:00:00','Event 15','#FF0000','Description Test 15'),
(16,'2018-02-28 18:00:00','2018-02-28 19:00:00','Event 16','#00FF00','Description Test 16'),
(17,'2018-03-02 19:00:00','2018-03-02 20:00:00','Event 17','#0000FF','Description Test 17'),
(18,'2018-03-04 20:00:00','2018-03-04 21:00:00','Event 18','#FFFF00','Description Test 18');


UNLOCK TABLES;

