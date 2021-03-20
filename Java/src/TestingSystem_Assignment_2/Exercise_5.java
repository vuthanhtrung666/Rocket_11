package TestingSystem_Assignment_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import TestingSystem_Assignment_1.Account;
import TestingSystem_Assignment_1.Department;
import TestingSystem_Assignment_1.Group;
import TestingSystem_Assignment_1.Position;
import TestingSystem_Assignment_1.PositionName;

public class Exercise_5 {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		Question 1:
//		Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
//		int a[] = new int[3];
//		for(int i=0;i<3;i++) {
//			System.out.printf("so thu %d:",(i+1));
//			a[i] = scanner.nextInt();
//		}
//		for(int i=0;i<3;i++) {
//			System.out.print(a[i]+ " ");
//		}
		
//		Question 2:
//		Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
//		float b[] = new float[2];
//		for(int i=0;i<2;i++) {
//			System.out.printf("so thu %d:",(i+1));
//			b[i] = scanner.nextFloat();
//		}
//		for(int i=0;i<2;i++) {
//			System.out.print(b[i]+ " ");
//		}
		
//		Question 3:
//		Viết lệnh cho phép người dùng nhập họ và tên
//		System.out.println("Nhap ho va ten:");
//		System.out.print("nhap ho:");
//		String s1 = scanner.nextLine();
//		System.out.print("nhap ten:");
//		String s2 = scanner.nextLine();
//		System.out.println("Ho va ten: "+s1+" "+s2);
		
//		Question 4:
//		Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
//		System.out.println("Moi nhap vao ngay sinh");
//		String dob = scanner.next();
//		String pattern = "dd/MM/yyyy";
//		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
//		Date date = dateFormat.parse(dob);
//		String output = dateFormat.format(date); 
//		System.out.println("Input: " + output);

		
//		Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
//		inputAccount();
		
//		Question 6:
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
//		inputDepartment();
		
//		Question 7:
//		Nhập số chẵn từ console
//		System.out.println("Nhap so:");
//		int number = scanner.nextInt();
//		if(number%2==0) {
//			System.out.println("so chan da nhap la "+number);
//		} else {
//			System.out.println("ban nhap la so le");
//		}
		
//		Question 8:
//		Viết chương trình thực hiện theo flow sau:
//		Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1
//		boolean exit = false;
//		while (true) {
//			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
//			System.out.println("1:tạo account");
//			System.out.println("2:tạo department");
//			System.out.println("0:thoát");
//			System.out.println("Xin hãy chọn:");
//			int funtion = scanner.nextInt();
//			switch (funtion) {
//			case 1:
//				inputAccount();
//				break;
//			
//			case 2:
//				inputDepartment();
//				break;
//			case 0:
//				exit=true;
//				break;
//			default:
//				System.out.println("Mời bạn nhập lại");
//				break;
//			}
//			if(exit) {
//				break;
//			}
//		}
		
//		Question 9:
//		Viết method cho phép người dùng thêm group vào account theo flow sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
//		Bước 3:
//		In ra tên các group cho người dùng xem
//		Bước 4:
//		Yêu cầu người dùng nhập vào tên của group
//		Bước 5:
//		Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .
		input();
//		Question 10: Tiếp tục Question 8 và Question 9
//		Bổ sung thêm vào bước 2 của Question 8 như sau:
//		Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào	account
//		Bổ sung thêm Bước 3 của Question 8 như sau:
//		Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//		text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác không?". 
//		Nếu người dùng chọn "Có" thì quay lại bước 1, 
//		nếu người dùng chọn "Không" thì kết thúc chương trình 
//		(sử dụng lệnh return để	kết thúc chương trình)
//		Question 11: Tiếp tục Question 10
//		Bổ sung thêm vào bước 2 của Question 8 như sau:
//		Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//		vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem	6
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
//		Bước 3:
//		Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//		Bước 4:
//		Thêm account vào group chương trình vừa chọn ngẫu nhiên
	}

	private static void input() {
		// TODO Auto-generated method stub
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
		account1.department = department1;
		account1.email = "An@gmail.com";
		account1.fullname = "Nguyen Van An";
		account1.position = position1;
		account1.username = "an.nguyenvan";

		Account account2 = new Account();
		account2.id = 2;
		account2.department = department3;
		account2.email = "Linh@gmail.com";
		account2.fullname = "Nguyen Hoai Linh";
		account2.position = position3;
		account2.username = "Linh.nguyenhoai";

		Account account3 = new Account();
		account3.id = 3;
		account3.department = department2;
		account3.email = "ha@gmail.com";
		account3.fullname = "Pham Hai Ha";
		account3.position = position2;
		account3.username = "Ha.phamhai";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hien ten cac account:");
		Account[] accounts = {account1,account2,account3};
		for(int i =0;i<accounts.length;i++) {
			System.out.println("username cua account " + (i+1) + " la: " + accounts[i].username);
		}
		System.out.println("Nhap username cua account:");
		String user = scanner.next();
		Group[] groups = {group1,group2,group3,group4};
		for(int i =0;i<groups.length;i++) {
			System.out.println("ten cua group " + (i+1) + " la: " + groups[i].name);
		}
		String groupString = scanner.next();
		
	}

	private static void inputDepartment() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Department department = new Department();
		System.out.println("Nhap department id:");
		department.id = scanner.nextInt();
		System.out.println("Nhap department name:");
		department.name = scanner.next();
		System.out.println("id: "+department.id);
		System.out.println("name: "+department.name);
	}

	private static void inputAccount() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		
		System.out.print("Nhap vao account Id: ");
		account.id = scanner.nextInt();
		System.out.print("Nhap vao username: ");
		account.username = scanner.next();
		System.out.print("Nhap vao fullname: ");
		account.fullname = scanner.next();
		System.out.print("Nhap position: ");
		int position = scanner.nextInt();
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
		switch (position) {
		case 1:
			account.position = position1;
			break;
			
		case 2:
			account.position = position2;
			break;
			
		case 3:
			account.position = position3;
			break;

		default:
			break;
		}
		System.out.println("Account :");
		System.out.println("id:"+account.id);
		System.out.println("username:"+account.username);
		System.out.println("fullname:"+account.fullname);
		System.out.println("position:"+account.position.name);
	}
}
