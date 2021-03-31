package TestingSystem_Assignment_5.com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_5.com.vti.entity.exer2.ques2.Person;
import TestingSystem_Assignment_5.com.vti.entity.exer2.ques2.Student;

public class Question2 {
	private List<Person> persons;
	private Scanner sc;
	public Question2() {
		persons = new ArrayList<>();
		sc=new Scanner(System.in);
	}
	public void themStudent() {
		System.out.print("Số student thêm:");
		int n = Integer.parseInt(sc.next());
		for(int i=0;i<n;i++) {
			System.out.println("Student thứ "+(i+1)+":");
			Student student = new Student();
			persons.add(student);
		}
	}
	public void hienStudent() {
		for (Person person : persons) {
			person.showInfo();
		}
	}
	public void hocBong() {
		System.out.print("Nhập tên sinh viên xét:");
		String name = sc.nextLine();
		for (Person person : persons) {
			if(person instanceof Student) {
				if(person.getName().equals(name)) {
					if(((Student) person).getDiemTB()>=8) {
						System.out.println("Sinh viên "+name+" được học bổng!");
					} else {
						System.out.println("Sinh viên "+name+" không được học bổng!");
					}
				}
			}
		}
	}
}
