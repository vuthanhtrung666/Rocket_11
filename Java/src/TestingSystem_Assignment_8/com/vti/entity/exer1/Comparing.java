package TestingSystem_Assignment_8.com.vti.entity.exer1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Comparing {
	private List<Student> students;

	public Comparing() {
		students = new ArrayList<>();
		inputStudents();
	}

	private void inputStudents() {
		students.add(new Student("Nguyen Van F", LocalDate.parse("2020-05-29"), 8));
		students.add(new Student("Nguyen Van E", LocalDate.parse("2020-05-29"), 10));
		students.add(new Student("Nguyen Van D", LocalDate.parse("2015-05-04"), 6));
		students.add(new Student("Nguyen Van C", LocalDate.parse("2020-01-29"), 5));
		students.add(new Student("Nguyen Van B", LocalDate.parse("2020-04-29"), 8));
		students.add(new Student("Nguyen Van A", LocalDate.parse("2020-02-29"), 3));

		System.out.println("List student : ");
		printStudent();
	}

	private void printStudent() {
		for (Student st : students) {
			System.out.println(st);
		}
	}

	public void question1() {
		Collections.sort(students);

		System.out.println("List sau khi sắp xếp: ");
		printStudent();
	}

}
