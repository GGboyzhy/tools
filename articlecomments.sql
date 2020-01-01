/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/01/2020 19:10:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for articlecomments
-- ----------------------------
DROP TABLE IF EXISTS `articlecomments`;
CREATE TABLE `articlecomments`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commentUserId` int(11) NOT NULL,
  `articleId` int(11) NOT NULL,
  `content` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `createTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100000 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
