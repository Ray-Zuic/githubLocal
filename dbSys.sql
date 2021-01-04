/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.31-log : Database - tt
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tt` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tt`;

/*Table structure for table `checklist` */

DROP TABLE IF EXISTS `checklist`;

CREATE TABLE `checklist` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `checklist` */

/*Table structure for table `desk` */

DROP TABLE IF EXISTS `desk`;

CREATE TABLE `desk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `deskno` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `desk` */

insert  into `desk`(`id`,`deskno`,`userid`,`username`) values (1,1,1,'高琛皓'),(2,3,3,'时家庆'),(3,3,5,'王浩杰'),(4,2,6,'朱天宇'),(5,2,4,'黄翔'),(9,1,8,'詹强'),(10,3,7,'丁宇航');

/*Table structure for table `hotel` */

DROP TABLE IF EXISTS `hotel`;

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hotel` */

insert  into `hotel`(`id`,`name`) values (1,'项家庄'),(2,'北京烤鸭'),(3,'恒力大酒店'),(4,'苏源酒楼');

/*Table structure for table `hotel_vote` */

DROP TABLE IF EXISTS `hotel_vote`;

CREATE TABLE `hotel_vote` (
  `hotelid` int(11) DEFAULT NULL,
  `hotelname` varchar(20) DEFAULT NULL,
  `votername` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hotel_vote` */

insert  into `hotel_vote`(`hotelid`,`hotelname`,`votername`) values (1,'项家庄','高琛皓'),(2,'北京烤鸭','时家庆'),(4,'苏源酒楼','黄翔'),(1,'项家庄','朱天宇'),(3,'恒力大酒店','王浩杰'),(4,'苏源酒楼','詹强'),(4,'苏源酒楼','丁宇航');

/*Table structure for table `info` */

DROP TABLE IF EXISTS `info`;

CREATE TABLE `info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `context` text,
  `date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `info` */

insert  into `info`(`id`,`context`,`date`) values (1,'测试测试','2020-12-2'),(2,'测试1','2021-01-04'),(3,'测试2','2021-01-03'),(4,'测试4','2021-01-03'),(5,'测试44','2021-01-04');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(3) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(12) DEFAULT NULL COMMENT '姓名',
  `password` varchar(12) DEFAULT NULL COMMENT '密码',
  `mark` int(1) DEFAULT NULL COMMENT '身份码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`mark`) values (1,'高琛皓','123456',1),(2,'admin','123456',0),(3,'时家庆','123456',1),(4,'黄翔','123456',1),(5,'王浩杰','123456',1),(6,'朱天宇','123456',1),(7,'丁宇航','123456',1),(8,'詹强','123456',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
