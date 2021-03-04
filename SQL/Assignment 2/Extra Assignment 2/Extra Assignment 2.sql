USE freshermanagement;
-- Exercise 1: Tiếp tục với Database quản lý Fresher
-- Question 1: Thêm ít nhất 10 bản ghi vào table
INSERT INTO trainee (Full_Name				,Birth_Date	 ,Gender	,ET_IQ	,ET_Gmath,ET_English,Training_Class	,Evaluation_Notes,VTI_Account	)
VALUES				(N'Nguyễn Hải Đăng'		,'1993-04-04','unknown'	,14		,10		 ,30		,'1'			,''				 ,'account1'	),
					(N'Nguyen Chien Thang2'	,'1993-04-12','male'	,2		,4		 ,20		,'1'			,''				 ,'account2'	),
                    (N'Nguyen Van Chien'	,'1993-06-25','female'	,5		,7		 ,10		,'1'			,''				 ,'account3'	),
                    (N'Duong Do'			,'1993-06-07','female'	,8		,4		 ,15		,'1'			,''				 ,'account4'	),
                    (N'Nguyen Chien Thang1'	,'1993-06-03','unknown'	,10		,5		 ,3			,'1'			,''				 ,'account5'	),
                    (N'Ngo Ba Kha'			,'1993-03-13','male'	,1		,8		 ,13		,'1'			,''				 ,'account6'	),
                    (N'Bui Xuan Huan'		,'1993-12-18','female'	,19		,14		 ,25		,'1'			,''				 ,'account7'	),
                    (N'Nguyen Thanh Tung'	,'1993-12-20','male'	,4		,18		 ,46		,'2'			,''				 ,'account8'	),
                    (N'Duong Van Huu'		,'1993-12-09','female'	,7		,12		 ,34		,'2'			,''				 ,'account9'	),
                    (N'Nguyễn Hải Đăng1'	,'1993-12-10','male'	,15		,10		 ,25		,'2'			,''				 ,'account10'	);
-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau
SELECT		*
FROM		trainee
ORDER BY	month(Birth_Date);
-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: 
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT		Full_Name,
			ROUND(DATEDIFF(CURDATE(), Birth_Date) / 365, 0) AS Tuoi,
            Gender,
            VTI_Account
FROM		trainee
WHERE		char_length(Full_Name) = (		
SELECT		MAX(char_length(Full_Name))
FROM		trainee);
-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào 
-- và thỏa mãn số điểm như sau:
-- ET_IQ + ET_Gmath>=20
-- ET_IQ>=8
-- ET_Gmath>=8
-- ET_English>=18
SELECT		*
FROM		trainee
WHERE		ET_IQ + ET_Gmath>=20 
AND			ET_IQ>=8
AND			ET_Gmath>=8
AND			ET_English>=18;
-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE FROM trainee 
WHERE		TraineeID = 3;

SELECT		*
FROM		trainee;
-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database
UPDATE		trainee
SET			Training_Class = 2
WHERE		TraineeID = 5;

-- Exercise 2:
-- Cho table sau:
-- Department (Department_Number, Department_Name)
-- Employee_Table (Employee_Number, Employee_Name, Department_Number)
-- Employee_Skill_Table (Employee_Number, Skill_Code, Date_Registered)
-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	Department_Number		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name			NVARCHAR(50) NOT NULL UNIQUE KEY
);
DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table(
	Employee_Number			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name			NVARCHAR(50) NOT NULL UNIQUE KEY,
    Department_Number		SMALLINT UNSIGNED NOT NULL,
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
	Skill_Code				NVARCHAR(50) NOT NULL,
	Employee_Number			SMALLINT UNSIGNED NOT NULL,
    Date_Registered			DATETIME DEFAULT NOW(),
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);
-- Question 2: Thêm ít nhất 10 bản ghi vào table
INSERT INTO department 	(Department_Name)
VALUES					(N'Phòng 1'),
						(N'Phòng 2'),
                        (N'Phòng 3'),
                        (N'Phòng 4'),
                        (N'Phòng 5'),
                        (N'Phòng 6'),
                        (N'Phòng 7'),
                        (N'Phòng 8'),
                        (N'Phòng 9'),
                        (N'Phòng 10');
INSERT INTO employee_table 	(Employee_Name	,Department_Number)
VALUES						(N'Lock'		,	1		),
							(N'Aindrea'		,	1		),
							(N'Brnaby'		,	3		),
							(N'Alfi'		,	4		),
							(N'Bernie'		,	1		),
							(N'Tony'		,	5		),
							(N'Howie'		,	3		),
							(N'Cassandre'	,	6		),
							(N'Drusy'		,	3		),
							(N'Cassy'		,	4		);
INSERT INTO employee_skill_table	(Employee_Number	,Skill_Code	,Date_Registered) 	
VALUES								( 	1,				'Java'		, '2020-03-15'	),
									( 	2,				'Android'	, '2020-03-16'	),
									( 	3,				'C#'		, '2020-03-17'	),
									( 	1,				'SQL'		, '2020-03-20'	),
									( 	1,				'Postman'	, '2020-03-21'	),
									( 	4,				'Ruby'		, '2020-04-22'	),
									( 	5,				'Java'		, '2020-04-24'	),
									( 	6,				'C++'		, '2020-04-27'	),
									( 	7,				'C Sharp'	, '2020-04-04'	),
									( 	10,				'PHP'		, '2020-04-10'	);
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
--  Hướng dẫn: sử dụng UNION
SELECT		e1.Employee_Name
FROM		employee_table e1
JOIN		employee_skill_table e2 ON e1.Employee_Number = e2.Employee_Number
WHERE		e2.Skill_Code LIKE '%java%';
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT		d.Department_Number,
			d.Department_Name,
            COUNT(e.Department_Number) AS Soluong
FROM		department d
JOIN		employee_table e ON d.Department_Number = e.Department_Number
GROUP BY	d.Department_Number
HAVING		COUNT(e.Department_Number) >=2;
-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
--  Hướng dẫn: sử dụng GROUP BY
SELECT		e.*
FROM		department d
JOIN		employee_table e ON d.Department_Number = e.Department_Number
ORDER BY	d.Department_Number ;
-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
--  Hướng dẫn: sử dụng DISTINCT
SELECT		e1.Employee_Number,
			e1.Employee_Name,
            COUNT(e2.Skill_Code) AS Soluong
FROM		employee_table e1
JOIN		employee_skill_table e2 ON e1.Employee_Number = e2.Employee_Number
GROUP BY	e1.Employee_Number
HAVING		COUNT(e2.Skill_Code) > 1;

