package TestingSystem_Assignment_3;

import java.util.Date;
import java.util.Scanner;

import TestingSystem_Assignment_1.Group;

public class Exercise_4_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap chuoi ky tu:");
//		String a = scanner.nextLine();
//		question1(a);
		
//		Question 2:
//		Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
//		System.out.println("Nhap s1:");
//		String s1 = scanner.nextLine();
//		System.out.println("Nhap s2:");
//		String s2 = scanner.nextLine();
//		question2(s1,s2);
		
//		Question 3:
//		Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//		viết hoa chữ cái đầu thì viết hoa lên
//		System.out.println("Nhap vao chuoi:");
//		String name = scanner.nextLine();
//		question3(name);
		
//		Question 4:
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//		của người dùng ra
//		VD:
//		Người dùng nhập vào "Nam", hệ thống sẽ in ra
//		"Ký tự thứ 1 là: N"
//		"Ký tự thứ 1 là: A"
//		"Ký tự thứ 1 là: M"
//		String name1 = scanner.next();
//		name1 = name1.toUpperCase();
//		question4(name1);
		
//		Question 5:
//		Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//		dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
//		question5();
		
//		Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
//		System.out.println("Nhập tên:");
//		String name = scanner.nextLine().trim();
//		question6(name);
		
//		Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "Nguyễn Văn Nam"
//		System.out.println("Nhập tên:");
//		String name1 = scanner.nextLine().trim();
//		question7(name1);
		
//		Question 8:
//		In ra tất cả các group có chứa chữ "Java"
//		question8();
		
//		Question 9:
//		In ra tất cả các group "Java"
//		question9();
		
//		Question 10 (Optional):
//		Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//		Nếu có xuất ra “OK” ngược lại “KO”.
//		Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
//		String str1 = "hello";
//		String str2 = "olleh";
//		question10(str1,str2);
		
		
//		Question 11 (Optional): Count special Character
//		Tìm số lần xuất hiện ký tự "a" trong chuỗi
//		System.out.println("Nhập chuỗi:");
//		String b = scanner.nextLine();
//		question11(b);
//		Question 12 (Optional): Reverse String
//		Đảo ngược chuỗi sử dụng vòng lặp
		
		
//		Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//		lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false
//		System.out.println("Nhập chuỗi:");
//		String c = scanner.nextLine();
//		question13(c);
		
//		Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//		cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
//		String str = "VTI Academy";
//		question14(str);
		
//		Question 15 (Optional): Revert string by word
//		Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//		thư viện.
//		Ví dụ: " I am developer " => "developer am I".
//		Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//		Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//		chuỗi theo dấu cách
//		String str;
//		System.out.println("Chuỗi: ");
//		str = scanner.nextLine();
//		question15(str);
//		Question 16 (Optional):
//		Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//		bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//		hình “KO”.
//		String str;
//		int n;
//
//		System.out.println("Chuỗi: ");
//		str = scanner.nextLine();
//
//		System.out.println("Nhập n: ");
//		n = scanner.nextInt();
//		question16(str,n);
	}

	private static void question16(String str, int n) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty() || str.length() % n != 0) {
			System.out.println("No");
			return;
		}

		for (int i = 0; i < str.length(); i += n) {
			System.out.println(str.substring(i, i + n));
		}
	}

	private static void question15(String str) {
		// TODO Auto-generated method stub
		str = str.trim();
		str = str.replaceAll("\\s+", " ");

		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

	private static void question14(String str) {
		// TODO Auto-generated method stub
		str = str.replace("e", "*");
		System.out.println(str);
	}

	private static void question13(String c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length(); i++) {
			if (checkKeyNumber(c.charAt(i))) {
				System.out.println("False");
				return;
			}

		}
		System.out.println("True");
	}
	
	public static boolean checkKeyNumber(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}

	private static void question11(String b) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<b.length();i++) {
			if('a' == b.charAt(i)) {
				count++;
			}
		}
		System.out.println("số lần xuất hiện ký tự \"a\" trong chuỗi là: "+count);
	}

	private static void question10(String str1, String str2) {
		// TODO Auto-generated method stub
		String revesestr2 = "";
		for(int i = str2.length() -1; i>=0;i--) {
			revesestr2 += str2.charAt(i);
		}
		if (revesestr2.equals(str1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static void question9() {
		// TODO Auto-generated method stub
		String[] groups = { "Java", "C#", "C++" };
		for(String name:groups) {
			if(name.equals("Java")) {
				System.out.println(name);
			}
		}
	}

	private static void question8() {
		// TODO Auto-generated method stub		
		String[] groups = {"Java with Duy Nguyễn", "Cách qua môn gia va", "Học Java có khó không?"};
		for(String name:groups) {
			if(name.contains("Java")) {
				System.out.println(name);
			}
		}
	}

	private static void question7(String name1) {
		// TODO Auto-generated method stub
		String [] partname = name1.split("\\s+");
		System.out.print("Họ tên sau khi chuẩn hóa:");
		for(int i=0;i<partname.length;i++) {
			String s3 = partname[i].substring(0, 1).toUpperCase();
			System.out.print(s3 + partname[i].substring(1) + " ");
		}
		System.out.println();
	}

	private static void question6(String name) {
		// TODO Auto-generated method stub
		String [] partname = name.split("\\s+");
		System.out.println("Họ là: " + partname[0]);
		System.out.println("Tên đệm là: "+partname[1]);
		System.out.println("Tên là: " + partname[2]);
	}

	private static void question5() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ:");
		String fisrtName = scanner.nextLine().trim();
		System.out.println("Nhập tên:");
		String lastName = scanner.nextLine().trim();
		System.out.printf("Họ và tên:%s %s\n",fisrtName,lastName);
	}

	private static void question4(String name1) {
		// TODO Auto-generated method stub
		for(int i=0;i<name1.length();i++) {
			System.out.printf("\nKý tự thứ %d là: %s",i+1,name1.charAt(i));
		}
		
	}

	private static void question3(String name) {
		// TODO Auto-generated method stub
		String s3 = name.substring(0, 1).toUpperCase();
		System.out.println(s3 + name.substring(1));
	}

	private static void question2(String s1, String s2) {
		// TODO Auto-generated method stub
		System.out.println(s1.concat(s2));
	}

	private static void question1(String a) {
		// TODO Auto-generated method stub
		String[] tu = a.split("\\s+");
		System.out.println("so luong cac tu:" + tu.length);
		
	}

}
