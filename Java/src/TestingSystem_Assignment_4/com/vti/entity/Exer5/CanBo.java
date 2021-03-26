package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class CanBo {
//	Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//	Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ,
//	khác), địa chỉ.
	private String name;
	private int age;
	private Gender gender;
	private String andress;
	public Gender getGender() {
		return gender;
	}
	public void setGender(int a) {
		if(a == 0) {
			this.gender = Gender.MALE;
		} else if (a == 1) {
			this.gender = Gender.FEMALE;
		} else {
			this.gender = Gender.UNKNOWN;
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAndress() {
		return andress;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		name = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		age = scanner.nextByte();
		System.out.println("Nhập giới tính (0:Nam, 1:Nữ, khác: Unknown): ");
		setGender(scanner.nextInt());
		System.out.println("Nhập địa chỉ: ");
		andress = scanner.nextLine();
	}
	public void getInfor() {
		System.out.println("Họ tên      : " + name);
		System.out.println("Tuổi        : " + age);
		System.out.println("Giới tính   : " + gender);
		System.out.println("Địa chỉ     : " + andress);
	}
	@Override
	public String toString() {
		return "\nCanBo \n[name=" + name + ", age=" + age + ", gender=" + gender + ", andress=" + andress + "]";
	}
	
	
}
