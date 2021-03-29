package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private byte thangPhatHanh;

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public byte getThangPhatHanh() {
		return thangPhatHanh;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số phát hành:");
		soPhatHanh = Integer.parseInt(scanner.nextLine());
		System.out.println("Tháng phát hành:");
		thangPhatHanh = Byte.parseByte(scanner.nextLine());
	}

	@Override
	public void infor() {
		// TODO Auto-generated method stub
		super.infor();
		System.out.println("Số phát hành:" + soPhatHanh);
		System.out.println("Tháng phát hành:" + thangPhatHanh);
	}

}
