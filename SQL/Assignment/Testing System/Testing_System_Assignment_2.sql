-- Question 1: lấy ra tất cả các phòng ban
SELECT	*
FROM	department;
-- Question 2: lấy ra id của phòng ban có tên là "Sale"
SELECT	DepartmentID
FROM	department
WHERE	DepartmentName='Sale';
-- Question 3: lấy ra thông tin account có full name dài nhất
SELECT	*
FROM	`account`
WHERE	LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `account`);
-- Question 4: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT	GroupName
FROM	`group`
WHERE	CreateDate < '2019-12-20';
-- Question 5: Lấy ra ID của question có >= 4 câu trả lời
SELECT 		QuestionID
FROM 		Answer
GROUP BY 	QuestionID
HAVING 		COUNT(QuestionID) >= 4;	
-- Question 6: Lấy ra 5 group được tạo gần đây nhất
SELECT 		* 
FROM 		`group`
ORDER BY 	CreateDate DESC 
LIMIT 5;
-- Question 8: Xóa tất cả các exam được tạo trước ngày 20/12/2019

-- Question 9: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
-- Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
-- Question 11: Viết lệnh để lấy ra tất cả các developer
-- Question 12: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
-- Question 13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
-- Question 14: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
-- Question 15: Lấy ra Question có nhiều câu trả lời nhất
-- Question 16: Tìm chức vụ có ít người nhất
-- Question 17: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
-- Question 18: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
-- Question 19: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm