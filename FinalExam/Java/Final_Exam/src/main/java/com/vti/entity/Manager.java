package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Manager extends User {
	private int ExpInYear;

	public Manager() {
		super();
		input();
	}
	

	public Manager(int id, String fullname, String email, String password,int expInYear) {
		setId(id);
		setFullname(fullname);
		setEmail(email);
		setPassword(password);
		ExpInYear = expInYear;
	}


	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public void input() {
		super.input();
		System.out.print("Số năm đã quản lý:");
		setExpInYear(ScannerUtils.inputInt("Nhập một số!"));
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Số năm đã quản lý:" + getExpInYear());
	}

}
