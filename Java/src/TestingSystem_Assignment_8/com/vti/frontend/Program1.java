package TestingSystem_Assignment_8.com.vti.frontend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import TestingSystem_Assignment_7.com.vti.utils.ScannerUtils;
import TestingSystem_Assignment_8.com.vti.entity.exer1.Student;

public class Program1 {
	private static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		input();
//		System.out.println("So phan tu:"+(students.size()));
//		
//		System.out.println("Phan tu thu 4:" + students.get(3));
//		
//		System.out.println("Phan tu dau:" + students.get(0));
//		System.out.println("Phan tu cuoi:" + students.get(students.size()-1));
//		
//		students.add(0, new Student("Them vao vi tri dau"));
//		students.add(students.size(), new Student("Them vao vi tri cuoi"));
//		System.out.println("Phan tu dau:" + students.get(0));
//		System.out.println("Phan tu cuoi:" + students.get(students.size()-1));

//		for (Student student : students) {
//			System.out.println(student);
//		}
//		Collections.reverse(students);
//		System.out.println("Sau khi doi nguoc:");
//		for (Student student : students) {
//			System.out.println(student);
//		}
//
//		findById();
//
//		findByName();
//		
//		findDuplicateStudent();
//		
//		deleteById(2);
//		for (Student student : students) {
//			System.out.println(student);
//		}
//		
//		deleteStudentById(5);
//		for (Student student : students) {
//			System.out.println(student);
//		}
	}

	public static void input() {
		students.add(new Student("Nguyen Van A"));
		students.add(new Student("Nguyen Van B"));
		students.add(new Student("Nguyen Van C"));
		students.add(new Student("Nguyen Van A"));
		students.add(new Student("Nguyen Van E"));
		students.add(new Student("Nguyen Van B"));
		students.add(new Student("Nguyen Van G"));
	}

	public static void findById() {
		System.out.print("id can tim:");
		int n = ScannerUtils.inputInt("xin nhap vao dung id.");
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == n) {
				System.out.println(students.get(i));
			} else {
				System.out.println("khong co thong tin can tim.");
			}
		}
	}

	public static void findByName() {
		System.out.print("name can tim:");
		String name = ScannerUtils.inputName();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				System.out.println(students.get(i));
			} else {
				System.out.println("khong co thong tin can tim.");
			}
		}
	}

	public static void findDuplicateStudent() {
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println("Các student trùng tên: ");
					System.out.println(students.get(i));
					System.out.println(students.get(j));
				}
			}
		}
	}
	public static void deleteById(int id) {
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getId()==id) {
				students.get(i).setName(null);
			}
		}
	}
	
	public static void deleteStudentById(int id) {
		for(int i=0;i< students.size();i++) {
			if(students.get(i).getId() == id) {
				students.remove(i);
			}
		}
	}
}
