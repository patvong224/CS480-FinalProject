-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema meats
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema meats
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `meats` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `meats` ;

-- -----------------------------------------------------
-- Table `meats`.`basket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `meats`.`basket` (
  `basket_id` INT NOT NULL,
  `price_total` FLOAT NULL DEFAULT NULL,
  `software_total` INT NULL DEFAULT NULL,
  `points_total` INT NULL DEFAULT NULL,
  PRIMARY KEY (`basket_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `meats`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `meats`.`customer` (
  `username` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `meats`.`developer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `meats`.`developer` (
  `dev_name` INT NOT NULL,
  `year` INT NULL DEFAULT NULL,
  PRIMARY KEY (`dev_name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `meats`.`publisher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `meats`.`publisher` (
  `pub_name` VARCHAR(45) NOT NULL,
  `year` INT NULL DEFAULT NULL,
  PRIMARY KEY (`pub_name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `meats`.`software`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `meats`.`software` (
  `software_id` INT NOT NULL,
  `price` DOUBLE NULL DEFAULT NULL,
  `name` MEDIUMTEXT NULL DEFAULT NULL,
  `points_given` INT NULL DEFAULT NULL,
  `year` INT NULL DEFAULT NULL,
  PRIMARY KEY (`software_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
