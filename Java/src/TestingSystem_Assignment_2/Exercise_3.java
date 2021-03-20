package TestingSystem_Assignment_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import TestingSystem_Assignment_1.Account;
import TestingSystem_Assignment_1.Answer;
import TestingSystem_Assignment_1.CategoryName;
import TestingSystem_Assignment_1.CategoryQuestion;
import TestingSystem_Assignment_1.Department;
import TestingSystem_Assignment_1.Exam;
import TestingSystem_Assignment_1.Group;
import TestingSystem_Assignment_1.GroupAccount;
import TestingSystem_Assignment_1.Position;
import TestingSystem_Assignment_1.PositionName;
import TestingSystem_Assignment_1.Question;
import TestingSystem_Assignment_1.TypeName;
import TestingSystem_Assignment_1.TypeQuestion;

public class Exercise_3 {
	public static void main(String[] args) {
		// Create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Java Fresher";
		group1.createDate = new Date(2020, 04, 21);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "DB Fresher";
		group2.createDate = new Date(2020, 04, 21);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "C++ Fresher";
		group3.createDate = new Date(2020, 04, 16);
						
		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Management";
		group4.createDate = new Date(2020, 04, 17);

		// Create Deparment
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "HR";

		// Create Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.TEST;

		// Create account
		Account account1 = new Account();
		account1.id = 1;
		account1.createDate = new Date(2020, 03, 17);
		account1.department = department1;
		account1.email = "An@gmail.com";
		account1.fullname = "Nguyen Van An";
		account1.position = position1;
		account1.username = "an.nguyenvan";

		Account account2 = new Account();
		account2.id = 2;
		account2.createDate = new Date(2020, 01, 9);
		account2.department = department3;
		account2.email = "Linh@gmail.com";
		account2.fullname = "Nguyen Hoai Linh";
		account2.position = position3;
		account2.username = "Linh.nguyenhoai";

		Account account3 = new Account();
		account3.id = 3;
		account3.createDate = new Date(2020, 03, 19);
		account3.department = department2;
		account3.email = "ha@gmail.com";
		account3.fullname = "Pham Hai Ha";
		account3.position = position2;
		account3.username = "Ha.phamhai";

		// add group to account
		GroupAccount ga1 = new GroupAccount();
		ga1.account = account1;
		ga1.group = group1;
		ga1.joinDate = new Date();
		
		GroupAccount ga2 = new GroupAccount();
		ga2.account = account1;
		ga2.group = group2;
		ga2.joinDate = new Date();
		
		GroupAccount ga3 = new GroupAccount();
		ga3.account = account1;
		ga3.group = group3;
		ga3.joinDate = new Date();
		
		GroupAccount ga4 = new GroupAccount();
		ga4.account = account2;
		ga4.group = group1;
		ga4.joinDate = new Date();
						
		GroupAccount[] groupAccounts1 = {ga1,ga2,ga3};
		account1.groupAccounts = groupAccounts1;
		GroupAccount[] groupAccounts2 = {ga4};
		account2.groupAccounts = groupAccounts2;
				
		GroupAccount[] groupAccounts3 = {ga1,ga4};
		group1.groupAccounts = groupAccounts3;
		GroupAccount[] groupAccounts4 = {ga2};
		group2.groupAccounts = groupAccounts4;
		GroupAccount[] groupAccounts5 = {ga3};
		group3.groupAccounts = groupAccounts5;
		//GroupAccount[] groupAccounts6 = {};
		//group4.groupAccounts = groupAccounts6;
		
		// Create CategoryQuestion
				CategoryQuestion category1 = new CategoryQuestion();
				category1.id = 1;
				category1.name = CategoryName.JAVA;

				CategoryQuestion category2 = new CategoryQuestion();
				category2.id = 2;
				category2.name = CategoryName.NET;

				CategoryQuestion category3 = new CategoryQuestion();
				category3.id = 3;
				category3.name = CategoryName.POSTMAN;

				// Create TypeQuestion
				TypeQuestion type1 = new TypeQuestion();
				type1.id = 1;
				type1.name = TypeName.ESSAY;

				TypeQuestion type2 = new TypeQuestion();
				type2.id = 2;
				type2.name = TypeName.MULTIPLECHOICE;

				// Create Question
				Question question1 = new Question();
				question1.categoryQuestion = category1;
				question1.content = "Dac diem chinh cua Java";
				question1.createDate = new Date(2020, 1, 7);
				question1.account = account1;
				question1.id = 1;
				question1.typeQuestion = type1;

				Question question2 = new Question();
				question2.categoryQuestion = category1;
				question2.content = "Cac chuong trinh Java chu yeu";
				question2.createDate = new Date(2020, 2, 8);
				question2.account = account1;
				question2.id = 2;
				question2.typeQuestion = type2;

				Question question3 = new Question();
				question3.categoryQuestion = category1;
				question3.content = "Quy tac thiet ke Database";
				question3.createDate = new Date(2019, 2, 9);
				question3.account = account2;
				question3.id = 3;
				question3.typeQuestion = type1;

				// Create exam
				Exam exam1 = new Exam();
				exam1.code = "JV01";
				exam1.createDate = new Date("2019/9/4");
				exam1.account = account1;
				exam1.duration = 60;
				exam1.id = 1;
				exam1.title = "Kien thuc co ban ve Java";

				Exam exam2 = new Exam();
				exam2.code = "DB01";
				exam2.createDate = new Date("2019/12/4");
				exam2.account = account2;
				exam2.duration = 45;
				exam2.id = 2;
				exam1.title = "Kien thuc co ban ve Database";

				// add question to exam
				Question[] questionOfExam1 = { question1, question2 };
				exam1.questions = questionOfExam1;

				Question[] questionOfExam2 = { question3 };
				exam1.questions = questionOfExam2;

				// Create Answer
				Answer answer1 = new Answer();
				answer1.id = 1;
				answer1.content = "JAVA la ngon ngu lap trinh pho bien nhat";
				answer1.isCorrect = true;
				answer1.question = question1;

				Answer answer2 = new Answer();
				answer2.id = 2;
				answer2.content = "JAVA la ngon ngu lap trinh mat phi";
				answer2.isCorrect = false;
				answer2.question = question1;
				
				// question 1
				Locale locale = new Locale("vi","VN");
				DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
				String dateString = dateFormat.format(exam1.createDate);
				System.out.println(dateString);
				
				// question 2
				String format = "yyyy–MM–dd–HH–mm–ss";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
				dateString = simpleDateFormat.format(exam1.createDate);
				System.out.println(dateString);
				
				// question 3
				String format1 = "yyyy";
				SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(format1);
				dateString = simpleDateFormat1.format(exam1.createDate);
				System.out.println(dateString);
				
				// question 4
				String format2 = "MM-yyyy";
				SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(format2);
				dateString = simpleDateFormat2.format(exam1.createDate);
				System.out.println(dateString);
				
				// question 5
				String format3 = "MM-DD";
				SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(format3);
				dateString = simpleDateFormat3.format(exam1.createDate);
				System.out.println(dateString);
	}
}
