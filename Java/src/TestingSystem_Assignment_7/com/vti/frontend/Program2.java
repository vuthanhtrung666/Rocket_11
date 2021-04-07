package TestingSystem_Assignment_7.com.vti.frontend;

import TestingSystem_Assignment_7.com.vti.entity.exer2.PrimaryStudent;
import TestingSystem_Assignment_7.com.vti.entity.exer2.Student;

public class Program2 {
	public static void main(String[] args) {
		Student student = new PrimaryStudent(1, "trung");
		student.study();
	}
}
