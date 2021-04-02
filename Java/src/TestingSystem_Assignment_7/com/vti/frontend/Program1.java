package TestingSystem_Assignment_7.com.vti.frontend;

import TestingSystem_Assignment_7.com.vti.entity.exer1.MyMath;
import TestingSystem_Assignment_7.com.vti.entity.exer1.Student;

public class Program1 {

	public static void main(String[] args) {
		//
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		Student.setCollege("Đại học bách khoa");
		System.out.println("Tiền quỹ lớp:" + Student.getMoneyGroup());
		for (Student student : students) {
			System.out.println(student);
		}
		student1.spend(50);
		student2.spend(20);
		student3.spend(150);
		for(int i=0;i<students.length;i++) {
			students[i].fund();
		}
		System.out.println("Tiền quỹ lớp:" + Student.getMoneyGroup());
//		Student.setCollege("Đại học công nghệ");
//		for (Student student : students) {
//			System.out.println(student);
//		}
		int result = MyMath.max(5, 7);
		System.out.println(result);
		result = MyMath.sum(5, 7);
		System.out.println(result);
		result = MyMath.min(5, 7);
		System.out.println(result);
	}

}
