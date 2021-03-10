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
	IF NEW.DepartmentID = 2 THEN
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
	IF(SELECT GroupID FROM groupaccount GROUP BY GroupID HAVING count(GroupID)>=5) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT ='1 group have max is 5 user';
	END IF;
END$$
DELIMITER ;
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS trig_max_question;
DELIMITER $$
CREATE TRIGGER trig_max_question
BEFORE INSERT ON examquestion
FOR EACH ROW
BEGIN
	IF(SELECT ExamID FROM examquestion GROUP BY ExamID HAVING count(ExamID)>=10) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT ='1 exam have max is 10 Question';
	END IF;
END$$
DELIMITER ;
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
-- DROP TRIGGER IF EXISTS 
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
-- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
-- question khi question đó chưa nằm trong exam nào
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
