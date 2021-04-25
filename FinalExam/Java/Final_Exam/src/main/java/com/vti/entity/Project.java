package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Project {
	private int projectId;
	private int teamSize;
	private int manager;
	private int employees;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public void input() {
		System.out.print("Team size:");
		setTeamSize(ScannerUtils.inputInt("Nhập lỗi! Xin nhập lại."));
		System.out.print("Manager id:");
		setManager(ScannerUtils.inputInt("Nhập lỗi! Xin nhập lại."));
		System.out.print("Employees id:");
		setEmployees(ScannerUtils.inputInt("Nhập lỗi! Xin nhập lại."));
	}
	public void display() {
		System.out.println("Id:" + getProjectId());
		System.out.println("Team size:" + getTeamSize());
		System.out.println("Manager id::" + getManager());
		System.out.println("Employees id:" + getEmployees());
	}
}
