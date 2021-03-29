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
		name = scanner.nextLine().trim();
		System.out.println("Nhập tuổi: ");
		age = scanner.nextInt();
		System.out.println("Nhập giới tính (0:Nam, 1:Nữ, khác: Unknown): ");
		setGender(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Nhập địa chỉ: ");
		andress = scanner.nextLine().trim();
	}
	public void getInfor() {
		System.out.printf("Họ tên:%s \n",getName());
		System.out.printf("Tuổi:%d \n" , getAge());
		System.out.printf("Giới tính:%s \n",getGender());
		System.out.printf("Địa chỉ:%s \n", getAndress());
	}
	
}
