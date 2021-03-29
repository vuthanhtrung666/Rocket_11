package TestingSystem_Assignment_4.com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_4.com.vti.entity.Exer5.CanBo;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.CongNhan;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.KySu;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.NhanVien;

public class QLCB {
//	Question 2: Tiếp tục Question 1
//	Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực
//	hiện các chức năng sau:
//	a) Thêm mới cán bộ.
//	b) Tìm kiếm theo họ tên.
//	c) Hiện thị thông tin về danh sách các cán bộ.
//	d) Nhập vào tên của cán bộ và delete cán bộ đó
//	e) Thoát khỏi chương trình.
	private List<CanBo> canBos;
	private Scanner scanner;

	public QLCB() {
		canBos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void add() {
		System.out.print("Số cán bộ thêm:");
		int n = Integer.parseInt(scanner.nextLine());
		byte choose;
		for (int i = 0; i < n; i++) {
			System.out.println("Chọn cán bộ nhập:(1.Công nhân|2.Kỹ sư|3.Nhân viên)");
			choose = Byte.parseByte(scanner.nextLine());
			switch (choose) {
			case 1:
				CongNhan congNhan = new CongNhan();
				congNhan.input();
				canBos.add(congNhan);
				System.out.println("Thêm công nhân thành công");
				break;
			case 2:
				KySu kySu = new KySu();
				kySu.input();
				canBos.add(kySu);
				System.out.println("Thêm kỹ sư thành công");
				break;
			case 3:
				NhanVien nhanVien = new NhanVien();
				nhanVien.input();
				canBos.add(nhanVien);
				System.out.println("Thêm nhân viên thành công");
				break;
			default:
				System.out.println("Nhập sai!");
				i--;
				break;
			}
		}
	}

	public void find() {
		System.out.println("Nhập tên cần tìm:");
		String findName = scanner.nextLine();
		System.out.println(findName);
		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i).getName().equals(findName)) {
				System.out.println("Thông tin cần tìm:");
				canBos.get(i).getInfor();
				break;
			} 
		}
	}

	public void infor() {
		for (int i = 0; i < canBos.size(); i++) {
			canBos.get(i).getInfor();
		}
	}

	public void delete() {
		System.out.println("Nhập tên cần xoá:");
		String findName = scanner.nextLine().trim();
		boolean a = canBos.removeIf(canBo -> findName.equals(canBo.getName()));
		if (a) {
			System.out.println("Xóa thành công.");
		} else {
			System.out.println("Xoá thất bại.");
		}
	}

}
