package TestingSystem_Assignment_5.com.vti.entity.exer1;

import java.util.Scanner;

public class KhoiB extends ThiSinh {
	private float sinh;
	private float toan;
	private float hoa;
	private Scanner sc;

	public float getToan() {
		return toan;
	}

	public float getHoa() {
		return hoa;
	}

	public float getSinh() {
		return sinh;
	}

	public KhoiB() {
		khoi = "B";
		cacMon = new String[3];
		cacMon[0] = "Sinh";
		cacMon[1] = "Toán";
		cacMon[2] = "Hoá";
		sc = new Scanner(System.in);
		input();
	}

	@Override
	public void input() {
		// 
		super.input();
		System.out.println("Điểm môn sinh:");
		sinh = Float.parseFloat(sc.nextLine());
		System.out.println("Điểm môn toán:");
		toan = Float.parseFloat(sc.nextLine());
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
		System.out.println("Điểm môn hóa:" + hoa);
		System.out.println("Điểm môn sinh:" + sinh);
	}

}
