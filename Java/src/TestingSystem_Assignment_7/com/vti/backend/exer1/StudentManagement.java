package TestingSystem_Assignment_7.com.vti.backend.exer1;

import TestingSystem_Assignment_7.com.vti.entity.exer1.MyMath;
import TestingSystem_Assignment_7.com.vti.entity.exer1.PrimaryStudent;
import TestingSystem_Assignment_7.com.vti.entity.exer1.SecondaryStudent;
import TestingSystem_Assignment_7.com.vti.entity.exer1.Student;

public class StudentManagement {
	private Student[] students;

	public void ques1() throws Exception {
		students = new Student[3];
		students[0] = new Student(1, "Nguyễn Văn A");
		students[1] = new Student(2, "Nguyễn Văn B");
		students[2] = new Student(3, "Nguyễn Văn C");
		Student.setCollege("Đại học bách khoa");
		for (Student student : students) {
			System.out.println(student);
		}
		Student.setCollege("Đại học công nghệ");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void ques2() throws Exception {
		students = new Student[3];
		students[0] = new Student(1, "Nguyễn Văn A");
		students[1] = new Student(2, "Nguyễn Văn B");
		students[2] = new Student(3, "Nguyễn Văn C");
		Student.setCollege("Đại học bách khoa");
		System.out.println("Tiền quỹ lớp:" + Student.getMoneyGroup());
		students[0].spend(50);
		students[1].spend(20);
		students[2].spend(150);
		for (int i = 0; i < students.length; i++) {
			students[i].fund();
		}
		System.out.println("Tiền quỹ lớp:" + Student.getMoneyGroup());
	}

	public void ques3(int a, int b) {
		int result = MyMath.max(a, b);
		System.out.println("max:" + result);
		result = MyMath.sum(a, b);
		System.out.println("sum:" + result);
		result = MyMath.min(a, b);
		System.out.println("min:" + result);
	}

	public void ques5() throws Exception {
		Student student1 = new PrimaryStudent(1, "Nguyễn Văn A");
		Student student2 = new PrimaryStudent(2, "Nguyễn Văn B");
		Student student3 = new SecondaryStudent(3, "Nguyễn Văn C");
		Student student4 = new SecondaryStudent(4, "Nguyễn Văn D");
		Student student5 = new SecondaryStudent(5, "Nguyễn Văn E");
		Student student6 = new SecondaryStudent(6, "Nguyễn Văn F");
		System.out.print("Số sinh viên được tạo: ");
		System.out.println(Student.getCount());
	}

	public void ques6() throws Exception {
		Student student1 = new PrimaryStudent(1, "Nguyễn Văn A");
		Student student2 = new PrimaryStudent(2, "Nguyễn Văn B");
		Student student3 = new SecondaryStudent(3, "Nguyễn Văn C");
		Student student4 = new SecondaryStudent(4, "Nguyễn Văn D");
		Student student5 = new SecondaryStudent(5, "Nguyễn Văn E");
		Student student6 = new SecondaryStudent(6, "Nguyễn Văn F");
		System.out.println("Couter of Student: " + Student.getCount());
		System.out.println("Couter of Primary Student: " + PrimaryStudent.getCountPrimary());
		System.out.println("Couter of Secondary Student: " + SecondaryStudent.getCountSecondary());
	}

	public void ques7() throws Exception {
		Student student1 = new PrimaryStudent(1,"Nguyễn Văn A");
		Student student2 = new PrimaryStudent(2,"Nguyễn Văn B");
		Student student3 = new SecondaryStudent(3,"Nguyễn Văn C");
		Student student4 = new SecondaryStudent(4,"Nguyễn Văn D");
		Student student5 = new SecondaryStudent(5,"Nguyễn Văn E");
		Student student6 = new SecondaryStudent(6,"Nguyễn Văn F");
		Student student7 = new SecondaryStudent(7,"Nguyễn Văn G");
		Student student8 = new SecondaryStudent(8,"Nguyễn Văn H");
		Student student9 = new SecondaryStudent(9,"Nguyễn Văn I");
	}
}
