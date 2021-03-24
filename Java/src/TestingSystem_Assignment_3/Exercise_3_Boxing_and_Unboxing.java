package TestingSystem_Assignment_3;

public class Exercise_3_Boxing_and_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question 1:
//		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//		float có 2 số sau dấu thập phân)
		int a = 5000;
		question1(a);
//		Question 2:
//		Khai báo 1 String có value = "1234567"
//		Hãy convert String đó ra số int
		String number = "1234567";
		question2(number);
//		Question 3:
//		Khởi tạo 1 số Integer có value là chữ "1234567"
//		Sau đó convert số trên thành datatype int
		Integer d = 1234567;
		question3(d);
	}

	private static void question3(Integer d) {
		// TODO Auto-generated method stub
		int number1 = d.intValue();
		System.out.printf("question3:%d",number1);
	}

	private static void question2(String number) {
		// TODO Auto-generated method stub
		int c = Integer.parseInt(number);
		System.out.printf("question2:%d\n", c);
	}

	private static void question1(int a) {
		// TODO Auto-generated method stub
		float b = (float) a;
		System.out.printf("question1:%1.2f\n",b);
	}

}
