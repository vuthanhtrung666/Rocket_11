package TestingSystem_Assignment_5.com.vti.backend;

import TestingSystem_Assignment_5.com.vti.entity.exer2.ques1.Student;

public class Question1 {
	private Student[] students;
	public Question1() {
		students = new Student[10];
	}
	public void initStudents() {
		students[0] = new Student(1, "Đăng", 1);
		students[1] = new Student(2, "Quang Anh", 1);
		students[2] = new Student(3, "Duy", 1);
		students[3] = new Student(4, "Chiến", 2);
		students[4] = new Student(5, "Hữu", 2);
		students[5] = new Student(6, "Hiền", 2);
		students[6] = new Student(7, "Bích", 3);
		students[7] = new Student(8, "Thủy", 3);
		students[8] = new Student(9, "Phương", 3);
		students[9] = new Student(10, "Nam", 3);
		System.out.println("Thêm student xong.");
	}

	public void caLopDiemDanh() {
		System.out.println("Điểm danh:");
		for (int i = 0; i < students.length; i++) {
			students[i].diemDanh();
		}
	}

	public void nhomDiHocBai() {
		System.out.println("Học bài:");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGroup() == 1) {
				students[i].hocBai();
			}
		}
	}

	public void nhomDiDonVeSinh() {
		System.out.println("Dọn vệ sinh:");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGroup() == 2) {
				students[i].donVeSinh();
			}
		}
	}
}
