package TestingSystem_Assignment_7.com.vti.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_7.com.vti.backend.exer5.StudentManagement;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManagement sManagement = new StudentManagement();
		byte choose;
		menu();
		while (true) {
			System.out.print("Mời bạn chọn chức năng:");
			choose = Byte.parseByte(sc.next());
			switch (choose) {
			case 1:
				try {
					sManagement.addStudent();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				;
				break;
			case 2:
				sManagement.display();
				break;
			case 3:
				try {
					sManagement.readfile();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 0:
				sc.close();
				return;
			default:
				System.out.println("Nhập sai. Xin nhập lại!");
				break;
			}
			menu();
		}
	}

	public static void menu() {
		System.out.println("------MENU------");
		System.out.println("1) Insert student.");
		System.out.println("2) View list.");
		System.out.println("3) Read file.");
		System.out.println("0) Exit.");
	}
}
