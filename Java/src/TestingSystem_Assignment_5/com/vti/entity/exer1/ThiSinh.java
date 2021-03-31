package TestingSystem_Assignment_5.com.vti.entity.exer1;

import java.util.Scanner;

public abstract class ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	protected String khoi;
	protected String[] cacMon;

	public String[] getCacMon() {
		return cacMon;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}

	public String getKhoi() {
		return khoi;
	}

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public int getMucUuTien() {
		return mucUuTien;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Số báo danh:");
		soBaoDanh = Integer.parseInt(sc.nextLine());
		System.out.print("Họ tên:");
		hoTen = sc.nextLine();
		System.out.print("Địa chỉ:");
		diaChi = sc.nextLine();
		System.out.print("Mức ưu tiên:");
		mucUuTien = Integer.parseInt(sc.next());
	}

	public void infor() {
		System.out.println("Số báo danh:" + soBaoDanh);
		System.out.println("Họ tên:" + hoTen);
		System.out.println("Địa chỉ:" + diaChi);
		System.out.println("Mức ưu tiên:" + mucUuTien);
		System.out.println("Khối:" + khoi);
	}
}
