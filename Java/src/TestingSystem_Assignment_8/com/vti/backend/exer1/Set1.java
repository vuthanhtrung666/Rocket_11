package TestingSystem_Assignment_8.com.vti.backend.exer1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import TestingSystem_Assignment_8.com.vti.entity.exer1.Student;

public class Set1 {
	private Set<Student> students;

	public Set1() {
		students = new HashSet<>();
		inputSet();
	}

	public void inputSet() {
		students.add(new Student("Nguyen Van A"));
		students.add(new Student("Nguyen Van B"));
		students.add(new Student("Nguyen Van C"));
		students.add(new Student("Nguyen Van D"));
		students.add(new Student("Nguyen Van E"));
		students.add(new Student("Nguyen Van F"));
		students.add(new Student("Nguyen Van G"));
	}

	public void print() {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			System.out.println((Student) iterator.next());
		}
	}

	public void addInto(int a, String name) {
		
	}

	public void amount() {
		System.out.println("So phan tu:" + (students.size()));
	}

	public void getIndex(int a) {
		Iterator<Student> iterator = students.iterator();
		for (int i = 0; i < students.size() - a; i++) {
			iterator.next();
		}
		System.out.println("Student thứ " + (a) + ": ");
		System.out.println(iterator.next());
	}

	public void firstAndLast() {
		
	}

	public void reverse() {

	}

	public void findById() {

	}

	public void findByName() {

	}

	public void findDuplicateStudent() {

	}

	public void deleteById(int id) {

	}

	public void deleteStudentById(int id) {

	}
}
