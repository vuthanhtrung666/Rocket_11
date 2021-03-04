USE	testingsystem;
-- Exercise 1: Tiếp tục với Database Testing System
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS ques1;
DELIMITER $$
	CREATE PROCEDURE ques1 (IN department_name NVARCHAR(50)) 
		BEGIN
			SELECT	account.Fullname 
			FROM	account
            JOIN	department ON account.DepartmentID = department.DepartmentID
            WHERE	department.DepartmentName = department_name;
		END$$
DELIMITER ;
CALL	ques1('Sale');
-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS ques2;
DELIMITER $$
	CREATE PROCEDURE ques2 ()
		BEGIN
			SELECT 		groupaccount.GroupID, COUNT(groupaccount.GroupID) AS Soluong 
			FROM		groupaccount
			GROUP BY	groupaccount.GroupID;
		END $$
DELIMITER ;
CALL	ques2();
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS ques3;
DELIMITER $$
	CREATE PROCEDURE ques3 ()
		BEGIN
			SELECT 		t.TypeID, t.TypeName, COUNT(q.TypeID) AS Soluong 
			FROM		question q
            JOIN		typequestion t ON q.TypeID = t.TypeID
            WHERE		month(q.CreateDate) = 4
			GROUP BY	t.TypeID;
		END $$
DELIMITER ;
CALL		ques3;
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS ques4;
DELIMITER $$
	CREATE PROCEDURE ques4 ()
		BEGIN
			WITH 
            max_question AS (
				SELECT		MAX(countq)
				FROM		(
				SELECT		COUNT(q.TypeID) AS countq
				FROM		question q
				GROUP BY	q.TypeID) AS maxcountq)
            
			SELECT 		t.TypeID, t.TypeName, COUNT(q.TypeID) AS Soluong 
			FROM		question q
            JOIN		typequestion t ON q.TypeID = t.TypeID
			GROUP BY	t.TypeID
            HAVING		COUNT(q.TypeID) = (
            SELECT		*
            FROM		max_question);
		END $$
DELIMITER ;
CALL		ques4;
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào 
-- hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS ques6;
DELIMITER $$
	CREATE PROCEDURE ques6 (IN in_select TINYINT,IN in_string VARCHAR(50))
		BEGIN
			IF in_select = 1 THEN
				SELECT		*
                FROM		`group` g
                WHERE		g.GroupName LIKE in_string;
			ELSE
				SELECT		*
                FROM		`account` a
                WHERE		a.Username LIKE	in_string;
			END IF;
		END $$
DELIMITER ;
CALL		ques6(1,'Testing System');
-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi 
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ 
-- Sau đó in ra kết quả tạo thành công
DROP PROCEDURE IF EXISTS ques7;
DELIMITER $$
	CREATE PROCEDURE ques7 (IN in_email VARCHAR(50),IN in_fullname NVARCHAR(50))
		BEGIN
			DECLARE Username		VARCHAR(50) DEFAULT substring_index(in_email,'@',1) ;
			DECLARE DepartmentID	SMALLINT UNSIGNED DEFAULT 1 ;
			DECLARE PositionID		SMALLINT UNSIGNED DEFAULT 1 ;
			DECLARE CreateDate		DATETIME DEFAULT NOW();
            
            INSERT INTO `Account`	(Email		, Username	, FullName		, DepartmentID	, PositionID, CreateDate)
            VALUE					(in_email	, Username	, in_fullname	, DepartmentID	, PositionID, CreateDate);
            
            SELECT		*
            FROM		`account`
            WHERE		`account`.Username = Username;
		END $$
DELIMITER ;
CALL		ques7('account5@gmail.com','Vũ Thành Trung');
-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay 
-- hoặc multiple-choice nào có content dài nhất
DROP PROCEDURE IF EXISTS ques8;
DELIMITER $$
	CREATE PROCEDURE ques8 (IN in_type VARCHAR(15))
		BEGIN
			WITH
			max_content AS (
				SELECT		max(length(q.Content))
                FROM		question q
                JOIN		typequestion t ON q.TypeID = t.TypeID
                WHERE		t.TypeName = in_type
                GROUP BY	q.QuestionID
                ORDER BY 	max(length(q.Content)) DESC
                LIMIT		1)
			SELECT		q.*
            FROM		question q
            JOIN		typequestion t ON q.TypeID = t.TypeID
            WHERE		t.TypeName = in_type 
            GROUP BY	q.QuestionID
            HAVING		length(q.Content) = ( SELECT * FROM max_content);
		END$$
DELIMITER ;
CALL		ques8('Essay');
CALL		ques8('Multiple-Choice');
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS ques9;
DELIMITER $$
	CREATE PROCEDURE ques9 (IN in_id SMALLINT)
		BEGIN
			DELETE FROM	exam
            WHERE		exam.ExamID = in_id; 
		END$$
DELIMITER ;
CALL		ques9(3);
-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
--  Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS ques10;
DELIMITER $$
	CREATE PROCEDURE ques10 ()
		BEGIN
			WITH 
            examid AS (
				SELECT		ExamID
                FROM		exam
                WHERE		(year(now()) - year(CreateDate)) >3)
			DELETE FROM	exam
            WHERE		exam.ExamID = (SELECT * FROM examid); 
		END$$
DELIMITER ;
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
--  nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
--  chuyển về phòng ban default là phòng ban chờ việc
DROP PROCEDURE IF EXISTS ques11;
DELIMITER $$
	CREATE PROCEDURE ques11 (IN in_name NVARCHAR(50))
		BEGIN
        DECLARE 	departmentid SMALLINT UNSIGNED DEFAULT 10;
        WITH	
        id AS (
			SELECT		department.DepartmentID
            FROM		department
            WHERE		department.DepartmentName LIKE in_name)
            
			UPDATE 		`account`
            SET			account.DepartmentID = departmentid
            WHERE		account.DepartmentID = (
            SELECT		*
            FROM		id);
            
            DELETE FROM department
            WHERE		department.DepartmentName LIKE in_name;
        END$$
DELIMITER ;
CALL 		ques11('Bán hàng');
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
--  (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")
