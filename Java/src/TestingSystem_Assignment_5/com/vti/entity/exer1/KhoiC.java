package TestingSystem_Assignment_5.com.vti.entity.exer1;

import java.util.Scanner;

public class KhoiC extends ThiSinh {
	private float van;
	private float su;
	private float dia;
	private Scanner sc;
	public float getVan() {
		return van;
	}
	public float getSu() {
		return su;
	}
	public float getDia() {
		return dia;
	}
	public KhoiC() {
		khoi = "C";
		cacMon = new String[3];
		cacMon[0] = "Văn";
		cacMon[1] = "Sử";
		cacMon[2] = "Địa";
		sc = new Scanner(System.in);
		input();
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Điểm môn Văn:");
		van = Float.parseFloat(sc.nextLine());
		System.out.println("Điểm môn Sử:");
		su = Float.parseFloat(sc.nextLine());
		System.out.println("Điểm môn Địa:");
		dia = Float.parseFloat(sc.nextLine());
	}
	@Override
	public void infor() {
		// TODO Auto-generated method stub
		super.infor();
		System.out.print("Các môn:");
		for (String string : cacMon) {
			System.out.print(string + " ");
		}
		System.out.println("\nĐiểm môn văn:" + van);
		System.out.println("Điểm môn sử:" + su);
		System.out.println("Điểm môn địa:" + dia);
	}
	
	
}
