package TestingSystem_Assignment_4.com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_4.com.vti.entity.Exer5.Bao;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.Sach;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.TaiLieu;
import TestingSystem_Assignment_4.com.vti.entity.Exer5.TapChi;

public class QLTV {
	private List<TaiLieu> taiLieus;
	private Scanner scanner;

	public QLTV() {
		taiLieus = new ArrayList<TaiLieu>();
		scanner = new Scanner(System.in);
	}

	public void themTaiLieu() {
		System.out.println("Số tài liệu thêm:");
		int n = Integer.parseInt(scanner.nextLine());
		byte choose;
		for (int i = 0; i < n; i++) {
			System.out.println("Thêm tài liệu:(1.Sách|2.Tạp chí|3.Báo)");
			choose = Byte.parseByte(scanner.nextLine());
			switch (choose) {
			case 1:
				Sach sach = new Sach();
				sach.input();
				taiLieus.add(sach);
				System.out.println("Thêm sách thành công.");
				break;
			case 2:
				TapChi tapChi = new TapChi();
				tapChi.input();
				taiLieus.add(tapChi);
				System.out.println("Thêm tạp chí thành công.");
				break;
			case 3:
				Bao bao = new Bao();
				bao.input();
				taiLieus.add(bao);
				System.out.println("Thêm báo thành công.");
				break;
			default:
				System.out.println("Nhập sai!Xin nhập lại.");
				i--;
				break;
			}
		}
	}

	public void xoaTheoMa() {
		System.out.println("Mã tài liệu cần xóa:");
		int ma = Integer.parseInt(scanner.nextLine());
		boolean a = taiLieus.removeIf(tailieu -> ma == tailieu.getMaTaiLieu());
		if (a) {
			System.out.println("Xóa thành công.");
		} else {
			System.out.println("Xoá thất bại.");
		}
	}

	public void hienThi() {
		for (int i = 0; i < taiLieus.size(); i++) {
			taiLieus.get(i).infor();
		}
	}

	public void timKiemTheoLoai() {

		System.out.println("Tìm tài liệu:(1.Sách|2.Tạp chí|3.Báo)");
		byte choose = Byte.parseByte(scanner.nextLine());
		switch (choose) {
		case 1:
			System.out.println("Thông tin sách:");
			for (TaiLieu taiLieu : taiLieus) {
				if (taiLieu instanceof Sach) {
					taiLieu.infor();
				}
			}
			break;
		case 2:
			System.out.println("Thông tin tạp chí:");
			for (TaiLieu taiLieu : taiLieus) {
				if (taiLieu instanceof TapChi) {
					taiLieu.infor();
				}
			}
			break;
		case 3:
			System.out.println("Thông tin báo:");
			for (TaiLieu taiLieu : taiLieus) {
				if (taiLieu instanceof Bao) {
					taiLieu.infor();
				}
			}
			break;
		default:
			System.out.println("Nhập sai!Xin nhập lại.");
			break;
		}
	}

}
