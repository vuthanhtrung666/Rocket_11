package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String work;

	public String getWork() {
		return work;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Công việc:");
		work = scanner.nextLine().trim();
	}

	@Override
	public void getInfor() {
		// TODO Auto-generated method stub
		super.getInfor();
		System.out.printf("Công việc:%s\n", work);
	}
	
}
