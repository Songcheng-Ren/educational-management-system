/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : final

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 20/07/2022 11:09:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `adminID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adminID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('001', '123', '计算机学院');

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill`  (
  `s_id` varchar(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `amount` decimal(10, 2) NOT NULL,
  `place` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `time` datetime NOT NULL,
  `balance` decimal(5, 1) NOT NULL,
  PRIMARY KEY (`s_id`, `time`) USING BTREE,
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `student` (`sID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES ('11274', 50.00, '西园', '2022-05-13 09:19:15', 500.0);
INSERT INTO `bill` VALUES ('11274', 100.00, '东园', '2022-07-14 15:11:02', 900.0);
INSERT INTO `bill` VALUES ('11274', 18.00, '水果店', '2022-07-15 08:42:13', 300.0);
INSERT INTO `bill` VALUES ('11274', 10.00, '洗澡', '2022-07-17 08:42:48', 900.0);
INSERT INTO `bill` VALUES ('11274', 19.00, '小吃城', '2022-07-19 08:43:15', 100.0);

-- ----------------------------
-- Table structure for class_schedule
-- ----------------------------
DROP TABLE IF EXISTS `class_schedule`;
CREATE TABLE `class_schedule`  (
  `sID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `course_id` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `course_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dept_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `credits` int NOT NULL,
  `time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`course_id`, `sID`) USING BTREE,
  INDEX `dept_name`(`dept_name`) USING BTREE,
  CONSTRAINT `class_schedule_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of class_schedule
-- ----------------------------
INSERT INTO `class_schedule` VALUES ('11274', 'BI-356', 'Life Sciences', 'Biology', 3, '周一1-2节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'CS-315', 'Database Concepts', 'Comp.Sci.', 3, '周一3-4节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'CS-316', 'Introduct to Computer', 'Comp.Sci.', 3, '周一6-7节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'CS-319', 'testCourse', 'Comp.Sci.', 3, '周一8-10节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'CS-321', 'testCourse', 'Comp.Sci.', 3, '周一11-13节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'CS-347', 'Network', 'Comp.Sci.', 4, '周二1-2节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'FIN-201', 'Introdution to Finan', 'Finance', 2, '周二3-4节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'HI-101', 'Western History', 'History', 3, '周三1-2节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'MU-199', 'Music history', 'Music', 2, '周三3-4节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'PHY-101', 'Genery physics', 'Physics', 3, '周三6-7节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'test', 'courseTest', 'Music', 2, '周四8-10节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'TESTCA', 'CourseFinance', 'History', 3, '周四3-4节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'TESTCousre', 'CourseFinance', 'Finance', 3, '周四6-7节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'testid', 'testtitle', 'Biology', 4, '周五1-2节', '二基楼A207');
INSERT INTO `class_schedule` VALUES ('11274', 'TESTmn', 'CourseFinance', 'History', 3, '周五3-4节', '二基楼A207');

-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom`  (
  `building` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `room_no` int NOT NULL,
  `capacity` int NULL DEFAULT NULL,
  PRIMARY KEY (`building`, `room_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of classroom
-- ----------------------------
INSERT INTO `classroom` VALUES ('Packard', 101, 500);
INSERT INTO `classroom` VALUES ('Painter', 514, 10);
INSERT INTO `classroom` VALUES ('Taylor', 3128, 70);
INSERT INTO `classroom` VALUES ('Watson', 100, 30);
INSERT INTO `classroom` VALUES ('Watson', 120, 50);

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college`  (
  `college` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `introduction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`major`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of college
-- ----------------------------
INSERT INTO `college` VALUES ('华西临床医学院', '临床医学', 'nice');
INSERT INTO `college` VALUES ('华西临床医学院', '医学技术', '强');
INSERT INTO `college` VALUES ('软件学院', '软件工程', '很好');

-- ----------------------------
-- Table structure for comment_on_teaching
-- ----------------------------
DROP TABLE IF EXISTS `comment_on_teaching`;
CREATE TABLE `comment_on_teaching`  (
  `course_id` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `index` int(4) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `score` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`index`) USING BTREE,
  INDEX `course`(`course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of comment_on_teaching
-- ----------------------------
INSERT INTO `comment_on_teaching` VALUES ('BI-356', 0018, '58583', '100');
INSERT INTO `comment_on_teaching` VALUES ('BI-356', 0019, '58583', '100');
INSERT INTO `comment_on_teaching` VALUES ('CS-315', 0020, '10101', '100');
INSERT INTO `comment_on_teaching` VALUES ('HI-101', 0021, '11111', '100');
INSERT INTO `comment_on_teaching` VALUES ('BI-356', 0022, '58583', '90');
INSERT INTO `comment_on_teaching` VALUES ('CS-315', 0023, '10101', '10');
INSERT INTO `comment_on_teaching` VALUES ('CS-347', 0024, '12121', '哈哈哈');
INSERT INTO `comment_on_teaching` VALUES ('HI-101', 0025, '11111', '100');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `dept_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `credits` int NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('BI-356', 'Life Sciences', 'Biology', 3);
INSERT INTO `course` VALUES ('CS-315', 'Database Concepts', 'Comp.Sci.', 3);
INSERT INTO `course` VALUES ('CS-316', 'Introduct to Computer', 'Comp.Sci.', 3);
INSERT INTO `course` VALUES ('CS-319', 'testCourse', 'Comp.Sci.', 3);
INSERT INTO `course` VALUES ('CS-321', 'testCourse', 'Comp.Sci.', 3);
INSERT INTO `course` VALUES ('CS-347', 'Network', 'Comp.Sci.', 4);
INSERT INTO `course` VALUES ('FIN-201', 'Introdution to Finan', 'Finance', 2);
INSERT INTO `course` VALUES ('HI-101', 'Western History', 'History', 3);
INSERT INTO `course` VALUES ('MU-199', 'Music history', 'Music', 2);
INSERT INTO `course` VALUES ('PHY-101', 'Genery physics', 'Physics', 3);
INSERT INTO `course` VALUES ('test', 'courseTest', 'Music', 2);
INSERT INTO `course` VALUES ('TESTCA', 'CourseFinance', 'History', 3);
INSERT INTO `course` VALUES ('TESTCousre', 'CourseFinance', 'Finance', 3);
INSERT INTO `course` VALUES ('testid', 'testtitle', 'Biology', 4);
INSERT INTO `course` VALUES ('TESTmn', 'CourseFinance', 'History', 3);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `dept_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `building` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `budget` double NULL DEFAULT NULL,
  `introduce` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dept_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('Biology', 'Watson', 90000, NULL);
INSERT INTO `department` VALUES ('Comp.Sci.', 'Taylor', 100000, NULL);
INSERT INTO `department` VALUES ('Finance', 'Painter', 120000, NULL);
INSERT INTO `department` VALUES ('History', 'Painter', 50000, NULL);
INSERT INTO `department` VALUES ('Music', 'Packard', 80000, NULL);
INSERT INTO `department` VALUES ('Physics', 'Watson', 70000, NULL);

-- ----------------------------
-- Table structure for duty
-- ----------------------------
DROP TABLE IF EXISTS `duty`;
CREATE TABLE `duty`  (
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `duty` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tID`) USING BTREE,
  CONSTRAINT `duty_ibfk_1` FOREIGN KEY (`tID`) REFERENCES `instructor` (`tID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of duty
-- ----------------------------

-- ----------------------------
-- Table structure for enrollment_plan
-- ----------------------------
DROP TABLE IF EXISTS `enrollment_plan`;
CREATE TABLE `enrollment_plan`  (
  `year` year NOT NULL,
  `enrollment_plan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`year`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of enrollment_plan
-- ----------------------------

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `course_id` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sec_id` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `semester` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` decimal(4, 0) NOT NULL,
  `exam_id` varchar(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `building` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `room_no` int NULL DEFAULT NULL,
  `time` datetime NULL DEFAULT NULL,
  `duration` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`exam_id`) USING BTREE,
  INDEX `sec_id`(`sec_id`) USING BTREE,
  INDEX `semester`(`semester`) USING BTREE,
  INDEX `year`(`year`) USING BTREE,
  INDEX `exam_id`(`exam_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('CS-315', '1', 'Spring', 2010, '1', 'Packard', 101, '2022-07-17 20:00:00', '2h');
INSERT INTO `exam` VALUES ('HI-101', '1', 'Fall', 2009, '2', 'Painter', 514, '2022-07-16 20:00:00', '2h');
INSERT INTO `exam` VALUES ('CS-347', '1', 'Fall', 2009, '3', 'Taylor', 3128, '2022-07-12 20:00:00', '2h');
INSERT INTO `exam` VALUES ('FIN-201', '1', 'Spring', 2010, '4', 'Watson', 100, '2022-07-10 20:00:00', '1.5h');
INSERT INTO `exam` VALUES ('CS-316', '2', 'Spring', 2010, '5', 'Watson', 120, '2022-07-07 20:00:00', '2h');
INSERT INTO `exam` VALUES ('BI-356', '1', 'Fall', 2009, '7', 'Packard', 101, '2022-07-15 20:00:00', '1.5h');
INSERT INTO `exam` VALUES ('CS-315', '2', 'Fall', 2000, '8', 'Painter', 514, '2022-07-09 20:00:00', '2h');
INSERT INTO `exam` VALUES ('MU-199', '1', 'Spring', 2010, '9', 'Taylor', 3128, '2022-07-10 20:00:00', '1.5h');

-- ----------------------------
-- Table structure for exam_place
-- ----------------------------
DROP TABLE IF EXISTS `exam_place`;
CREATE TABLE `exam_place`  (
  `exam_id` varchar(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `building` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `room_no` int NOT NULL,
  `time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`exam_id`, `building`, `room_no`) USING BTREE,
  INDEX `building`(`building`, `room_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of exam_place
-- ----------------------------
INSERT INTO `exam_place` VALUES ('001', 'Packard', 101, '2022-07-15 09:52:46');

-- ----------------------------
-- Table structure for exam_score
-- ----------------------------
DROP TABLE IF EXISTS `exam_score`;
CREATE TABLE `exam_score`  (
  `sID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `course_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `credit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `course_attribute` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `exam_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `score` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sID`, `course_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of exam_score
-- ----------------------------
INSERT INTO `exam_score` VALUES ('11274', 'Chinese', '3', 'pass', '考试', '100');
INSERT INTO `exam_score` VALUES ('11274', 'history', '3', 'pass', '考试', '60');

-- ----------------------------
-- Table structure for fee
-- ----------------------------
DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee`  (
  `sID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cost_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cost` decimal(10, 2) NULL DEFAULT NULL,
  `pay_date` datetime(6) NULL DEFAULT NULL,
  `cost_state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sID`, `cost_name`) USING BTREE,
  CONSTRAINT `fee_ibfk_1` FOREIGN KEY (`sID`) REFERENCES `student` (`sID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of fee
-- ----------------------------
INSERT INTO `fee` VALUES ('11274', '书费', 100.00, '2022-07-13 14:47:40.000000', '已交');
INSERT INTO `fee` VALUES ('11274', '学位外语报名费', 100.00, '2022-07-13 14:47:40.000000', '未交');
INSERT INTO `fee` VALUES ('11274', '学费', 100.00, '2022-07-13 14:47:40.000000', '未交');
INSERT INTO `fee` VALUES ('11274', '报名费', 100.00, '2022-07-13 14:47:40.000000', '未交');
INSERT INTO `fee` VALUES ('11274', '毕业申请费', 100.00, '2022-07-13 14:47:40.000000', '未交');
INSERT INTO `fee` VALUES ('11274', '论文答辩费', 60.00, '2022-07-26 14:53:30.000000', '未交');

-- ----------------------------
-- Table structure for fixed_assets
-- ----------------------------
DROP TABLE IF EXISTS `fixed_assets`;
CREATE TABLE `fixed_assets`  (
  `dept_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fixed_assets` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dept_name`) USING BTREE,
  CONSTRAINT `fixed_assets_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of fixed_assets
-- ----------------------------

-- ----------------------------
-- Table structure for instructor
-- ----------------------------
DROP TABLE IF EXISTS `instructor`;
CREATE TABLE `instructor`  (
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dept_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `salary` decimal(8, 2) NULL DEFAULT NULL,
  `password` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Political_outlook` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `organization` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tID`) USING BTREE,
  INDEX `dept_name`(`dept_name`) USING BTREE,
  INDEX `tID`(`tID`, `name`) USING BTREE,
  CONSTRAINT `instructor_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of instructor
-- ----------------------------
INSERT INTO `instructor` VALUES ('10101', 'Srinivasan', 'Music', 90000.00, '1111', '123456', '党员', '教授', '一等', '事业编');
INSERT INTO `instructor` VALUES ('11111', 'testName', 'Biology', 70000.00, '111', '12345678910', '群众', '教授', '一等', '合同编');
INSERT INTO `instructor` VALUES ('12121', 'Wu', 'Finance', 90000.00, '111', '12345678910', '党员', '副教授', '二等', '事业编');
INSERT INTO `instructor` VALUES ('15151', 'Mozart', 'Music', 40000.00, '111', '12345678910', '党员', '副教授', '二等', '合同编');
INSERT INTO `instructor` VALUES ('22223', 'Kris', 'Comp.Sci.', 64000.00, '111', '12345678910', '群众', '教授', '一等', '事业编');
INSERT INTO `instructor` VALUES ('45565', 'Kats', 'Comp.Sci.', 75000.00, '111', '12345678910', '党员', '副教授', '一等', '合同编');
INSERT INTO `instructor` VALUES ('58583', 'Califieri', 'History', 62000.00, '111', '12345678910', '党员', '教授', '二等', '合同编');
INSERT INTO `instructor` VALUES ('76543', 'Singh', 'Finance', 80000.00, '111', '12345678910', '党员', '教授', '一等', '事业编');
INSERT INTO `instructor` VALUES ('83821', 'Brandt', 'Biology', 93000.00, '111', '12345678910', '群众', '教授', '二等', '合同编');
INSERT INTO `instructor` VALUES ('91544', 'Ben', 'Music', 50000.00, '111', '12345678910', '党员', '教授', '一等', '事业编');

-- ----------------------------
-- Table structure for instructor_paper
-- ----------------------------
DROP TABLE IF EXISTS `instructor_paper`;
CREATE TABLE `instructor_paper`  (
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `paper` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tID`) USING BTREE,
  CONSTRAINT `instructor_paper_ibfk_1` FOREIGN KEY (`tID`) REFERENCES `instructor` (`tID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of instructor_paper
-- ----------------------------

-- ----------------------------
-- Table structure for meeting
-- ----------------------------
DROP TABLE IF EXISTS `meeting`;
CREATE TABLE `meeting`  (
  `meeting_title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `date` datetime NULL DEFAULT NULL,
  `department` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`meeting_title`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of meeting
-- ----------------------------

-- ----------------------------
-- Table structure for official_document
-- ----------------------------
DROP TABLE IF EXISTS `official_document`;
CREATE TABLE `official_document`  (
  `adminID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `official_document` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `completion_status` binary(1) NULL DEFAULT NULL,
  PRIMARY KEY (`adminID`) USING BTREE,
  CONSTRAINT `official_document_ibfk_1` FOREIGN KEY (`adminID`) REFERENCES `administrator` (`adminID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of official_document
-- ----------------------------

-- ----------------------------
-- Table structure for profession
-- ----------------------------
DROP TABLE IF EXISTS `profession`;
CREATE TABLE `profession`  (
  `pID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `department` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `introduce` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of profession
-- ----------------------------

-- ----------------------------
-- Table structure for register_change
-- ----------------------------
DROP TABLE IF EXISTS `register_change`;
CREATE TABLE `register_change`  (
  `sID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `register_change` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sID`) USING BTREE,
  CONSTRAINT `register_change_ibfk_1` FOREIGN KEY (`sID`) REFERENCES `student` (`sID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of register_change
-- ----------------------------

-- ----------------------------
-- Table structure for scientific_project
-- ----------------------------
DROP TABLE IF EXISTS `scientific_project`;
CREATE TABLE `scientific_project`  (
  `project_ID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `project_status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`project_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of scientific_project
-- ----------------------------

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`  (
  `course_id` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sec_id` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `semester` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` decimal(4, 0) NOT NULL,
  `building` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `room_no` int NOT NULL,
  `date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`, `sec_id`, `semester`, `year`) USING BTREE,
  INDEX `building`(`building`, `room_no`) USING BTREE,
  INDEX `sec_id`(`sec_id`) USING BTREE,
  INDEX `semester`(`semester`) USING BTREE,
  INDEX `year`(`year`) USING BTREE,
  INDEX `sec_id_2`(`sec_id`, `semester`, `year`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  INDEX `sec_id_3`(`sec_id`, `semester`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('BI-356', '1', 'Fall', 2009, 'Watson', 120, NULL);
INSERT INTO `section` VALUES ('CS-315', '1', 'Spring', 2010, 'Packard', 101, NULL);
INSERT INTO `section` VALUES ('CS-315', '2', 'Fall', 2000, 'Watson', 120, NULL);
INSERT INTO `section` VALUES ('CS-316', '2', 'Spring', 2010, 'Taylor', 3128, NULL);
INSERT INTO `section` VALUES ('CS-347', '1', 'Fall', 2009, 'Painter', 514, NULL);
INSERT INTO `section` VALUES ('FIN-201', '1', 'Spring', 2010, 'Painter', 514, NULL);
INSERT INTO `section` VALUES ('HI-101', '1', 'Fall', 2009, 'Packard', 101, NULL);
INSERT INTO `section` VALUES ('MU-199', '1', 'Spring', 2010, 'Watson', 120, NULL);
INSERT INTO `section` VALUES ('testid', '1', 'Fall', 2020, 'Taylor', 3128, NULL);

-- ----------------------------
-- Table structure for sectionwithtimeslot
-- ----------------------------
DROP TABLE IF EXISTS `sectionwithtimeslot`;
CREATE TABLE `sectionwithtimeslot`  (
  `course_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sec_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `semester` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `year` decimal(4, 0) NULL DEFAULT NULL,
  `time_slot_id` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  INDEX `time_slot_id`(`time_slot_id`) USING BTREE,
  CONSTRAINT `sectionwithtimeslot_ibfk_1` FOREIGN KEY (`time_slot_id`) REFERENCES `time_slot` (`time_slot_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sectionwithtimeslot
-- ----------------------------
INSERT INTO `sectionwithtimeslot` VALUES ('CS-347', '1', 'Fall', 2009, 'B');
INSERT INTO `sectionwithtimeslot` VALUES ('CS-316', '2', 'Spring', 2010, 'C');
INSERT INTO `sectionwithtimeslot` VALUES ('CS-347', '1', 'Fall', 2009, 'A');
INSERT INTO `sectionwithtimeslot` VALUES ('CS-347', '1', 'Fall', 2009, 'C');
INSERT INTO `sectionwithtimeslot` VALUES ('CS-315', '1', 'Spring', 2010, 'D');
INSERT INTO `sectionwithtimeslot` VALUES ('HI-101', '1', 'Fall', 2009, 'F');
INSERT INTO `sectionwithtimeslot` VALUES ('BI-356', '1', 'Fall', 2009, 'E');
INSERT INTO `sectionwithtimeslot` VALUES ('MU-199', '1', 'Spring', 2010, 'G');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dept_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tot_cred` int NULL DEFAULT 0,
  `password` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone_number` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `home` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `enter` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sID`) USING BTREE,
  INDEX `dept_name`(`dept_name`) USING BTREE,
  INDEX `sID`(`sID`, `name`) USING BTREE,
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`dept_name`) REFERENCES `department` (`dept_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('001', 'xgq', 'Comp.Sci.', 0, '123', '14312', '川渝地区', '是');
INSERT INTO `student` VALUES ('10236', 'Jackey', 'History', 6, '123', '432144', '川渝地区', '是');
INSERT INTO `student` VALUES ('11274', 'Dan', 'Finance', 3, '123', '521432', '川渝地区', '是');
INSERT INTO `student` VALUES ('12138', 'Bella', 'Music', 0, '111', '351413', '云南', '是');
INSERT INTO `student` VALUES ('12472', 'Lisa', 'Comp.Sci.', 0, '111', '341345', '贵州', '是');
INSERT INTO `student` VALUES ('29572', 'Deft', 'Physics', 0, '111', '431521', '东北地区', '是');
INSERT INTO `student` VALUES ('39472', 'Rose', 'Physics', 0, '111', '135321', '东南地区', '是');
INSERT INTO `student` VALUES ('56614', 'Crisp', 'Music', 0, '111', '341561', '新疆', '是');
INSERT INTO `student` VALUES ('68302', 'Jennie', 'Biology', 2, '111', '134356', '其他', '否');

-- ----------------------------
-- Table structure for student_degree
-- ----------------------------
DROP TABLE IF EXISTS `student_degree`;
CREATE TABLE `student_degree`  (
  `s_ID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `student_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `student_degree` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`s_ID`) USING BTREE,
  INDEX `student_id`(`s_ID`) USING BTREE,
  CONSTRAINT `student_degree_ibfk_1` FOREIGN KEY (`s_ID`) REFERENCES `student` (`sID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_degree
-- ----------------------------

-- ----------------------------
-- Table structure for student_dorm
-- ----------------------------
DROP TABLE IF EXISTS `student_dorm`;
CREATE TABLE `student_dorm`  (
  `s_ID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `student_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `student_domitory` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`s_ID`) USING BTREE,
  CONSTRAINT `student_dorm_ibfk_1` FOREIGN KEY (`s_ID`) REFERENCES `student` (`sID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_dorm
-- ----------------------------
INSERT INTO `student_dorm` VALUES ('10236', 'Jackey', 'No6.West');

-- ----------------------------
-- Table structure for takes
-- ----------------------------
DROP TABLE IF EXISTS `takes`;
CREATE TABLE `takes`  (
  `sID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `course_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sec_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `semester` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `year` decimal(4, 0) NOT NULL,
  `grade` double NULL DEFAULT 0,
  `teacher_ID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `course_evaluate` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sID`, `course_id`, `sec_id`, `semester`, `year`, `teacher_ID`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  INDEX `sec_id`(`sec_id`, `semester`) USING BTREE,
  INDEX `year`(`year`) USING BTREE,
  CONSTRAINT `takes_ibfk_1` FOREIGN KEY (`sID`) REFERENCES `student` (`sID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `takes_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `section` (`course_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `takes_ibfk_3` FOREIGN KEY (`sec_id`, `semester`) REFERENCES `section` (`sec_id`, `semester`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `takes_ibfk_4` FOREIGN KEY (`year`) REFERENCES `section` (`year`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of takes
-- ----------------------------
INSERT INTO `takes` VALUES ('10236', 'BI-356', '1', 'Fall', 2009, 90, '58583', '否');
INSERT INTO `takes` VALUES ('10236', 'HI-101', '1', 'Fall', 2009, 60, '11111', '否');
INSERT INTO `takes` VALUES ('11274', 'BI-356', '1', 'Fall', 2009, 59, '58583', '是');
INSERT INTO `takes` VALUES ('11274', 'CS-315', '1', 'Spring', 2010, 0, '10101', '是');
INSERT INTO `takes` VALUES ('11274', 'CS-347', '1', 'Fall', 2009, 0, '12121', '是');
INSERT INTO `takes` VALUES ('11274', 'HI-101', '1', 'Fall', 2009, 60, '11111', '是');
INSERT INTO `takes` VALUES ('11274', 'MU-199', '1', 'Spring', 2010, 0, '83821', '否');
INSERT INTO `takes` VALUES ('56614', 'CS-315', '2', 'Spring', 2010, 0, '10101', '否');
INSERT INTO `takes` VALUES ('56614', 'CS-347', '1', 'Fall', 2009, 0, '12121', '否');
INSERT INTO `takes` VALUES ('56614', 'HI-101', '1', 'Fall', 2009, 0, '11111', '否');
INSERT INTO `takes` VALUES ('68302', 'FIN-201', '1', 'Spring', 2010, 0, '15151', '否');
INSERT INTO `takes` VALUES ('68302', 'FIN-201', '1', 'Spring', 2020, 80, '15151', '否');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('001', '123456');
INSERT INTO `teacher` VALUES ('002', '123456');

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info`  (
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `teacher_name` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `teacher_department` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `teacher_phone` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `teacher_Political_outlook` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `teacher_title` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `teacher_category` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `teacher_organization` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('111', 'lyx', 'music', '1234567', 'party member', 'professor', 'first_class', 'in establishment', '123456');
INSERT INTO `teacher_info` VALUES ('123', 'rsc', 'software', '12345678901', 'party member', 'professor', 'first_class', 'in establishment', '123456');

-- ----------------------------
-- Table structure for teaches
-- ----------------------------
DROP TABLE IF EXISTS `teaches`;
CREATE TABLE `teaches`  (
  `tID` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `course_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sec_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `semester` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `year` int NOT NULL,
  PRIMARY KEY (`tID`, `course_id`, `sec_id`, `semester`, `year`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teaches
-- ----------------------------
INSERT INTO `teaches` VALUES ('10101', 'CS-315', '1', 'Spring', 2010);
INSERT INTO `teaches` VALUES ('10101', 'Mu-199', '1', 'Spring', 2010);

-- ----------------------------
-- Table structure for time_slot
-- ----------------------------
DROP TABLE IF EXISTS `time_slot`;
CREATE TABLE `time_slot`  (
  `time_slot_id` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `day` enum('M','TU','W','TH','F','SA','SU') CHARACTER SET gbk COLLATE gbk_chinese_ci NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  PRIMARY KEY (`time_slot_id`, `day`, `start_time`) USING BTREE,
  INDEX `time_slot_id`(`time_slot_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of time_slot
-- ----------------------------
INSERT INTO `time_slot` VALUES ('A', 'M', '2020-03-08 08:00:00', '2020-03-08 08:50:00');
INSERT INTO `time_slot` VALUES ('B', 'M', '2020-03-08 09:00:00', '2020-03-08 09:50:00');
INSERT INTO `time_slot` VALUES ('C', 'M', '2020-03-08 11:00:00', '2020-03-08 11:50:00');
INSERT INTO `time_slot` VALUES ('D', 'M', '2020-03-08 13:00:00', '2020-03-08 13:50:00');
INSERT INTO `time_slot` VALUES ('E', 'TU', '2020-03-08 14:10:00', '2020-03-08 15:00:00');
INSERT INTO `time_slot` VALUES ('F', 'TU', '2020-03-08 15:10:00', '2020-03-08 16:00:00');
INSERT INTO `time_slot` VALUES ('G', 'W', '2020-03-08 16:10:00', '2020-03-08 17:00:00');
INSERT INTO `time_slot` VALUES ('H', 'W', '2020-03-08 18:10:00', '2020-03-08 19:00:00');

-- ----------------------------
-- Table structure for work_plan
-- ----------------------------
DROP TABLE IF EXISTS `work_plan`;
CREATE TABLE `work_plan`  (
  `tID` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `work_plan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `work_date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `className` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tID`, `work_plan`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of work_plan
-- ----------------------------
INSERT INTO `work_plan` VALUES ('001', '000', 'Fri Jul 15 2022 08:00:00 GMT+0800 (中国标准时间)', 'label-pink');
INSERT INTO `work_plan` VALUES ('001', '2', 'Fri Jul 29 2022 08:00:00 GMT+0800 (中国标准时间)', 'label-info');
INSERT INTO `work_plan` VALUES ('001', '777', 'Fri Jul 08 2022 08:00:00 GMT+0800 (中国标准时间)', 'label-purple');
INSERT INTO `work_plan` VALUES ('001', '答辩', 'Wed Jul 20 2022 08:00:00 GMT+0800 (中国标准时间)', 'label-success');

-- ----------------------------
-- Triggers structure for table takes
-- ----------------------------
DROP TRIGGER IF EXISTS `credits_reduced`;
delimiter ;;
CREATE TRIGGER `credits_reduced` AFTER UPDATE ON `takes` FOR EACH ROW BEGIN
	IF (OLD.grade > 59 AND OLD.grade IS NOT NULL 
              AND NEW.grade < 60)
       THEN
	UPDATE student 
	SET tot_cred = tot_cred -
		(SELECT credits
		FROM course
		WHERE course.course_id = NEW.course_id)
        WHERE student.`sID` = NEW.sID;
	END IF;
    END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table takes
-- ----------------------------
DROP TRIGGER IF EXISTS `credits_earned`;
delimiter ;;
CREATE TRIGGER `credits_earned` AFTER UPDATE ON `takes` FOR EACH ROW BEGIN
	IF (NEW.grade > 59 AND NEW.grade IS NOT NULL 
              AND (OLD.grade <60 OR OLD.grade IS NULL))
       THEN
	UPDATE student 
	SET tot_cred = tot_cred +
		(SELECT credits
		FROM course
		WHERE course.course_id = NEW.course_id)
        WHERE student.`sID` = NEW.sID;
	END IF;
    END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
