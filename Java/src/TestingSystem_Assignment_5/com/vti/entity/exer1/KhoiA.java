package TestingSystem_Assignment_5.com.vti.entity.exer1;

import java.util.Scanner;

public class KhoiA extends ThiSinh {

	private float toan;
	private float ly;
	private float hoa;
	private Scanner sc;

	public KhoiA() {
		khoi = "A";
		cacMon = new String[3];
		cacMon[0] = "Toán";
		cacMon[1] = "Lý";
		cacMon[2] = "Hoá";
		sc = new Scanner(System.in);
		input();
	}

	public float getLy() {
		return ly;
	}

	public float getHoa() {
		return hoa;
	}

	public float getToan() {
		return toan;
	}

	@Override
	public void input() {
		//
		super.input();
		System.out.println("Điểm môn toán:");
		toan = Float.parseFloat(sc.nextLine());
		System.out.println("Điểm môn lý:");
		ly = Float.parseFloat(sc.nextLine());
		System.out.println("Điểm môn hóa:");
		hoa = Float.parseFloat(sc.nextLine());
	}

	@Override
	public void infor() {
		//
		super.infor();
		System.out.print("Các môn:");
		for (String string : cacMon) {
			System.out.print(string + " ");
		}
		System.out.println("\nĐiểm môn toán:" + toan);
		System.out.println("Điểm môn lý:" + ly);
		System.out.println("Điểm môn hóa:" + hoa);
	}

}
