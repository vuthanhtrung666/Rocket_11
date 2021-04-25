package com.vti.entity;

public class Employee extends User {
	private int projectId;
	private ProSkill proSkill;
	
	public Employee(int id, String fullname, String email, String password,int projectId,ProSkill proSkill) {
		setId(id);
		setFullname(fullname);
		setEmail(email);
		setPassword(password);
		setProjectId(projectId);
		setProSkill(proSkill);
	}


	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public ProSkill getProSkill() {
		return proSkill;
	}

	public void setProSkill(ProSkill proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Project ID:" + getProjectId());
		System.out.println("ProSkill:" + getProSkill());
	}

}
