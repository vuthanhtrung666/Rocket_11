package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;


public class Program {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		
		int choose;
		do {
			menu1();
			System.out.print("Mời bạn chọn chức năng:");
			choose = ScannerUtils.inputInt("Nhap 1|0.");
			Funtion funtion = new Funtion();
			switch (choose) {
			case 1:
				System.out.print("Email:");
				String email = ScannerUtils.inputEmail();
				System.out.print("Password:");
				String pass = ScannerUtils.inputPassword();
				boolean login = funtion.Login(email, pass);
				if(login) {
					
					do {
						menu2();
						System.out.print("Mời bạn chọn chức năng:");
						choose = ScannerUtils.inputInt("Nhap 1|3.");
						switch (choose) {
						case 1:
							System.out.print("Id:");
							int id = ScannerUtils.inputInt("Nhập sai");
							funtion.getListUser(id);
							break;
						
						default:
							System.out.println("Nhập sai. Xin nhập lại!");
							break;
						}
					} while(choose!=0);
				}
				break;
			case 0:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Nhập sai. Xin nhập lại!");
				break;
			}
		} while(choose != 0);
	}
	public static void menu2() {
		System.out.println("------MENU------");
		System.out.println("1) Lấy ra tất cả Manager của các project.");
		System.out.println("2) In ra tất cả các employee và Manager trong project đó.");
		System.out.println("3) .");
		System.out.println("0) Thoát.");
	}
	
	public static void menu1() {
		System.out.println("------MENU------");
		System.out.println("1) Login.");
		System.out.println("0) Thoát.");
	}
}
