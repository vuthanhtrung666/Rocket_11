package com.vti.entity;

import com.vti.utils.ScannerUtils;

public abstract class User {
	private int id;
	private String fullname;
	private String email;
	private String password;

	public User() {
		
	}
	
	public User(int id, String fullname, String email, String password) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void input() {
		System.out.print("Nhập FullName:");
		setFullname(ScannerUtils.inputName());
		System.out.print("Nhập Email:");
		setEmail(ScannerUtils.inputEmail());
		System.out.print("Nhập Password:");
		setPassword(ScannerUtils.inputPassword());
	}

	public void display() {
		System.out.println("Id:" + getId());
		System.out.println("FullName:" + getFullname());
		System.out.println("Email:" + getEmail());
		System.out.println("Password:" + getPassword());
	}
}
