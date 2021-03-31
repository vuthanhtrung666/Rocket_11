package TestingSystem_Assignment_5.com.vti.frontend.exer1;

import java.util.Scanner;

import TestingSystem_Assignment_5.com.vti.backend.MyNews;

public class Program1 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		MyNews myNews = new MyNews();
		byte choose;
		menu();
		while (true) {
			System.out.print("Mời bạn chọn chức năng:");
			choose = Byte.parseByte(sc.next());
			switch (choose) {
			case 1:
				myNews.insertNews();;
				break;
			case 2:
				myNews.viewNews();
				break;
			case 3:
				myNews.average();
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
		System.out.println("1) Insert news.");
		System.out.println("2) View list news.");
		System.out.println("3) Average rate.");
		System.out.println("0) Exit.");
	}
}
