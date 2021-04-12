package TestingSystem_Assignment_9.com.vti.backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import TestingSystem_Assignment_9.com.vti.entity.exer2.Student;



public class Annotations {
	@SuppressWarnings({ "deprecation" })
	public void ques1() {
		Date a = new Date("05/18/2020");
		System.out.println(a);
	}
	
	public void ques2() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Nguyễn Văn A"));
		students.add(new Student("Nguyễn Văn B"));
		students.add(new Student("Nguyễn Văn C"));
		students.add(new Student("Nguyễn Văn D"));
		for (Student student : students) {
			System.out.println(student.print());
		}
		for (Student student : students) {
			System.out.println(student.print2());
		}
	}
}
