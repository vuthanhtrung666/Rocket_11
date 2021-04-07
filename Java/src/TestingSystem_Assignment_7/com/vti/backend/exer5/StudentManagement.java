package TestingSystem_Assignment_7.com.vti.backend.exer5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_7.com.vti.entity.exer5.Student;
import TestingSystem_Assignment_7.com.vti.utils.FileManager;
import TestingSystem_Assignment_7.com.vti.utils.IOManager;

public class StudentManagement {
	private List<Student> students;
	private String pathFile;
	private Scanner sc;

	public StudentManagement() {
		students = new ArrayList<>();
		sc = new Scanner(System.in);
		pathFile = "D:\\VTI\\Rocket_11\\Java\\src\\TestingSystem_Assignment_7\\com\\vti\\backend\\file\\StudentInformation.txt";
	}

	public void addStudent() throws Exception {
		System.out.print("Số học sinh thêm:");
		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			students.add(student);
		}
		if(FileManager.isFileExists(pathFile)) {
			IOManager.writeObject(students, pathFile);
		} else {
			FileManager.createNewFile(pathFile);
			IOManager.writeObject(students, pathFile);
		}
		
	}

	public void readfile() throws Exception {
		List<Student> readObject = (List<Student>) IOManager.readObject(pathFile);
		students = readObject;
	}

	public void display() {
		for (Student student : students) {
			student.output();
		}
	}
}
