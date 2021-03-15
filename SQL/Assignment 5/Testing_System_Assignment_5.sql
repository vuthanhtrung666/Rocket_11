USE testingsystem;
-- Exercise 1: Tiếp tục với Database Testing System
-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước
-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"
DROP TRIGGER IF EXISTS trig_not_add_more;
DELIMITER $$
CREATE TRIGGER trig_not_add_more
BEFORE INSERT ON account
FOR EACH ROW
BEGIN
	IF (NEW.DepartmentID = (SELECT DepartmentID FROM department WHERE DepartmentName)) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT ='Department "Sale" cannot add more user';
	END IF;
END$$
DELIMITER ;

-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS trig_limit_group;
DELIMITER $$
CREATE TRIGGER trig_limit_group
BEFORE INSERT ON groupaccount
FOR EACH ROW
BEGIN
	IF(NEW.GroupID IN (SELECT GroupID FROM groupaccount GROUP BY GroupID HAVING count(GroupID)>=5)) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT ='1 group have max is 5 user';
	END IF;
END$$
DELIMITER ;

INSERT INTO groupaccount(GroupID,AccountID	,JoinDate)
VALUES					(	1	,	18		,'2021-05-16');
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS trig_max_question;
DELIMITER $$
CREATE TRIGGER trig_max_question
BEFORE INSERT ON examquestion
FOR EACH ROW
BEGIN
	IF(NEW.ExamID IN (SELECT ExamID FROM examquestion GROUP BY ExamID HAVING count(ExamID)>=10)) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT ='1 exam have max is 10 Question';
	END IF;
END$$
DELIMITER ;

INSERT INTO examquestion (ExamID	,QuestionID	)
VALUES					 (	1		,		1	);
-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
-- tin liên quan tới user đó
DROP TRIGGER IF EXISTS trig_delete_account;
DELIMITER $$
CREATE TRIGGER trig_delete_account
BEFORE DELETE ON account
FOR EACH ROW
BEGIN
	IF(SELECT AccountID FROM account WHERE Email = 'admin@gmail.com') THEN
		SIGNAL SQLSTATE '12435'
        SET MESSAGE_TEXT ='đây là tài khoản admin, không cho phép user xóa';		
	END IF;
END$$
DELIMITER ;

-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
DROP TRIGGER IF EXISTS trig_auto_department;
DELIMITER $$
CREATE TRIGGER trig_auto_department
BEFORE INSERT ON account
FOR EACH ROW
BEGIN
	DECLARE WaitingID SMALLINT UNSIGNED;
    SELECT DepartmentID INTO WaitingID FROM department WHERE DepartmentName LIKE '%Waiting%';
	IF NEW.DepartmentID = NULL THEN
		SET NEW.DepartmentID = WaitingID;
	END IF;
END$$
DELIMITER ;

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng.
INSERT INTO answer	(Content,QuestionID,isCorrect)
VALUES				(N'Thử cho trigger1',9,1);

DROP TRIGGER IF EXISTS trigger_4_answer_for_each_question;
DELIMITER $$
CREATE TRIGGER trigger_4_answer_for_each_question
BEFORE INSERT ON answer
FOR EACH ROW
BEGIN
	DECLARE soLuongAnswer TINYINT;
    DECLARE soLuongCorrect TINYINT;
    
    SELECT count(QuestionID) INTO soLuongAnswer
	FROM answer 
	WHERE QuestionID = NEW.QuestionID;
    SELECT count(isCorrect) INTO soLuongCorrect
	FROM (SELECT * FROM answer WHERE isCorrect = 1) AS answerCorrect
	WHERE QuestionID = 9; 
    
    IF soLuongAnswer>=4 OR soLuongCorrect >=2 THEN
		SIGNAL SQLSTATE '12435'
        SET MESSAGE_TEXT ='tối đa 4 câu trả lời cho 1 câu hỏi';		
    END IF;
END $$
DELIMITER ;
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
-- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database

-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS trigger_stop_delete_exam;
DELIMITER $$
CREATE TRIGGER trigger_stop_delete_exam
BEFORE DELETE ON exam
fOR EACH ROW
BEGIN
	IF datediff(OLD.CreateDate,NOW()) <= 2 THEN
		SIGNAL SQLSTATE '12435'
        SET MESSAGE_TEXT ='không cho phép bài thi mới tạo được 2 ngày';	
	END IF;
END $$
DELIMITER ;
INSERT INTO exam 	(Code			,Title					,CategoryID		,Duration	,CreatorID		,CreateDate)
VALUES				('VTIQ011'		, N'Đề thi TRIGGER'		,	7			,	90		,   '10'		,'2021-03-11');
DELETE FROM exam WHERE ExamID = 12;
-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
-- question khi question đó chưa nằm trong exam nào
DROP TRIGGER IF EXISTS trigger_stop_delete_question;
DELIMITER $$
CREATE TRIGGER trigger_stop_delete_question
BEFORE DELETE ON question
fOR EACH ROW
BEGIN
	IF OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM examquestion) 
    OR OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM answer)THEN
		SIGNAL SQLSTATE '12435'
        SET MESSAGE_TEXT ='question nằm trong exam';	
	END IF;
END$$
DELIMITER ;
DELETE FROM question WHERE QuestionID = 8;
DROP TRIGGER IF EXISTS before_update_question;
DELIMITER $$
CREATE TRIGGER before_update_question
BEFORE UPDATE ON question
FOR EACH ROW
BEGIN
	IF OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM examquestion) 
	OR OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM answer) THEN
		SIGNAL SQLSTATE '12345' -- disallow update this record
		SET MESSAGE_TEXT = 'This question exists in examquestion table or answers table or both of them, you can not update!';
	END IF;
END$$
DELIMITER ;

UPDATE question
SET Content = 'a'
WHERE QuestionID = 7;
-- Question 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"
-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
-- là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher
-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
-- không có user thì sẽ thay đổi giá trị 0 thành "Không có User"


DROP TRIGGER IF EXISTS trigger_create_date_question;
DELIMITER $$
CREATE TRIGGER trigger_create_date_question
BEFORE INSERT ON question
FOR EACH ROW
BEGIN
	IF NEW.CreateDate > now() THEN
		SET NEW.CreateDate = now();
	END IF;
END $$
DELIMITER ;

INSERT INTO question(Content		,CategoryID	,TypeID	,CreatorID	,CreateDate)
VALUES				(N'Câu hỏi Java',	1		,	1	,	2		,'2023-03-13');
SHOW TRIGGERS;

DROP TRIGGER IF EXISTS trigger_create_date_question;
DELIMITER $$
CREATE TRIGGER trigger_create_date_question
BEFORE INSERT ON question
FOR EACH ROW
BEGIN
	IF NEW.CreateDate > now() THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'create date ko dc lon hon ngay hien tai';
	END IF;
END $$
DELIMITER ;

DROP TRIGGER IF EXISTS trigger_delete_question;
DELIMITER $$
CREATE TRIGGER trigger_delete_question
BEFORE DELETE ON question
FOR EACH ROW
BEGIN
	DELETE FROM answer
    WHERE QuestionID = OLD.QuestionID;
    DELETE FROM examquestion
    WHERE QuestionID = OLD.QuestionID;
END $$
DELIMITER ;

DELETE FROM question 
WHERE QuestionID = 4 ;