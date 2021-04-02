package TestingSystem_Assignment_6.com.vti.frontend;

import TestingSystem_Assignment_6.com.vti.backend.ScannerUtils;

public class Question5_6_7_8 {

	public static void main(String[] args) {
		System.out.println("Nhập tuổi:");
		try {
			int age = inputAge();
			System.out.println("tuổi:" + age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int inputAge() throws Exception {
		while (true) {
			int age = ScannerUtils.inputInt("Wrong inputing! Please input an age as int, input again.");
			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");
			} else {
				return age;
			}
		}
	}

}
