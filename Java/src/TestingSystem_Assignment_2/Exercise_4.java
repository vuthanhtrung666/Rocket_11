package TestingSystem_Assignment_2;

import java.util.Random;

public class Exercise_4 {
	public static void main(String[] args) {
//		Question 1:
//		In ngẫu nhiên ra 1 số nguyên
		Random random = new Random();
		for(int i =0;i<5;i++) {
			int a = random.nextInt();
			System.out.println(a);
		}
		
//		Question 2:
//		In ngẫu nhiên ra 1 số thực
//		for(int i =0;i<5;i++) {
//			float b = random.nextFloat();
//			System.out.println(b);
//		}
		
//		Question 3:
//		Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//		ra tên của 1 bạn
		String[] names = {"name1","name2","name3","name4","name5"};
		int i = random.nextInt(names.length);
		System.out.println(names[i]);
		
//		Question 4:
//		Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
//		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
//		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
//		long randomInt = minDay + random.nextInt(maxDay - minDay);
//		LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDate);
//		Question 5:
//		Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		
//		Question 6:
//		Lấy ngẫu nhiên 1 ngày trong quá khứ
		
//		Question 7:
//		Lấy ngẫu nhiên 1 số có 3 chữ số
//		int c = random.nextInt(999-100+1)+100;
//		System.out.println(c);
	}
}
