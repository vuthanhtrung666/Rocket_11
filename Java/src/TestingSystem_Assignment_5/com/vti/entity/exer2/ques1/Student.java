package TestingSystem_Assignment_5.com.vti.entity.exer2.ques1;

import java.util.Scanner;

public class Student implements IStudent {
	private int id;
	private String name;
	protected int group;

	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public void diemDanh() {
		// 
		System.out.println(name + " điểm danh.");
	}

	@Override
	public void hocBai() {
		// 
		System.out.println(name + " đang học bài.");
	}

	@Override
	public void donVeSinh() {
		// 
		System.out.println(name + " đang dọn vệ sinh.");
	}

}
