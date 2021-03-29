package ExtraAssignment3;

import java.util.Scanner;

public class Exercise_1_Loop {

	public static void main(String[] args) {
		//
		Scanner scanner = new Scanner(System.in);
//		Question 1:
//		Nhập vào dãy n số thực. Tính tổng dãy, trung bình dãy, tổng các số âm,
//		dương và tổng các số ở vị trí chẵn, vị trí lẻ trong dãy.

		System.out.println("Question 1:");
		int[] b = { 3, 6, -7, 5, -4, 5, -2 };
		int t = 0;
		float tbc = 0;
		int tsa = 0;
		int tsd = 0;
		int tc = 0;
		int tl = 0;
		for (int i = 0; i < b.length; i++) {
			t += b[i];
		}
		System.out.println("Tổng dãy:" + t);
		tbc = (float) t / b.length;
		System.out.printf("Trung bình cộng:%1.2f\n", tbc);
		for (int i = 0; i < b.length; i++) {
			if (b[i] < 0) {
				tsa += b[i];
			}
		}
		System.out.println("Tổng các số âm:" + tsa);
		for (int i = 0; i < b.length; i++) {
			if (b[i] >= 0) {
				tsd += b[i];
			}
		}
		System.out.println("Tổng các số dương:" + tsd);
		for (int i = 0; i < b.length; i++) {
			if (i % 2 == 0) {
				tc += b[i];
			}
		}
		System.out.println("Tổng các số ở vị trí chẵn:" + tc);
		for (int i = 0; i < b.length; i++) {
			if (i % 2 != 0) {
				tl += b[i];
			}
		}
		System.out.println("Tổng các số ở vị trí lẻ:" + tl);

//		Question 2:
//		Tìm và chỉ ra vị trí xuất hiện đầu tiên của phần tử x trong dãy.

		int x = 5;
		System.out.println("Question 2:");
		for (int i = 0; i < b.length; i++) {
			if (x == b[i]) {
				System.out.printf("Vị trí xuất hiện đầu tiên của phần tử %d là %d\n", x, i);
				break;
			}
		}

//		Question 3:
//		Hãy nhập vào 16 số nguyên. In ra thành 4 dòng, 4 cột.

		System.out.println("Question 3:");
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%2d  ", a[4 * i + j]);
			}
			System.out.println();
		}

//		Question 4:
//		Nhập vào dãy số. In ra dãy đã được sắp xếp tăng dần, giảm dần

		System.out.println("Question 4:");
		int temp = b[0];
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] >= b[j]) {
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
			}
		}
		System.out.println("Tăng dần:");
		for (int i : b) {
			System.out.print(i + " ");
		}
		temp = b[0];
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] < b[j]) {
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
			}
		}
		System.out.println("\nGiảm dần:");
		for (int i : b) {
			System.out.print(i + " ");
		}

//		Question 5:
//		Cho một dãy các số sau: 10, 20, 90, 50, 100, 60, 30, 80, 70, 40.
//		Hãy sắp xếp các dãy này theo chiều tăng dần, giảm dần
//		Yêu cầu:
//		Thiết kế giao diện console nhập từng phần tử và hiển thị kết
//		quả ra màn hình.
//		Sau khi nhập đủ 10 phần tử theo đúng thứ tự như đề bài thì
//		thực hiện sắp xếp theo chiều tăng dần, giảm dần

		System.out.println("\nQuestion 5:");
		System.out.print("Số phần tử nhập:");
		int n = Integer.parseInt(scanner.next());
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Số thứ " + (i + 1)+": ");
			c[i] = Integer.parseInt(scanner.next());
		}
		int temp1 = c[0];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (c[i] >= c[j]) {
					temp1 = c[j];
					c[j] = c[i];
					c[i] = temp1;
				}
			}
		}
		System.out.println("Tăng dần:");
		for (int i : c) {
			System.out.print(i + " ");
		}
		temp1 = c[0];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (c[i] < c[j]) {
					temp1 = c[j];
					c[j] = c[i];
					c[i] = temp1;
				}
			}
		}
		System.out.println("\nGiảm dần:");
		for (int i : c) {
			System.out.print(i + " ");
		}
		scanner.close();
	}

}
