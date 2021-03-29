package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {
	private Date ngayPhatHang;

	public Date getNgayPhatHang() {
		return ngayPhatHang;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ngày phát hành:");
		ngayPhatHang = new Date(scanner.next());
	}

	@Override
	public void infor() {
		// TODO Auto-generated method stub
		super.infor();
		System.out.println("Ngày phát hành:" + ngayPhatHang);
	}

}
