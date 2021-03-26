package TestingSystem_Assignment_4.com.vti.backend;

import java.util.Date;

import TestingSystem_Assignment_4.com.vti.entity.Account;
import TestingSystem_Assignment_4.com.vti.entity.Department;
import TestingSystem_Assignment_4.com.vti.entity.Group;
import TestingSystem_Assignment_4.com.vti.entity.GroupAccount;
import TestingSystem_Assignment_4.com.vti.entity.Position;
import TestingSystem_Assignment_4.com.vti.entity.PositionName;




public class Exercise_1_Constructor {
//	Question 1:
//	Tạo constructor cho department:
//	a) không có parameters
	
	public void question1a() {
		System.out.println("question 1 a:");
		Department department1 = new Department();
		System.out.println(department1);
	}
	
//	b) Có 1 parameter là nameDepartment và default id của
//	Department = 0
//	Khởi tạo 1 Object với mỗi constructor ở trên
	
	public void question1b() {
		System.out.println("question 1 b:");
		Department department2 = new Department("Sale");
		System.out.println(department2);
	}

//	Question 2:
//	Tạo constructor cho Account:
//	a) Không có parameters
	
	public void question2a() {
		System.out.println("question 2 a:");
		Account account1 = new Account();
		System.out.println(account1);
	}

	
//	b) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName)
	
	public void question2b() {
		System.out.println("question 2 b:");
		Account account2 = new Account(1, "email1", "username1", "firstname1", "lastname1");
		System.out.println(account2.toString2());
	}

	
//	c) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, default createDate = now
	
//	d) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, createDate
//	Khởi tạo 1 Object với mỗi constructor ở trên
	public void question2cd() {
		Position position1 = new Position(1, PositionName.DEV);
		Position position2 = new Position(2, PositionName.PM);
		Position position3 = new Position(3, PositionName.TEST);
		System.out.println("question 2 c:");
		Account account3 = new Account(2, "email2", "username2", "firstname2", "lastname2", position1);
		System.out.println(account3.toString3());
		System.out.println("question 2 d:");
		Account account4 = new Account(3, "email3", "username3", "firstname3", "lastname3", position1,new Date("2012/03/15"));
		System.out.println(account3.toString3());
	}
	
//	Question 3:
//	Tạo constructor cho Group:
//	a) không có parameters
	
	public void question3a() {
		System.out.println("question 3 a:");
		Group group1 = new Group();
		System.out.println(group1);
	}
	
//	b) Có các parameter là GroupName, Creator, array Account[]
//	accounts, CreateDate
	
	public void question3b() {
		System.out.println("question 3 b:");
		Account creator = new Account(1, "dang1@gmail.com", "dangblack1", "Nguyễn Hải", "Đăng1");
		Account account2 = new Account(2, "dang2@gmail.com", "dangblack2", "Nguyễn Hải", "Đăng2");
		Account account3 = new Account(3, "dang3@gmail.com", "dangblack3", "Nguyễn Hải", "Đăng3");
		Account[] accounts = {creator,account2,account3};
		Group group1 = new Group(1, "Sale", creator, accounts, new Date("2020/05/15"));
		System.out.println(group1);
	}
	
//	c) Có các parameter là GroupName, Creator, array String[]
//	usernames , CreateDate
//	Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//	username, các thông tin còn lại = null).
//	Khởi tạo 1 Object với mỗi constructor ở trên
	
	public void question3c() {
		System.out.println("question 3 c:");
		Account creator = new Account(1, "dang1@gmail.com", "dangblack1", "Nguyễn Hải", "Đăng1");
		Account account2 = new Account(2, "dang2@gmail.com", "dangblack2", "Nguyễn Hải", "Đăng2");
		Account account3 = new Account(3, "dang3@gmail.com", "dangblack3", "Nguyễn Hải", "Đăng3");
		String[] usernames = { "dangblack1", "dangblack2", "dangblack3" };
		Group group1 = new Group(2, "Boss of Director", creator, usernames, new Date("2020/05/15"));
		System.out.println(group1);
	}
}
