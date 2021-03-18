package ExtraAssignment2;

import java.util.Scanner;

public class Exercise_1 {
	
	public static void question1(float a) {
		double inch = a/2.54;
		double foot = inch/12;
		System.out.println("Đổi sang inch:" + inch);
		System.out.println("Đổi sang foot:" + foot);
	}
	
	public static void question2(int second) {
		int minute=0;
		int hour=0;
		if(second>=60) {
			minute = second/60;
			second = second%60;
			if(minute>=60) {
				hour = minute/60;
				minute = minute%60;
			}
		}
		System.out.println(hour + ":" + minute + ":" + second);
	}
	
	public static void question3(int a[]) {
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(min > a[i]) {
				min = a[i];
			}
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Số nhỏ nhất là: " + min);
		System.out.println("Số lớn nhất là: " + max);
	}
	
	public static void question4(int a,int b) {
		if(a-b>0) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai");
		} else {
			System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
		}
	}
	
	public static void question5(int a,int b) {
		if(a%b==0) {
			System.out.println("a chia hết cho b");
		} else {
			System.out.println("a không chia hết cho b");
		}
	}
	
	private static void question6(float dt, float dl, float dh) {
		// TODO Auto-generated method stub
		float d = (dt*2 + dl + dh)/4;
		String hocluc = "";
		System.out.printf("Điểm trung bình: %5.1f \n", d);
		if(d >= 9) {
			hocluc = "Loại xuất sắc";
		} else if (d >= 8 && d < 9) {
			hocluc = "Loại giỏi";
		} else if (d >= 7 && d < 8) {
			hocluc = "Loại khá";
		} else if (d >= 6 && d < 7) {
			hocluc = "Loại trung bình khá";
		} else if (d >= 5 && d < 6) {
			hocluc = "Loại trung bình";
		}
		System.out.println("Học lực: " + hocluc);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner btScanner = new Scanner(System.in);
		/*
		 * System.out.print("cm:"); double a = btScanner.nextFloat(); question1(a);
		 */
		/*
		 * System.out.print("second:"); int second = btScanner.nextInt(); question2(second);
		 */
		/*
		 * int day[] = new int[4]; System.out.println("Nhập các phần tử cho dãy: ");
		 * for(int i = 0; i < day.length; i++) { 
		 * 		System.out.print("Nhập phần tử thứ " +(i+1) + ": "); 
		 * 		day[i] = btScanner.nextInt(); 
		 * } 
		 * question3(day);
		 */
		/*
		 * System.out.print("a: "); int soThuNhat = btScanner.nextInt();
		 * System.out.print("b: "); int soThuHai = btScanner.nextInt();
		 * question4(soThuNhat,soThuHai);
		 */
		/*
		 * System.out.print("a: "); int soa = btScanner.nextInt();
		 * System.out.print("b: "); int sob = btScanner.nextInt(); question5(soa,sob);
		 */
		System.out.print("Điểm toán: ");
		float dt = btScanner.nextFloat();
		System.out.print("Điểm lý: ");
		float dl = btScanner.nextFloat();
		System.out.print("Điểm hóa: ");
		float dh = btScanner.nextFloat();
		question6(dt,dl,dh);
	}

	
}
