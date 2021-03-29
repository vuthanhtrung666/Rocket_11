package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class TaiLieu {
	private int maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mã tài liệu:");
		maTaiLieu = Integer.parseInt(scanner.nextLine());
		System.out.println("Tên nhà xuất bản: ");
		tenNXB = scanner.nextLine();
		System.out.println("Số bản phát hành:");
		soBanPhatHanh = Integer.parseInt(scanner.nextLine());
	}

	public void infor() {
		System.out.println("Mã tài liệu:" + maTaiLieu);
		System.out.println("Tên nhà xuất bản:" + tenNXB);
		System.out.println("Số bản phát hành:" + soBanPhatHanh);
	}
}
