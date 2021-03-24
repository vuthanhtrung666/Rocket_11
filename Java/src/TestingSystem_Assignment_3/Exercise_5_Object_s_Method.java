package TestingSystem_Assignment_3;

import TestingSystem_Assignment_1.Department;

public class Exercise_5_Object_s_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question 1:
//		In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Accounting";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Boss of director";
		
		Department[] departments = new Department[3];
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
//		question1(department1);
		
//		Question 2:
//		In ra thông tin của tất cả phòng ban (sử dụng toString())
		question2(departments);
		
//		Question 3:
//		In ra địa chỉ của phòng ban thứ 1
		question3(department1);
		
//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
		question4(department1);
		
//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
		question5(department1,department2);
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		question6(departments);
//		Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//		sách phòng ban được sắp xếp theo tên
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		waiting room
//		Sale
	}

	private static void question6(Department[] departments) {
		// TODO Auto-generated method stub
		for(int i=0;i<departments.length;i++) {
			for(int j=0;j<departments.length-1;j++) {
				if(departments[i].name.compareToIgnoreCase(departments[j].name)<0) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
 				}
			}
		}
		for(Department department:departments) {
			System.out.println(department);
		}
	}

	private static void question5(Department department1, Department department2) {
		// TODO Auto-generated method stub
		System.out.println("question 5");
		if(department1.name.equals(department2.name)) {
			System.out.println("tên hai phòng ban bằng nhau");
		} else {
			System.out.println("tên hai phòng ban khác nhau");
		}
	}

	private static void question4(Department department1) {
		// TODO Auto-generated method stub
		System.out.println("question 4");
		if(department1.name.equals("Phòng A")) {
			System.out.println("phòng ban thứ 1 có tên là Phòng A");
		} else {
			System.out.println("phòng ban thứ 1 không có tên là Phòng A");
		}
	}

	private static void question3(Department department1) {
		// TODO Auto-generated method stub
		System.out.println("question 3");
		System.out.println(department1.hashCode());
	}

	private static void question2(Department[] departments) {
		// TODO Auto-generated method stub
		System.out.println("question 2");
		for(Department department:departments) {
			System.out.println(department);
		}
	}

	private static void question1(Department department1) {
		// TODO Auto-generated method stub
		System.out.println("question 1");
		System.out.println(department1);
	}

}
