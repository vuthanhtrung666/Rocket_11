package TestingSystem_Assignment_5.com.vti.entity.exer2.ques2;

import java.time.LocalDate;
import java.util.Scanner;

import TestingSystem_Assignment_4.com.vti.entity.Exer5.Gender;

public class Person {
	private String name;
	private Gender gender;
	private LocalDate birthday;
	private String address;

	public Person() {
	}

	public Person(String name, Gender gender, LocalDate birthday, String address) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(int a) {
		if (a == 0) {
			this.gender = Gender.MALE;
		} else if (a == 1) {
			this.gender = Gender.FEMALE;
		} else {
			this.gender = Gender.UNKNOWN;
		}
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên:");
		name = sc.nextLine();
		System.out.print("Giới tính(0.Nam|1.Nữ):");
		int gt = Integer.parseInt(sc.nextLine());
		setGender(gt);
//		System.out.print("Ngày sinh(dd/MM/yyyy):");
//		String date = sc.next();
//		birthday = new Date(date);
		System.out.print("Địa chỉ:");
		address = sc.nextLine();
	}

	public void showInfo() {
		System.out.println("Tên:" + name);
		System.out.println("Giới tính:" + gender);
		System.out.println("Ngày sinh:" + birthday);
		System.out.println("Địa chỉ:" + address);
	}
}
