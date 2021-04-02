package TestingSystem_Assignment_6.com.vti.entity;

import TestingSystem_Assignment_6.com.vti.backend.ScannerUtils;

public class Position {
	private int id;
	private String name;

	public Position() {
		input();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void input() {
		System.out.print("id:");
		id = ScannerUtils.inputInt("Phải nhập id dưới dạng int. Xin nhập lại.");
		System.out.print("name:");
		name = ScannerUtils.inputString("Phải nhập tên dưới dạng String. Xin nhập lại.");
	}

	@Override
	public String toString() {
		return "id:" + id + ", name:" + name;
	}
}
