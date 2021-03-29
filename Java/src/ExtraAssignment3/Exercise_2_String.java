package ExtraAssignment3;

import java.util.Scanner;

public class Exercise_2_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Question 1:
//		Nhập xâu họ tên, in ra họ, tên dưới dạng viết hoa

//		System.out.println("Question 1:");
//		String hoten = "vũ thành trung";
//		System.out.println("Họ và tên:" + hoten.toUpperCase());

//		Question 2:
//		Nhập xâu. In ra tất các các vị trí của chữ ‘a’ trong xâu và tổng số lần
//		xuất hiện của nó.

//		System.out.println("Question 2:");
//		int count = 0;
//		String a = "Xin chào a bạn xem có mấy chữ a";
//		for (int i = 0; i < a.length(); i++) {
//			if (a.charAt(i) == 'a') {
//				count++;
//				System.out.printf("chữ a thứ %d nằm ở vị trí thứ %d\n",count,(i+1));
//			}
//		}
//		System.out.printf("Tổng cộng có %d chữ a\n",count);

//		Question 3:
//		Thay kí tự x trong xâu s bởi kí tự y (s, x, y được đọc vào từ bàn phím)
		
		System.out.println("Question 3:");
		String s = "abcdef";
		String x = "d";
		String y = "m";
		System.out.println("Xâu ký tự trước khi thay:");
		System.out.println(s);
		s = s.replace(x, y);
		System.out.println("Xâu ký tự sau khi thay:");
		System.out.println(s);
		
//		Question 4:
//		Hãy nhập một xâu kí tự. In ra màn hình đảo ngược của xâu đó.
		
		System.out.println("Question 4:");
		String str = "abcdef";
		String revesestr = "";
		for(int i=str.length()-1;i>=0;i--) {
			revesestr += str.charAt(i);
		}
		System.out.println("Xâu ký tự:");
		System.out.println(str);
		System.out.println("Xâu đảo ngược:");
		System.out.println(revesestr);
		
//		Question 5:
//		Nhập xâu. Thống kê số các chữ số ‘0’, số chữ số ‘1’, …, số chữ số ‘9’
//		trong xâu
		
		
		
//		Question 6:
//		Cho một chuỗi ký tự như sau: “Java – Nơi trí tưởng tượng bay xa”.
//		Hãy chuyển chuỗi này thành một mảng, trong đó mỗi phần tử là một từ.
//		Ví dụ a[0] = Java, a[1] = Nơi, a[2] = Trí,…
//		Sau đó in kết quả ra màn hình
		
		
//		Question 7:
//		Viết chương trình kiểm tra mật khẩu người dùng khi đăng nhập.
//		Người dùng phải đăng nhập khi đến khi nào đúng username và
//		password thì thôi. (username và password được định nghĩa trước trong
//		chương trình)

		scanner.close();
	}

}
