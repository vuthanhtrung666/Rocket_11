package TestingSystem_Assignment_7.com.vti.entity.exer1;

public class PrimaryStudent extends Student {

	private static int countPrimary = 0;

	public PrimaryStudent(int id, String name) throws Exception   {
		super(id, name);
		countPrimary += 1;
	}

	public static int getCountPrimary() {
		return countPrimary;
	}

}
