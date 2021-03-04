DROP DATABASE IF EXISTS 		TestingSystem;
CREATE DATABASE IF NOT EXISTS	TestingSystem;
USE 							TestingSystem;

-- table 1 :Department
DROP TABLE IF EXISTS 	Department;
CREATE TABLE  			Department (
	DepartmentID		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	DepartmentName		NVARCHAR(50) NOT NULL UNIQUE KEY
);
-- table 2 :Position
DROP TABLE IF EXISTS 	Position;
CREATE TABLE  			Position (
	PositionID			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	PositionName		NVARCHAR(50) NOT NULL UNIQUE KEY
);
-- table 3 :Account
DROP TABLE IF EXISTS 	`Account`;
CREATE TABLE 			`Account` (
	AccountID		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Email			VARCHAR(50) NOT NULL UNIQUE KEY,
	Username		VARCHAR(50) NOT NULL UNIQUE KEY,
	Fullname		NVARCHAR(50) NOT NULL,
	DepartmentID	SMALLINT UNSIGNED NOT NULL ,
	PositionID		SMALLINT UNSIGNED NOT NULL,
	CreateDate		DATETIME DEFAULT NOW(),
	FOREIGN KEY (DepartmentID) REFERENCES Department (DepartmentID),
	FOREIGN KEY (PositionID) REFERENCES Position (PositionID)
);
-- table 4: Group
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	GroupID					SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName				NVARCHAR(50) NOT NULL UNIQUE KEY,
    CreatorID				SMALLINT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW()
);
-- table 5: GroupAccount
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
	GroupID					SMALLINT UNSIGNED NOT NULL,
    AccountID				SMALLINT UNSIGNED NOT NULL,
    JoinDate				DATETIME DEFAULT NOW(),
    PRIMARY KEY (GroupID,AccountID)
);

-- table 6: TypeQuestion
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion (
    TypeID 			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TypeName 		ENUM('Essay','Multiple-Choice') NOT NULL UNIQUE KEY
);

-- table 7: CategoryQuestion
DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion(
    CategoryID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName			NVARCHAR(50) NOT NULL UNIQUE KEY
);

-- table 8: Question
DROP TABLE IF EXISTS Question;
CREATE TABLE Question(
    QuestionID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					NVARCHAR(100) NOT NULL,
    CategoryID				SMALLINT UNSIGNED NOT NULL,
    TypeID					SMALLINT UNSIGNED NOT NULL,
    CreatorID				SMALLINT UNSIGNED NOT NULL UNIQUE KEY,
    CreateDate				DATETIME DEFAULT NOW(),
    FOREIGN KEY(CategoryID) 	REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(TypeID) 		REFERENCES TypeQuestion(TypeID),
    FOREIGN KEY(CreatorID) 		REFERENCES `Account`(AccountID)
);

-- table 9: Answer
DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer(
    AnswerID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					NVARCHAR(100) NOT NULL,
    QuestionID				SMALLINT UNSIGNED NOT NULL,
    isCorrect				BIT DEFAULT 1,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
);

