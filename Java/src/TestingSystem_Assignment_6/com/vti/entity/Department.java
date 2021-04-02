package TestingSystem_Assignment_6.com.vti.entity;

import TestingSystem_Assignment_6.com.vti.backend.ScannerUtils;

public class Department {
	private int id;
	private String name;

	public Department() {
		input();
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void input() {
		ScannerUtils su = new ScannerUtils();
		System.out.print("id:");
		id = su.inputInt("Phải nhập id dưới dạng int. Xin nhập lại.");
		System.out.print("name:");
		name = su.inputString("Phải nhập tên. Xin nhập lại.");
	}

	@Override
	public String toString() {
		return "id:" + id + ", name:" + name;
	}

}
