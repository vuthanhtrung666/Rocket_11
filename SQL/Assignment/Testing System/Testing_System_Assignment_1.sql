DROP DATABASE IF EXISTS 		TestingSystem;
CREATE DATABASE IF NOT EXISTS	TestingSystem;
USE 							TestingSystem;

-- table 1 :Department
DROP TABLE IF EXISTS 	Department;
CREATE TABLE  			Department (
	DepartmentID		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	DepartmentName		VARCHAR(50) NOT NULL UNIQUE KEY
);
-- table 2 :Position
DROP TABLE IF EXISTS 	Position;
CREATE TABLE  			Position (
	PositionID			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	PositionName		VARCHAR(50) NOT NULL UNIQUE KEY
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
VALUES					('Marketing'	),
						('Sale'			),
						('Bảo vệ'		),
						('Thư ký'		),
						('Tài chính'	);

INSERT INTO Position	(PositionName	)
VALUES					('Dev'			),
						('Test'			),
						('Scrum Master'	),
						('PM'			);

INSERT INTO `Account`(Email					, Username			, FullName				, DepartmentID	, PositionID, CreateDate)
VALUES 				('account1@gmail.com'	, 'dangblack'		,'Nguyễn hải Đăng'		,   '5'			,   '1'		,'2021-03-05'),
					('account2@gmail.com'	, 'quanganh'		,'Nguyen Chien Thang2'	,   '1'			,   '2'		,'2021-03-06'),
                    ('account3@gmail.com'	, 'vanchien'		,'Nguyen Van Chien'		,   '2'			,   '3'		,'2021-03-07'),
                    ('account4@gmail.com'	, 'cocoduongqua'	,'Duong Do'				,   '3'			,   '4'		,'2021-03-08'),
                    ('account5@gmail.com'	, 'doccocaubai'		,'Nguyen Chien Thang1'	,   '4'			,   '4'		,'2021-03-09');
	
-- Add data Group
INSERT INTO `Group`	(  GroupName			, CreatorID	, CreateDate)
VALUES 				(N'Testing System'		,   5		,'2021-03-10'),
					(N'Development'			,   1		,'2021-03-11'),
                    (N'VTI Sale 01'			,   2		,'2021-03-12'),
                    (N'VTI Sale 02'			,   3		,'2021-03-13'),
                    (N'VTI Sale 03'			,   4		,'2021-03-14');

-- Add data GroupAccount
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate	 )
VALUES 						(	1		,    1		,'2021-03-10'),
							(	1		,    2		,'2021-03-11'),
							(	3		,    3		,'2021-03-12'),
							(	3		,    4		,'2021-03-13'),
							(	5		,    5		,'2021-03-14');


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
									('Postman'		);
													
-- Add data Question
INSERT INTO Question	(Content		, CategoryID, TypeID	, CreatorID	, CreateDate )
VALUES 					(N'Câu hỏi 1'	,	1		,   '1'		,   '1'		,'2021-04-05'),
						(N'Câu hỏi 2'	,	3		,   '2'		,   '2'		,'2021-04-05'),
						(N'Câu hỏi 3'	,	2		,   '2'		,   '3'		,'2021-04-06'),
						(N'Câu hỏi 4'	,	4		,   '1'		,   '4'		,'2021-04-06'),
						(N'Câu hỏi 5'	,	5		,   '1'		,   '5'		,'2021-04-06');
						

-- Add data Answers
INSERT INTO Answer	(  Content		, QuestionID	, isCorrect	)
VALUES 				(N'Trả lời 01'	,   1			,	0		),
					(N'Trả lời 02'	,   2			,	1		),
                    (N'Trả lời 03'	,   3			,	0		),
                    (N'Trả lời 04'	,   4			,	1		),
                    (N'Trả lời 05'	,   5			,	1		);
	
-- Add data Exam
INSERT INTO Exam	(`Code`			, Title					, CategoryID	, Duration	, CreatorID		, CreateDate )
VALUES 				('VTIQ001'		, N'Đề thi C#'			,	3			,	60		,   '5'			,'2021-04-05'),
					('VTIQ002'		, N'Đề thi PHP'			,	2			,	60		,   '2'			,'2021-04-05'),
                    ('VTIQ003'		, N'Đề thi C++'			,	4			,	120		,   '2'			,'2021-04-07'),
                    ('VTIQ004'		, N'Đề thi Java'		,	1			,	60		,   '3'			,'2021-04-08'),
                    ('VTIQ005'		, N'Đề thi Ruby'		,	5			,	120		,   '4'			,'2021-04-10');
                    
                    
-- Add data ExamQuestion
INSERT INTO ExamQuestion(ExamID	, QuestionID	) 
VALUES 					(	1	,		5		),
						(	2	,		3		), 
						(	3	,		4		), 
						(	4	,		3		), 
						(	5	,		1		);