package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private byte tier;

	public byte getTier() {
		return tier;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập bậc của công nhân:");
		tier = Byte.parseByte(scanner.nextLine());
	}

	@Override
	public void getInfor() {
		// TODO Auto-generated method stub
		super.getInfor();
		System.out.printf("Bậc:%d\n" , tier);
	}
	
}
