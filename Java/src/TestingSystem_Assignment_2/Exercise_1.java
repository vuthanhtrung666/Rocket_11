package TestingSystem_Assignment_2;

import java.lang.reflect.InaccessibleObjectException;
import java.util.Date;

import TestingSystem_Assignment_1.Account;
import TestingSystem_Assignment_1.Department;
import TestingSystem_Assignment_1.Group;
import TestingSystem_Assignment_1.GroupAccount;
import TestingSystem_Assignment_1.Position;
import TestingSystem_Assignment_1.PositionName;

public class Exercise_1 {
	public static void main(String[] args) {
		// Create group
			Group group1 = new Group();
			group1.id = 1;
			group1.name = "Java Fresher";
			group1.createDate = new Date("2020/04/20");

			Group group2 = new Group();
			group2.id = 2;
			group2.name = "DB Fresher";
			group2.createDate = new Date("2020/04/22");

			Group group3 = new Group();
			group3.id = 3;
			group3.name = "C++ Fresher";
			group3.createDate = new Date("2020/05/21");
				
			Group group4 = new Group();
			group4.id = 4;
			group4.name = "Management";
			group4.createDate = new Date("2020/05/23");

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
			
//			//question 1
//			if(account2.department == null) {
//				System.out.println("Nhân viên này chưa có phòng ban");
//			} else {
//				System.out.printf("Phòng ban của nhân viên này là %s\n", account2.department.name);
//			}
//			
//			//question 2
//			int a = account2.groupAccounts.length;
//			if(a == 0) {
//				System.out.println("Nhân viên này chưa có group\n");
//			} else if (a == 1) {
//				System.out.printf("Group của nhân viên này là %s\n",
//						account2.groupAccounts[0].group.name);
//			} else if (a == 2) {
//				System.out.printf("Group của nhân viên này là %s, %s\n",
//					account2.groupAccounts[0].group.name,
//					account2.groupAccounts[1].group.name);
//			} else if (a == 3) {
//				System.out.printf("Nhân viên này là người quan trọng, tham gia nhiều group\n");
//			} else if (a >=4) {
//				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group\n");
//			}
//			
//			//question 3
//			System.out.println( account2.department == null 
//					  ? "Nhân viên này chưa có phòng ban" 
//					  : "Phòng ban của nhân viên này là " + account2.department.name);
//			
//			//question 4
//			System.out.println(account1.position.name.equals(PositionName.DEV)
//					? "Đây là Developer"
//					: "Người này không phải là Developer mà là " + account1.position.name);
//			
//			//question 5
//			switch (group1.groupAccounts.length) {
//			case 1:
//				System.out.println("Nhóm có một thành viên");
//				break;
//				
//			case 2:
//				System.out.println("Nhóm có hai thành viên");
//				break;
//				
//			case 3:
//				System.out.println("Nhóm có ba thành viên");
//				break;
//					
//			default:
//				System.out.println("Nhóm có nhiều thành viên");
//			}
//			
//			//question 6
//			switch (account1.groupAccounts.length) {
//			case 0:
//				System.out.println("Nhân viên này chưa có group\n");
//				break;
//				
//			case 1:
//				System.out.printf("Group của nhân viên này là %s\n",
//						account1.groupAccounts[0].group.name);
//				break;
//				
//			case 2:
//				System.out.printf("Group của nhân viên này là %s, %s\n",
//						account1.groupAccounts[0].group.name,
//						account1.groupAccounts[1].group.name);
//				break;
//				
//			case 3:
//				System.out.printf("Nhân viên này là người quan trọng, tham gia nhiều group\n");
//				break;
//					
//			default:
//				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group\n");
//			}
//				
//			//question 7
//			String position = account1.position.name.toString();
//			switch (position) {
//			case "DEV":
//				System.out.println("Đây là Developer");
//				break;
//				
//				default:
//				System.out.println("Người này không phải là Developer mà là " + account1.position.name);
//				break;
//			}
//			
//			//question 8
//			Account[] accounts = {account1,account2,account3};
//			for(Account account : accounts) {
//				System.out.println("Email: " + account.email);
//				System.out.println("Fullname: " + account.fullname);
//				System.out.println("Department: " + account.department.name);
//			}
//			
//			//question 9
//			Department[] departments = {department1,department2,department3};
//			for(Department department : departments) {
//				System.out.println("id: " + department.id);
//				System.out.println("name: " + department.name);
//			}
//			
//			//question 10
//			for(int i = 0; i<accounts.length; i++) {
//				System.out.printf("Thông tin account thứ %d là:\n",(i+1));
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Fullname: " + accounts[i].fullname);
//				System.out.println("Phòng ban: " + accounts[i].department.name);
//				System.out.println();
//			}
//			
//			//question 11
//			for(int i = 0; i<departments.length; i++) {
//				System.out.printf("Thông tin department thứ %d là:\n",(i+1) );
//				System.out.println("id: " + departments[i].id);
//				System.out.println("name: " + departments[i].name);
//				System.out.println();
//			}
//			
//			//question 12
//			for(int i = 0; i<2; i++) {
//				System.out.printf("Thông tin department thứ %d là:\n",(i+1) );
//				System.out.println("id: " + departments[i].id);
//				System.out.println("name: " + departments[i].name);
//				System.out.println();
//			}
//			
//			//question 13
//			for(int i = 0; i<accounts.length; i++) {
//				if(i!=1) {
//					System.out.printf("Thông tin account thứ %d là:\n",(i+1));
//					System.out.println("Email: " + accounts[i].email);
//					System.out.println("Fullname: " + accounts[i].fullname);
//					System.out.println("Phòng ban: " + accounts[i].department.name);
//					System.out.println();
//				}
//			}
//			
//			//question 14
//			for(int i = 0; i<accounts.length; i++) {
//				if(accounts[i].id < 4) {
//					System.out.printf("Thông tin account thứ %d là:\n",(i+1));
//					System.out.println("Email: " + accounts[i].email);
//					System.out.println("Fullname: " + accounts[i].fullname);
//					System.out.println("Phòng ban: " + accounts[i].department.name);
//					System.out.println();
//				}
//			}
//			
//			//question 15
//			for(int i = 0; i<20; i++) {
//				if(i%2==0) {
//					System.out.println(i);
//				}
//			}
			
			//question 16-10
//			Account[] accounts = {account1,account2,account3};
//			Department[] departments = {department1,department2,department3};
//			int i=0;
//			while (i<accounts.length) {
//				System.out.printf("Thông tin account thứ %d là:\n",(i+1));
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Fullname: " + accounts[i].fullname);
//				System.out.println("Phòng ban: " + accounts[i].department.name);
//				System.out.println();
//				i++;
//			}
//			
//			//question 16-11
//			i=0;
//			while (i<departments.length) {
//				System.out.printf("Thông tin department thứ %d là:\n",(i+1) );
//				System.out.println("id: " + departments[i].id);
//				System.out.println("name: " + departments[i].name);
//				System.out.println();
//				i++;
//			}
//			
//			//question 16-12
//			i=0;
//			while (i<2) {
//				System.out.printf("Thông tin department thứ %d là:\n",(i+1) );
//				System.out.println("id: " + departments[i].id);
//				System.out.println("name: " + departments[i].name);
//				System.out.println();
//				i++;
//			}
//			
//			//question 16-13
//			i=0;
//			while (i<accounts.length) {
//				if(i==1) {
//					i++;
//					continue;
//				}
//				System.out.printf("Thông tin account thứ %d là:\n",(i+1));
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Fullname: " + accounts[i].fullname);
//				System.out.println("Phòng ban: " + accounts[i].department.name);
//				System.out.println();
//				i++;
//			}
//			
//			//question 16-14
//			i=0;
//			while (i<accounts.length) {
//				if(accounts[i].id>=4) {
//					i++;
//					continue;
//				}
//				System.out.printf("Thông tin account thứ %d là:\n",(i+1));
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Fullname: " + accounts[i].fullname);
//				System.out.println("Phòng ban: " + accounts[i].department.name);
//				System.out.println();
//				i++;
//			}
//			
//			//question 16-15
//			i=0;
//			while (i<20) {
//				if(i%2!=0) {
//					i++;
//					continue;
//				}
//				System.out.println(i);
//				i++;
//			}
//			for(int i=1;i<=100;i=i+2) {
//				System.out.print(i+" ");
//			}	
	}
}
