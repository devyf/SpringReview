/*
 Navicat Premium Data Transfer

 Source Server         : localhost3306
 Source Server Type    : MySQL
 Source Server Version : 50525
 Source Host           : localhost:3306
 Source Schema         : springtxtest

 Target Server Type    : MySQL
 Target Server Version : 50525
 File Encoding         : 65001

 Date: 15/02/2021 01:03:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `money` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('lucy', 5500);
INSERT INTO `account` VALUES ('tom', 4500);

SET FOREIGN_KEY_CHECKS = 1;
