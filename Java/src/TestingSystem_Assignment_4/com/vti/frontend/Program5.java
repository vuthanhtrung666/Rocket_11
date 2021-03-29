package TestingSystem_Assignment_4.com.vti.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_4.com.vti.backend.QLCB;

public class Program5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		byte choose;
		menu();
		while (true) {
			System.out.print("Mời bạn chọn chức năng:");
			choose = scanner.nextByte();
			scanner.nextLine();
			switch (choose) {
			case 1:
				qlcb.add();
				break;
			case 2:
				qlcb.find();
				break;
			case 3:
				qlcb.infor();
				break;
			case 4:
				qlcb.delete();
				break;
			case 0:
				scanner.close();
				return;
			default:
				System.out.println("Nhập sai. Xin nhập lại!");
				break;
			}
			menu();
		}
	}

	public static void menu() {
		System.out.println("Quản lý cán bộ");
		System.out.println("1) Thêm mới cán bộ.");
		System.out.println("2) Tìm kiếm theo họ tên.");
		System.out.println("3) Hiện thị thông tin về danh sách các cán bộ.");
		System.out.println("4) Xoá theo họ tên.");
		System.out.println("0) Thoát.");
	}
}
