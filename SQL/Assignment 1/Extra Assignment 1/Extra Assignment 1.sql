DROP DATABASE IF EXISTS  FresherManagement;
CREATE DATABASE IF NOT EXISTS FresherManagement;
USE FresherManagement;
-- Exercise 1:Design a table 
-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
-- table Trainee
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee (
	TraineeID			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY , 
 	Full_Name			NVARCHAR(50) NOT NULL ,
 	Birth_Date 			DATETIME DEFAULT NOW() ,
 	Gender				ENUM('male','female','unknown') NOT NULL , 
 	ET_IQ				TINYINT UNSIGNED CHECK(ET_IQ>=0 AND ET_IQ<=20) , 
	ET_Gmath			TINYINT UNSIGNED CHECK(ET_Gmath>=0 AND ET_Gmath<=20) ,
 	ET_English			TINYINT UNSIGNED CHECK(ET_English>=0 AND ET_English<=50) ,
 	Training_Class		VARCHAR(20) NOT NULL ,
 	Evaluation_Notes	TEXT
);
-- Question 2: thêm trường VTI_Account với điều kiện not null & unique
ALTER TABLE Trainee
ADD VTI_Account VARCHAR(50) NOT NULL UNIQUE KEY;

-- Exercise 2: Data Types
DROP TABLE IF EXISTS Exer1;
CREATE TABLE Exer1 (
	ID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Name			VARCHAR(50) NOT NULL,
    Code			CHAR(5) NOT NULL,
    ModifiedDate	DATETIME DEFAULT NOW()
);

-- Exercise 3: Data Types (2)
DROP TABLE IF EXISTS Exer2;
CREATE TABLE Exer2 (
	ID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Name			VARCHAR(50) NOT NULL,
    BirthDate		DATETIME DEFAULT NOW(),
    Gender			ENUM('0','1'),
    IsDeletedFlag	BIT
);