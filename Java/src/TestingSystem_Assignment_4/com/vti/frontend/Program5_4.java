package TestingSystem_Assignment_4.com.vti.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_4.com.vti.backend.QLTV;

public class Program5_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLTV qltv = new QLTV();
		byte choose;
		menu();
		while (true) {
			System.out.print("Mời bạn chọn chức năng:");
			choose = Byte.parseByte(scanner.nextLine());
			switch (choose) {
			case 1:
				qltv.themTaiLieu();
				break;
			case 2:
				qltv.xoaTheoMa();
				break;
			case 3:
				qltv.hienThi();
				break;
			case 4:
				qltv.timKiemTheoLoai();
				break;
			case 0:
				scanner.close();
				return;
			default:
				break;
			}
			menu();
		}
	}
	public static void menu() {
		System.out.println("Quản lý tài liệu");
		System.out.println("1) Thêm mới tài liêu: Sách, tạp chí, báo.");
		System.out.println("2) Xoá tài liệu theo mã tài liệu.");
		System.out.println("3) Hiện thị thông tin về tài liệu.");
		System.out.println("4) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
		System.out.println("0) Thoát khỏi chương trình.");
	}

}
