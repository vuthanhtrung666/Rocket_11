package TestingSystem_Assignment_8.com.vti.backend.exer3;


import TestingSystem_Assignment_8.com.vti.entity.exer3.Employee;
import TestingSystem_Assignment_8.com.vti.entity.exer3.Phone;
import TestingSystem_Assignment_8.com.vti.entity.exer3.Staff;
import TestingSystem_Assignment_8.com.vti.entity.exer3.Student;

public class Generic {
	public void ques1_2_3() {
		Student<Integer> studentInt = new Student<Integer>(1, "Nguyen Van A");
		Student<Float> studentFloat = new Student<Float>(2.0f, "Nguyen Van B");
		Student<Double> studentDouble = new Student<Double>(3.0, "Nguyen Van C");
		print(3.5f);
		print(4);
		print(studentInt);
		print(studentFloat);
		print(studentDouble);
	}
	
	public void ques4() {
		Integer[] arrInt = { 5, 10, 15 };
		Float[] arrFloat = { 6f, 5f, 15f };
		Double[] arrDouble = { 5.2, 2.6, 6.9 };

		print(arrInt);
		print(arrFloat);
		print(arrDouble);
	}
	
	public void ques5() {
		Integer[] salaryEmployee1 = { 1000, 1200, 1200 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "Đăng", salaryEmployee1);
		System.out.println("Employee vừa khởi tạo: ");
		print(employee1);
		System.out.println("Tháng lương cuối cùng của employee 1: " + salaryEmployee1[salaryEmployee1.length - 1]);
		
		Float[] salaryEmployee2 = { 1000f, 1200f, 1200f, 3000f };
		Employee<Float> employee2 = new Employee<Float>(1, "Duy", salaryEmployee2);
		System.out.println("Employee vừa khởi tạo: ");
		print(employee2);
		System.out.println("Tháng lương cuối cùng của employee 2: " + salaryEmployee2[salaryEmployee2.length - 1]);
		
		Double[] salaryEmployee3 = { 1000d, 1200d, 1200d, 6900d, 9600d, 12000d };
		Employee<Double> employee3 = new Employee<Double>(1, "Thắng", salaryEmployee3);
		System.out.println("Employee vừa khởi tạo: ");
		print(employee3);
		System.out.println("Tháng lương cuối cùng của employee3: " + salaryEmployee3[salaryEmployee3.length - 1]);
	}
	
	public void ques7() {
		// <email, phone number>
		Phone<String, String> email = new Phone<String, String>("duynn03@gmail.com", "0332782799");
		System.out.println("Email: " + email.getKey() + " / " + "Phone Number: " + email.getPhoneNumber());

		// <id, phone number>
		Phone<Integer, String> id = new Phone<Integer, String>(1, "0332782799");
		System.out.println("id: " + id.getKey() + " / " + "Phone Number: " + id.getPhoneNumber());

		// <name, phone number>
		Phone<String, String> name = new Phone<String, String>("Duy", "0332782799");
		System.out.println("Name: " + name.getKey() + " / " + "Phone Number: " + name.getPhoneNumber());
	}

	public void ques8() {
		// Integer
		Staff<Integer> staff1 = new Staff<Integer>(1, "Nguyễn Văn A");
		System.out.println("ID: " + staff1.getId() + " / " + "Name: " + staff1.getName());

		// Float
		Staff<Float> staff2 = new Staff<Float>(1.5f, "Nguyễn Văn A");
		System.out.println("ID: " + staff2.getId() + " / " + "Name: " + staff2.getName());
	}

	public <T> void print(T a) {
		System.out.println(a);
	}

	public <T> void print(T[] a) {
		for (T t : a) {
			System.out.println(t);
		}
	}
}
