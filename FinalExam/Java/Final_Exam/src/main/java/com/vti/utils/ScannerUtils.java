package com.vti.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

	public static Date inputDate(String errorMessage) {
		while (true) {
			String dateString = sc.nextLine().trim();
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			try {
				return df.parse(dateString);
			} catch (ParseException e) {
				System.err.println(errorMessage + "format:dd/MM/yyyy");
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
				System.err.println("Wrong inputing! The age must be greater than 18, please input again.");
			}
		}
	}

	public static String inputEmail() {
		while (true) {
			String email = inputString("Wrong inputing! The email is not empty");
			if (email.contains("@")) {
				return email;
			} else {
				System.err.println("email has @.");
			}
		}
	}

	public static String inputName() {
		while (true) {
			String name = inputString("Wrong inputing! The name is not empty");
			String[] partname = name.split("\\s+");
			String nameout = "";
			for (int i = 0; i < partname.length; i++) {
				String s3 = partname[i].substring(0, 1).toUpperCase();
				nameout = nameout + s3 + partname[i].substring(1) + " ";
			}
			return nameout;
		}
	}

	public static String inputPassword() {
		while (true) {
			String password = inputString("Wrong inputing! The password is not empty");
			if (password.length() < 6 || password.length() > 12) {
				System.err.println("password phải từ 6-12 ký tự!");
				System.out.print("Mời bạn nhập lại password: ");
				continue;
			}

//			boolean hasAtLeast1Character = false;
//
//			for (int i = 0; i < password.length(); i++) {
//				if (Character.isUpperCase(password.charAt(i)) == true) {
//					hasAtLeast1Character = true;
//					break;
//				}
//			}
//			if (hasAtLeast1Character == true) {
				return password;
//			} else {
//				System.err.println("password phải có ít nhất 1 ký tự viết hoa");
//				System.out.print("Mời bạn nhập lại password: ");
//			}
		}
	}
}
