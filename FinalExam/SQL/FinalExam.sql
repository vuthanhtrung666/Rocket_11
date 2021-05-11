DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE IF NOT EXISTS ThucTap;
USE ThucTap;
-- table Country
DROP TABLE IF EXISTS Country;
CREATE TABLE Country 	(
	Country_id		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Country_name	VARCHAR(50) NOT NULL
);
-- table Location
DROP TABLE IF EXISTS Location;
CREATE TABLE Location	(
	Location_id		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Street_address	VARCHAR(100) NOT NULL,
    Postal_code		SMALLINT UNSIGNED NOT NULL UNIQUE KEY,
    Country_id		SMALLINT UNSIGNED NOT NULL,
    CONSTRAINT FK_Country FOREIGN KEY (Country_id) REFERENCES Country(Country_id)
);
-- table Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee	(
	Employee_id		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
    Full_name		NVARCHAR(50) NOT NULL, 
    Email			VARCHAR(50) NOT NULL UNIQUE KEY, 
    Location_id		SMALLINT UNSIGNED,
    CONSTRAINT FK_Location FOREIGN KEY (Location_id) REFERENCES Location(Location_id) ON DELETE SET NULL
);
-- 1. Tạo table với các ràng buộc và kiểu dữ liệu
-- Thêm ít nhất 3 bản ghi vào table
-- insert data
INSERT INTO Country (Country_name) 
VALUES 				('Vietnam'),
					('United States'),
					('Portugal'),
					('Paraguay'),
					('Indonesia'),
					('Poland'),
					('Brazil'),
					('Portugal'),
					('Russia'),
					('Bolivia');
INSERT INTO Location 	(Street_address			, Postal_code	, Country_id) 
VALUES 					('070 Clove Point'		,  6			,  1	),
						('1 6th Place'			,  94			,  2	),
						('79964 Corry Place'	,  15   		,  2 	),
						('072 Almo Point'		,  0332			,  2	),
						('38 Hooker Drive'		,  56 			,  3	),
						('02 Pankratz Circle'	,  29579 		,  6	),
						('9 Little Fleur Drive'	,  43458		,  5	),
						('726 Beilfuss Point'	,  6778 		,  4	),
						('90956 Carberry Circle',  586 			,  4	),
						('9533 Hagan Drive'		,  315			,  7	);
INSERT INTO Employee 	(Full_name				, Email				, Location_id) 
VALUES 					('Shena Frayne'			, 'nn01@gmail.com'	,   1		),
						('Othello Crookshanks'	, 'nn02@gmail.com'	, 	2		),
						('Andrea Borthe'		, 'nn03@gmail.com'	, 	3		),
						('Babette MacKonochie'	, 'nn04@gmail.com'	,   4		),
						('Raynell Berthomier'	, 'nn05@gmail.com'	,   5		),
						('Rafi Baccas'			, 'nn06@gmail.com'	,   6		),
						('Ray Cowe'				, 'nn07@gmail.com'	,   7		),
						('Hasheem Greest'		, 'nn08@gmail.com'	,   8		),
						('Morgen Ellsworthe'	, 'nn09@gmail.com'	,   9		),
						('Gwenora Parsonson'	, 'nn10@gmail.com'	,   10		);
-- 2. Viết lệnh để
-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT 		e.Employee_id, e.Full_name, e.Email
FROM		employee e
JOIN		location l 	ON e.Location_id = l.Location_id
JOIN		country c  	ON c.Country_id = l.Country_id
WHERE		c.Country_name LIKE '%Vietnam%';
-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT 		c.Country_name
FROM		employee e
JOIN		location l 	ON e.Location_id = l.Location_id
JOIN		country c  	ON c.Country_id = l.Country_id
WHERE		e.Email LIKE '%nn03@gmail.com%';
-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
SELECT 		c.Country_name, l.Street_address, count(e.Location_id) AS Soluong
FROM		employee e
RIGHT JOIN	location l 	ON e.Location_id = l.Location_id
RIGHT JOIN 	country c  	ON c.Country_id = l.Country_id
GROUP BY	c.Country_id,l.Location_id;
-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS trigger_Country_Limit_10_Employee;
DELIMITER $$
CREATE TRIGGER trigger_Country_Limit_10_Employee
BEFORE INSERT ON employee
FOR EACH ROW
BEGIN
	DECLARE SoLuong TINYINT;
    SELECT 		count(e.Location_id) INTO SoLuong
	FROM		employee e
	RIGHT JOIN	location l 	ON e.Location_id = l.Location_id
	RIGHT JOIN 	country c  	ON c.Country_id = l.Country_id
	WHERE		c.Country_id = (SELECT Country_id from location WHERE Location_id = NEW.Location_id)
	GROUP BY	c.Country_id;
	IF SoLuong>=10 THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'mỗi quốc gia có tối đa 10 employee';
	END IF;
END $$
DELIMITER ;
SELECT 		c.Country_name, count(e.Location_id) AS SoLuong
FROM		employee e
RIGHT JOIN	location l ON e.Location_id = l.Location_id
RIGHT JOIN 	country c  ON c.Country_id = l.Country_id
WHERE		c.Country_id = (SELECT Country_id from location WHERE Location_id = 2)
GROUP BY	c.Country_id;
INSERT INTO Employee 	(Full_name				, Email				, Location_id) 
VALUES					('Othello Crookshanks1'	, 'nn021@gmail.com'	, 	2		),
						('Andrea Borthe1'		, 'nn031@gmail.com'	, 	3		),
						('Babette MacKonochie1'	, 'nn041@gmail.com'	,   4		),
                        ('Othello Crookshanks2'	, 'nn022@gmail.com'	, 	2		),
                        ('Andrea Borthe2'		, 'nn032@gmail.com'	, 	3		),
                        ('Babette MacKonochie2'	, 'nn042@gmail.com'	,   4		),
                        ('Othello Crookshanks3'	, 'nn023@gmail.com'	, 	2		),
                        ('Andrea Borthe3'		, 'nn033@gmail.com'	, 	3		),
                        ('Babette MacKonochie3'	, 'nn043@gmail.com'	,   4		);
-- 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
DELETE 
FROM 	location 
WHERE 	Location_id = '10';
SELECT	* 	
FROM	employee

