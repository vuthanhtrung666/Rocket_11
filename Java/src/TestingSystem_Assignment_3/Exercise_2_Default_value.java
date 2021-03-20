package TestingSystem_Assignment_3;

import java.util.Date;

import TestingSystem_Assignment_1.Account;

public class Exercise_2_Default_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//		Email: "Email 1"
//		Username: "User name 1"
//		FullName: "Full name 1"
//		CreateDate: now
		
		Account[] accounts = new Account[5];

		// insert account
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account();
			account.email = "Email " + (i + 1);
			account.username = "Username " + (i + 1);
			account.fullname = "Full name " + (i + 1);
			account.createDate = new Date();
			accounts[i] = account;
		}

		// print accounts
		for (Account account : accounts) {
			System.out.println(account.email);
			System.out.println(account.username);
			System.out.println(account.fullname);
			System.out.println(account.createDate);
			System.out.println("\n");
		}

	}

}
