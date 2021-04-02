package TestingSystem_Assignment_6.com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

import TestingSystem_Assignment_6.com.vti.backend.ScannerUtils;

public class Group {
	private int id;
	private String name;
	private Account[] accounts;
	private LocalDate createDate;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public Group() {
		
		input();
	}

	private void input() {
		System.out.println("Nhập id : ");
		id = ScannerUtils.inputInt("Please input a group id as int, please input again.");
		System.out.println("Nhập tên : ");
		name = ScannerUtils.inputString("Please input a group name, please input again.");
		confirmAddAccount();
	}

	private void confirmAddAccount() {
		System.out.println("Bạn có muốn add account không? (nhập 1 là có, 2 là không): ");
		int choose;
		while (true) {
			choose = ScannerUtils.inputInt("Please input a number as int");
			switch (choose) {
			case 2:
				return;
			case 1:
				addAccount();
				return;
			default:
				System.out.println("Chỉ được nhập 1 hoặc 2, mời nhập lại: ");
				break;
			}
		}
	}

	private void addAccount() {
		System.out.println("Nhập số lượng account có trong group: ");
		int n = ScannerUtils.inputInt("Please input a number as int, please input again.");
		accounts = new Account[n];
		for (int i = 0; i < n; i++) {
			accounts[i] = new Account();
		}
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", accounts=" + Arrays.toString(accounts) + ", createDate="
				+ createDate + "]";
	}
}
