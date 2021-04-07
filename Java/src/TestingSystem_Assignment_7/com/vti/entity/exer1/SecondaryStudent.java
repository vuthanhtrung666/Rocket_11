package TestingSystem_Assignment_7.com.vti.entity.exer1;

public class SecondaryStudent extends Student{
	private static int countSecondary = 0;

	public SecondaryStudent(int id, String name) throws Exception   {
		super(id, name);
		countSecondary += 1;
	}

	public static int getCountSecondary() {
		return countSecondary;
	}
}
