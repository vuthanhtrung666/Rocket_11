package TestingSystem_Assignment_7.com.vti.entity.exer5;

import java.io.Serializable;

import TestingSystem_Assignment_7.com.vti.utils.ScannerUtils;

public class Student implements Serializable{
	private int id;
	private String name;
	public static int count = 0;
	
	public Student() {
		input();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void input() {
		count++;
		id = count;
		System.out.print("Tên student:");
		name = ScannerUtils.inputName();
	}

	public void output() {
		System.out.println("id: " + id + ", name: " + name);
	}
}
