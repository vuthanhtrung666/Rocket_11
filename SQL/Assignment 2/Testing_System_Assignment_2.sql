USE TestingSystem;
-- Question 1: lấy ra tất cả các phòng ban
SELECT	*
FROM	department;
-- Question 2: lấy ra id của phòng ban có tên là "Sale"
SELECT	DepartmentID
FROM	department
WHERE	DepartmentName='Sale';
-- Question 3: lấy ra thông tin account có full name dài nhất
SELECT	Fullname,
        length(Fullname) AS 'số lượng'
FROM	`account`
WHERE	LENGTH(Fullname) = (
SELECT 	MAX(CHAR_LENGTH(Fullname)) 
FROM 	`account`);
SELECT	*
FROM	`account`
WHERE	CHAR_LENGTH(Fullname) = (
SELECT 	MAX(CHAR_LENGTH(Fullname)) 
FROM 	`account`);
-- Question 4: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT	GroupName
FROM	`group`
WHERE	CreateDate < '2019-12-20';
-- Question 5: Lấy ra ID của question có >= 4 câu trả lời
SELECT 		QuestionID,
			COUNT(QuestionID) AS 'Số lượng'
FROM 		Answer
GROUP BY 	QuestionID
HAVING 		COUNT(QuestionID) >= 2;	
-- Question 6: Lấy ra 5 group được tạo gần đây nhất
SELECT 		* 
FROM 		`group`
ORDER BY 	CreateDate ASC 
LIMIT 5;
-- Question 8: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM	exam 
WHERE 		CreateDate < '2019-12-20';
-- Question 9: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
UPDATE 	`account`
SET 	Fullname = N'Nguyễn Bá Lộc',
		Email = 'loc.nguyenba@vti.com.vn'
WHERE	AccountID = 5;
-- Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 	Fullname,
		DepartmentName
FROM		`account` a
INNER JOIN	department d ON a.DepartmentID = d.DepartmentID;
-- Question 11: Viết lệnh để lấy ra tất cả các developer
SELECT		a.Fullname
FROM		`account` a
INNER JOIN	position p ON a.PositionID = p.PositionID
WHERE		p.PositionName = 'Dev';
-- Question 12: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT 	DepartmentID,
		DepartmentName
FROM		`account`
INNER JOIN	department
ON		`account`.DepartmentID = department.DepartmentID
WHERE	COUNT(`account`.DepartmentID) >3;
-- Question 13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT		q.QuestionID,
			q.Content,
            q.CategoryID,
            q.TypeID,
            q.CreatorID
FROM		question  q
INNER JOIN	examquestion  e ON q.QuestionID = e.QuestionID
GROUP BY	q.QuestionID
HAVING		COUNT(e.QuestionID) = (
SELECT		MAX(Countquestion)
FROM		(
SELECT		MAX(COUNT(e.QuestionID))
AS			Countquestion
FROM		examquestion  e
RIGHT JOIN	question  q
ON			q.QuestionID = e.QuestionID
GROUP BY	e.QuestionID )
AS			MaxCountquestion 
);
-- Question 14: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT		c.CategoryID,
			c.CategoryName,
            COUNT(q.CategoryID) AS Soluong
FROM		categoryquestion  c
INNER JOIN	question  q ON c.CategoryID = q.CategoryID
GROUP BY	q.CategoryID;
-- Question 15: Lấy ra Question có nhiều câu trả lời nhất
SELECT		q.QuestionID,
			q.Content,
			COUNT(a.QuestionID) AS 'So luong'
FROM		question  q
INNER JOIN	answer  a
ON			q.QuestionID = a.QuestionID
GROUP BY	q.QuestionID
HAVING 		COUNT(a.QuestionID) = (
SELECT 		MAX(Countquestion)
FROM		(
SELECT		COUNT(a.QuestionID) AS Countquestion
FROM		answer  a
RIGHT JOIN	question  q
ON			a.QuestionID = q.QuestionID
GROUP BY	a.QuestionID )
AS			MaxCountquestion
);
-- Question 16: Tìm chức vụ có ít người nhất
SELECT		p.PositionID,
			p.PositionName,
            COUNT(a.PositionID) AS 'Số lượng'
FROM		position  p
INNER JOIN	`account`  a ON	p.PositionID = a.PositionID
GROUP BY	p.PositionID;
-- Question 17: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT		d.DepartmentName,
            p.PositionName,
            COUNT(p.PositionID) AS Soluong
FROM		department  d
LEFT JOIN	account  a ON d.DepartmentID = a.DepartmentID
Left JOIN	position  p ON a.PositionID = p.PositionID
GROUP BY	d.DepartmentID,p.PositionID
ORDER BY	d.DepartmentID;
SELECT		p.PositionName,
			count(a.PositionID)
FROM		position p
JOIN		account a ON p.PositionID = a.PositionID
GROUP BY	p.PositionID;

-- Question 18: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT		q.QuestionID,q.Content,c.CategoryName,t.TypeName,ac.Fullname,an.Content
FROM		question  q
INNER JOIN	categoryquestion  c ON q.CategoryID = c.CategoryID
INNER JOIN	answer  an 			ON q.QuestionID = an.QuestionID
INNER JOIN	`account`  ac 		ON q.CreatorID = ac.AccountID
INNER JOIN	typequestion  t 	ON q.TypeID = t.TypeID
GROUP BY	q.QuestionID;
-- Question 19: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT		t.TypeID,
			t.TypeName,
            COUNT(q.TypeID) AS 'Số lượng'
FROM		typequestion  t
INNER JOIN	question  q ON	t.TypeID = q.TypeID
GROUP BY	t.TypeID;