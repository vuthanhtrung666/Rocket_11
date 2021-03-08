DROP DATABASE IF EXISTS Extra_4;
CREATE DATABASE IF NOT EXISTS Extra_4;
USE Extra_4;
-- a) Tạo table với các ràng buộc và kiểu dữ liệu và thêm ít nhất 3 bản ghi vào mỗi table trên
-- table Employee:
DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	EmployeeID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    EmployeeLastName		NVARCHAR(20) NOT NULL,
    EmployeeFirstName		NVARCHAR(20) NOT NULL,
    EmployeeHireDate		DATETIME ,
    EmployeeStatus			NVARCHAR(50),
    SupervisorID			SMALLINT UNSIGNED,
    SocialSecurityNumber	INT UNSIGNED UNIQUE KEY
);

DROP TABLE IF EXISTS projects;
CREATE TABLE projects (
	ProjectID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ManagerID				SMALLINT UNSIGNED UNIQUE KEY,
    ProjectName				NVARCHAR(50) NOT NULL,
    ProjectStartDate		DATETIME,
    ProjectDescription		NVARCHAR(100),
    ProjectDetail			NVARCHAR(50),
    ProjectCompletedOn		DATETIME
);
-- b) Viết stored procedure (không có parameter) để Remove tất cả thông tin project đã hoàn thành sau 3 tháng kể từ ngày hiện.
-- In số lượng record đã remove từ các table liên quan trong khi removing (dùng lệnh print)
-- c) Viết stored procedure (có parameter) để in ra các module đang được thực hiện)
-- d) Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc dù không ai giao việc cho nhân viên đó (trong bảng Works)