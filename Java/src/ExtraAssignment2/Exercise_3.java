package ExtraAssignment2;

import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// System.out.print("nhap n:");
		int n = 6;
		question1a(n);
		question1b(n);
		question1c(n);
		question1d(n);
		// question2(n);
	}

	private static void question2(int n) {
		// TODO Auto-generated method stub
		int kq = 1;
		if (n == 0) {
			System.out.println("0! = 1");
		} else {
			for (int i = n; i > 0; i--) {
				kq = kq * i;
			}
			System.out.print("n! = " + kq);
		}
	}

	private static void question1d(int n) {
		// TODO Auto-generated method stub
		System.out.println("d,");
		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void question1c(int n) {
		// TODO Auto-generated method stub
		System.out.println("c,");
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print("  ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void question1b(int n) {
		// TODO Auto-generated method stub
		System.out.println("b,");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void question1a(int n) {
		// TODO Auto-generated method stub
		System.out.println("a,");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
