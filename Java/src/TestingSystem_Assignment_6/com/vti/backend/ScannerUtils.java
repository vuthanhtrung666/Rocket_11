package TestingSystem_Assignment_6.com.vti.backend;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner sc = new Scanner(System.in);

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(sc.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(sc.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String input = sc.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");
			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");
			} else {
				return age;
			}
		}
	}

	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();
			if (age >= 18) {
				return age;
			} else {
				System.out.println("Wrong inputing! The age must be greater than 18, please input again.");
			}
		}
	}
}
