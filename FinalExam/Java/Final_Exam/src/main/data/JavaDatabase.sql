DROP DATABASE IF EXISTS JavaData;
CREATE DATABASE IF NOT EXISTS JavaData;
USE JavaData;

DROP TABLE IF EXISTS Manager;
CREATE TABLE Manager 	(
	ManagerID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 		VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 			VARCHAR(50) UNIQUE KEY NOT NULL,
    Password		VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    ExpInYear		TINYINT UNSIGNED
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee 	(
	EmployeeID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 		VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 			VARCHAR(50) UNIQUE KEY NOT NULL,
    Password		VARCHAR(50) NOT NULL ,
    ProjectID		TINYINT UNSIGNED,
    ProSkill		ENUM('Dev', 'Test', 'Java', 'Sql') NOT NULL
);

DROP TABLE IF EXISTS Project;
CREATE TABLE Project 	(
	ProjectId		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	TeamSize 		TINYINT UNSIGNED,
	ManagerID		TINYINT UNSIGNED UNIQUE KEY,
	EmployeesID 	TINYINT UNSIGNED UNIQUE KEY
);

DROP TABLE IF EXISTS Employees;
CREATE TABLE Employees		(
	EmployeesID		TINYINT UNSIGNED ,
    ID				TINYINT UNSIGNED 
);

ALTER TABLE employee ADD CONSTRAINT FK_Project FOREIGN KEY (ProjectID) REFERENCES Project(ProjectId);
ALTER TABLE project ADD CONSTRAINT FK_Manager FOREIGN KEY (ManagerID) REFERENCES Manager(ManagerID);
ALTER TABLE employees ADD CONSTRAINT PK PRIMARY KEY (EmployeesID,ID);
ALTER TABLE project ADD CONSTRAINT FK_Employees FOREIGN KEY (EmployeesID) REFERENCES Employees(EmployeesID);
ALTER TABLE employees ADD CONSTRAINT FK_Employee FOREIGN KEY (ID) REFERENCES employee(EmployeeID);

INSERT INTO manager	(FullName			,Email					,Password		,ExpInYear)
VALUES				(N'Nguyễn Thị Mỵ'	,'email01@gmail.com'	, '123456789'	,1),
                    (N'Nguyễn Ngọc Duy'	,'email02@gmail.com'	, '123456789'	,3);
                    
INSERT INTO employee	(FullName			,Email					,Password		,ProSkill)
VALUES					(N'Nguyễn Thị Mỵ'	,'email01@gmail.com'	, '123456789'	,'Dev'),
						(N'Nguyễn Ngọc Duy'	,'email02@gmail.com'	, '123456789'	,'Java'),	
						(N'Nguyễn Hùng Mạnh','email03@gmail.com'	, '123456789'	,'Sql'),	
						(N'Tống Thị Nhung'	,'email04@gmail.com'	, '123456789'	,'Java'),
						(N'Trần Thị Kim Anh','email05@gmail.com'	, '123456789'	,'Dev');
                        
INSERT INTO employees 	(EmployeesID,ID)
VALUES					(1			,1),
						(1			,3),
                        (1			,4),
                        (2			,2),
                        (2			,5);
                        
INSERT INTO project 	(TeamSize	,ManagerID	,EmployeesID)
VALUES					(3			,1			,1),
						(2			,2			,2);
                        
