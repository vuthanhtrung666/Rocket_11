package TestingSystem_Assignment_5.com.vti.frontend.exer1;

import java.util.Scanner;

import TestingSystem_Assignment_5.com.vti.backend.ITuyenSinh;
import TestingSystem_Assignment_5.com.vti.backend.TuyenSinh;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ITuyenSinh tuyensinh = new TuyenSinh();
		byte choose;
		menu();
		while (true) {
			System.out.print("Mời bạn chọn chức năng:");
			choose = Byte.parseByte(sc.next());
			switch (choose) {
			case 1:
				tuyensinh.themThiSinh();;
				break;
			case 2:
				tuyensinh.hienThiSinh();
				break;
			case 3:
				tuyensinh.timTheoSBD();
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
		System.out.println("Quản lý thí sinh");
		System.out.println("1) Thêm mới thí sinh.");
		System.out.println("2) Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
		System.out.println("3) Tìm kiếm theo số báo danh.");
		System.out.println("0) Thoát khỏi chương trình.");
	}
}
