USE	TestingSystem;
-- Exercise 1: Tiếp tục với Database Testing System
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
DROP VIEW IF EXISTS dsnv;
CREATE OR REPLACE VIEW dsnv AS
	SELECT 		a.AccountID,
				a.Fullname,
				d.DepartmentName
	FROM		account AS a
	INNER JOIN	department AS d ON a.DepartmentID = d.DepartmentID
	WHERE		d.DepartmentName = 'Sale';
    
	SELECT 		a.AccountID,
				a.Fullname,
				d.DepartmentName
	FROM		account AS a
	INNER JOIN	department AS d ON a.DepartmentID = d.DepartmentID
	WHERE		d.DepartmentID = (
    SELECT 		d.DepartmentID
    FROM		department d
    WHERE		d.DepartmentName = 'Sale');

SELECT		*
FROM		dsnv;
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
DROP VIEW IF EXISTS thongtin;
CREATE OR REPLACE VIEW thongtin AS
	SELECT		a.AccountID, a.Fullname,COUNT(g.GroupID) AS 'số lượng'
	FROM		account AS a
	INNER JOIN	groupaccount AS g ON a.AccountID = g.AccountID
	GROUP BY	a.AccountID 
    HAVING		COUNT(g.GroupID) =(
			SELECT		max(Soluong) AS Soluongmax
			FROM		(
						SELECT		COUNT(g.GroupID) AS Soluong
						FROM		account AS a
						INNER JOIN	groupaccount AS g ON a.AccountID = g.AccountID
						GROUP BY	a.AccountID) AS Max);
                        
	WITH maxgroup AS (
		SELECT 		AccountID, count(GroupID) AS Soluong
        FROM		groupaccount
        GROUP BY	GroupID
    )
    SELECT		*
    FROM		maxgroup
    WHERE		Soluong = 	(
								SELECT	MAX(Soluong)
                                FROM	maxgroup
							);
SELECT		*
FROM		thongtin;
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
DROP VIEW IF EXISTS cauhoi;
CREATE OR REPLACE VIEW cauhoi AS 
	SELECT		question.QuestionID,
				CHAR_LENGTH( question.Content ) AS Soluong
	FROM		question
	WHERE		CHAR_LENGTH( question.Content ) >15;
SELECT		*
FROM		cauhoi;
DELETE FROM cauhoi
WHERE 		Soluong >15;
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
DROP VIEW IF EXISTS phongban;
CREATE OR REPLACE VIEW phongban AS
	SELECT		d.DepartmentID, d.DepartmentName,count(a.DepartmentID) AS Soluongmax
    FROM		department d
    JOIN		account a ON d.DepartmentID=a.DepartmentID
    GROUP BY	d.DepartmentID
    HAVING		count(a.DepartmentID) = (
		SELECT		max(Soluong)
        FROM		(
			SELECT		COUNT(a.DepartmentID) AS Soluong
			FROM		department AS d
			INNER JOIN	account AS a ON d.DepartmentID = a.DepartmentID
			GROUP BY	d.DepartmentID) AS Max);
SELECT		*
FROM		phongban;
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
DROP VIEW IF EXISTS tim;
CREATE OR REPLACE VIEW tim AS
	SELECT		q.QuestionID,
				q.Content,
				a.Fullname
	FROM		account AS a
	INNER JOIN 	question AS q ON q.CreatorID = a.AccountID
	WHERE		a.Fullname LIKE 'Nguyễn%'
	GROUP BY	q.QuestionID;

SELECT		*
FROM		tim;