-- table 10: Exam
DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam(
    ExamID					SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code`					CHAR(10) NOT NULL,
    Title					NVARCHAR(50) NOT NULL,
    CategoryID				SMALLINT UNSIGNED NOT NULL,
    Duration				SMALLINT UNSIGNED NOT NULL,
    CreatorID				SMALLINT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW(),
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountID)
);

-- table 11: ExamQuestion
DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion(
    ExamID				SMALLINT UNSIGNED NOT NULL,
	QuestionID			SMALLINT UNSIGNED NOT NULL,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
    FOREIGN KEY(ExamID) REFERENCES Exam(ExamID),
    PRIMARY KEY (ExamID,QuestionID)
);

INSERT INTO Department	(DepartmentName)
VALUES					(N'Marketing'	),
						(N'Sale'			),
						(N'Bảo vệ'		),
						(N'Thư ký'		),
						(N'Tài chính'	),
                        (N'Phó giám đốc'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Bán hàng'	);

INSERT INTO Position	(PositionName	)
VALUES					(N'Dev'			),
						(N'Test'			),
						(N'Scrum Master'	),
						(N'PM'			);

INSERT INTO `Account`(Email								, Username			, FullName				, DepartmentID	, PositionID, CreateDate)
VALUES 				('haidang29productions@gmail.com'	, 'dangblack'		,N'Nguyễn hải Đăng'		,  	5			,   1		,'2020-03-05'),
					('account1@gmail.com'				, 'quanganh'		,N'Nguyen Chien Thang2'	,   1			,   2		,'2020-03-05'),
					('account2@gmail.com'				, 'vanchien'		,N'Nguyen Van Chien'	,   2			,   3		,'2020-03-07'),
                    ('account3@gmail.com'				, 'cocoduongqua'	,N'Duong Do'			,   3			,   4		,'2020-03-08'),
                    ('account4@gmail.com'				, 'doccocaubai'		,N'Nguyen Chien Thang1'	,   4			,   4		,'2020-03-10'),
                    ('dapphatchetngay@gmail.com'		, 'khabanh'			,N'Ngo Ba Kha'			,   6			,   3		,'2020-04-05'),
                    ('songcodaoly@gmail.com'			, 'huanhoahong'		,N'Bui Xuan Huan'		,   7			,   2		,'2020-05-13'),
                    ('sontungmtp@gmail.com'				, 'tungnui'			,N'Nguyen Thanh Tung'	,   8			,   1		,'2020-04-07'),
                    ('duongghuu@gmail.com'				, 'duongghuu'		,N'Duong Van Huu'		,   9			,   2		,'2020-04-07');

-- Add data Group
INSERT INTO `Group`	(  GroupName			, CreatorID	, CreateDate)
VALUES 				(N'Testing System'		,   5		,'2021-03-10'),
					(N'Development'			,   1		,'2021-03-11'),
                    (N'VTI Sale 01'			,   2		,'2021-03-12'),
                    (N'VTI Sale 02'			,   3		,'2021-03-13'),
                    (N'VTI Sale 03'			,   4		,'2021-03-14'),
					(N'VTI Creator'			,   6		,'2020-04-06'),
                    (N'VTI Marketing 01'	,   7		,'2020-04-07'),
                    (N'Management'			,   8		,'2020-04-08'),
                    (N'Chat with love'		,   9		,'2020-04-09');
-- Add data GroupAccount
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate	 )
VALUES 						(	1		,    1		,'2021-03-10'),
							(	1		,    2		,'2021-03-11'),
							(	3		,    3		,'2021-03-12'),
							(	3		,    4		,'2021-03-13'),
							(	5		,    5		,'2021-03-14'),
							(	1		,    3		,'2020-04-06'),
							(	1		,    7		,'2020-04-07'),
							(	8		,    3		,'2020-04-08'),
							(	1		,    9		,'2020-04-09');
							

-- Add data TypeQuestion
INSERT INTO TypeQuestion	(TypeName			) 
VALUES 						('Essay'			), 
							('Multiple-Choice'	); 


-- Add data CategoryQuestion
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('Java'			),
									('ASP.NET'		),
									('ADO.NET'		),
									('SQL'			),
									('Postman'		),
                                    ('Ruby'			),
									('Python'		),
									('C++'			),
									('C Sharp'		),
									('PHP'			);
													
-- Add data Question
INSERT INTO Question	(Content		, CategoryID, TypeID	, CreatorID	, CreateDate )
VALUES 					(N'Câu hỏi 1'	,	1		,   1		,   1		,'2021-04-05'),
						(N'Câu hỏi 2'	,	3		,   2		,   2		,'2021-04-05'),
						(N'Câu hỏi 3'	,	2		,   2		,   3		,'2021-04-06'),
						(N'Câu hỏi 4'	,	4		,   1		,   4		,'2021-04-06'),
						(N'Câu hỏi 5'	,	5		,   1		,   5		,'2021-04-06'),
                        (N'Câu hỏi 6'	,	2		,   1		,   6		,'2020-04-06'),
						(N'Câu hỏi 7'	,	8		,   1		,   7		,'2020-04-07'),
						(N'Câu hỏi 8'	,	4		,   2		,   8		,'2020-04-07'),
						(N'12345678901234567890'	,	7		,   1		,   9		,'2020-04-07');						

-- Add data Answers
INSERT INTO Answer	(  Content		, QuestionID	, isCorrect	)
VALUES 				(N'Trả lời 01'	,   1			,	0		),
					(N'Trả lời 02'	,   2			,	1		),
                    (N'Trả lời 03'	,   3			,	0		),
                    (N'Trả lời 04'	,   4			,	1		),
                    (N'Trả lời 05'	,   5			,	1		),
                    (N'Trả lời 06'	,   3			,	1		),
                    (N'Trả lời 07'	,   4			,	0		),
                    (N'Trả lời 08'	,   8			,	0		),
                    (N'Trả lời 09'	,   9			,	1		);
	
-- Add data Exam
INSERT INTO Exam	(`Code`			, Title					, CategoryID	, Duration	, CreatorID		, CreateDate )
VALUES 				('VTIQ001'		, N'Đề thi C#'			,	10			,	60		,   '5'			,'2021-04-05'),
					('VTIQ002'		, N'Đề thi PHP'			,	6			,	60		,   '2'			,'2021-04-05'),
                    ('VTIQ003'		, N'Đề thi C++'			,	4			,	120		,   '2'			,'2021-04-07'),
                    ('VTIQ004'		, N'Đề thi Java'		,	1			,	60		,   '3'			,'2021-04-08'),
                    ('VTIQ005'		, N'Đề thi Ruby'		,	5			,	120		,   '4'			,'2021-04-10'),
                    ('VTIQ006'		, N'Đề thi Postman'		,	3			,	60		,   '6'			,'2020-04-05'),
                    ('VTIQ007'		, N'Đề thi SQL'			,	2			,	60		,   '7'			,'2020-04-05'),
                    ('VTIQ008'		, N'Đề thi Python'		,	8			,	60		,   '8'			,'2020-04-07'),
                    ('VTIQ009'		, N'Đề thi ADO.NET'		,	9			,	90		,   '9'			,'2020-04-07'),
                    ('VTIQ010'		, N'Đề thi ASP.NET'		,	7			,	90		,   '2'		,'2020-04-08');
                    
                    
                    
-- Add data ExamQuestion
INSERT INTO ExamQuestion(ExamID	, QuestionID	) 
VALUES 					(	1	,		5		),
						(	2	,		8		), 
						(	3	,		4		), 
						(	4	,		3		), 
						(	5	,		7		), 
						(	6	,		9		), 
						(	7	,		2		), 
						(	8	,		9		), 
						(	9	,		9		), 
						(	10	,		8		); 