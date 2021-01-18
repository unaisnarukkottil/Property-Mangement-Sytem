/*This will create the necessary database and tables
 for the Property managemnet System to fuction properly*/ 
create database `pms`;
CREATE TABLE `pms`.`branch` (
 `branch_id` int(11) NOT NULL AUTO_INCREMENT,
 `username` varchar(45) NOT NULL,
 `password` varchar(45) NOT NULL,
 `name` varchar(45) NOT NULL,
 `address` varchar(45) NOT NULL,
 `phone` varchar(45) NOT NULL,
 `email` varchar(45) NOT NULL,
 `web_address` varchar(45) NOT NULL,
 PRIMARY KEY (`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;
CREATE TABLE `pms`.`sale` (
 `sale_id` int(11) NOT NULL AUTO_INCREMENT,
 `username` varchar(45) NOT NULL,
 `type` varchar(45) NOT NULL,
 `address` varchar(45) NOT NULL,
 `number_of_room` varchar(45) NOT NULL,
 `price` varchar(45) NOT NULL,
 `number_of_floor` varchar(45) DEFAULT NULL,
 `garden` varchar(45) DEFAULT NULL,
 `garage` varchar(45) DEFAULT NULL,
 `monthly_charge` varchar(45) DEFAULT NULL,
 `sold` tinyint(1) NOT NULL DEFAULT 0,
 `sold_price` varchar(45) DEFAULT NULL,
 PRIMARY KEY (`sale_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;