package TestingSystem_Assignment_5.com.vti.entity.exer2.ques2;

import java.util.Scanner;

public class Student extends Person {
	private int maSV;
	private float diemTB;
	private String email;
	private Scanner sc;

	public int getMaSV() {
		return maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getEmail() {
		return email;
	}

	public Student() {
		sc = new Scanner(System.in);
		inputInfo();
	}

	@Override
	public void inputInfo() {
		// 
		super.inputInfo();
		System.out.print("Mã sinh viên:");
		maSV = Integer.parseInt(sc.next());
		System.out.print("Điểm trung bình:");
		diemTB = Float.parseFloat(sc.next());
		System.out.print("Email:");
		email = sc.next();
	}

	@Override
	public void showInfo() {
		// 
		super.showInfo();
		System.out.println("Mã sinh viên:" + maSV);
		System.out.println("Điểm trung bình:" + diemTB);
		System.out.println("Email:" + email);
	}

}
