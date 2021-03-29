package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên tác giả:");
		tenTacGia = scanner.nextLine();
		System.out.println("Số trang:");
		soTrang = Integer.parseInt(scanner.nextLine());
	}

	@Override
	public void infor() {
		// TODO Auto-generated method stub
		super.infor();
		System.out.println("Tên tác giả:" + tenTacGia);
		System.out.println("Số trang:" + soTrang);
	}

}
