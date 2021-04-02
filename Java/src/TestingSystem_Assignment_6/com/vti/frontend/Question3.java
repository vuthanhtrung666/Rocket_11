package TestingSystem_Assignment_6.com.vti.frontend;

public class Question3 {

	public static void main(String[] args) {
		// 
		int[] numbers= {1,2,3};
		try {
			System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 
			System.out.println("Mảng chỉ có 3 phần tử.");
		}
	}

}
