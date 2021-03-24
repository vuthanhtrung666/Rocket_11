package TestingSystem_Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1_Datatype_Casting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Question 1:
//		Khai báo 2 số lương có kiểu dữ liệu là float.
//		Khởi tạo Lương của Account 1 là 5240.5 $
//		Khởi tạo Lương của Account 2 là 10970.055$
//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
//		float salary1 = 5240.5f;
//		float salary2 = 10970.055f;
//		System.out.printf("salary1:%1.1f and salary2:%1.3f\n",salary1,salary2 );
//		int round1 = (int) salary1;
//		int round2 = (int) salary2;
//		System.out.printf("salary1:%d and salary2:%d\n",round1,round2 );
		
//		Question 2:
//		Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//		có số 0 ở đầu cho đủ 5 chữ số)
		Random random = new Random();
		int c = random.nextInt(99999);
		System.out.println("integer:" + c);
		String format = String.format("%05d", c);
 		System.out.println(format);
//		Question 3:
//		Lấy 2 số cuối của số ở Question 2 và in ra.
//		Gợi ý:
//		Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//		Cách 2: chia lấy dư số đó cho 100
		
//		Question 4:
//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
//		System.out.println("so a:");
//		int a = scanner.nextInt();
//		System.out.println("so b:");
//		int b = scanner.nextInt();
//		question4(a,b);
	}

	private static void question4(int a, int b) {
		// TODO Auto-generated method stub
		int kq;
		kq = a/b;
		System.out.printf("Thương của %d và %d là %d",a,b,kq);
	}
}
