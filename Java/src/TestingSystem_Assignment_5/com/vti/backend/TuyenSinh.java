package TestingSystem_Assignment_5.com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_5.com.vti.entity.exer1.KhoiA;
import TestingSystem_Assignment_5.com.vti.entity.exer1.KhoiB;
import TestingSystem_Assignment_5.com.vti.entity.exer1.KhoiC;
import TestingSystem_Assignment_5.com.vti.entity.exer1.ThiSinh;

public class TuyenSinh implements ITuyenSinh {
	private List<ThiSinh> thiSinhs;
	private Scanner sc;
	private ThiSinh thisinh;

	public TuyenSinh() {
		thiSinhs = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	@Override
	public void themThiSinh() {
		//
		System.out.print("Số thí sinh thêm:");
		int n = Integer.parseInt(sc.next());
		byte choose;
		for (int i = 0; i < n; i++) {
			System.out.println("Chọn thí sinh khối:(1.A|2.B|3.C)");
			choose = Byte.parseByte(sc.next());
			switch (choose) {
			case 1:
				thisinh = new KhoiA();
				System.out.println("Thêm thí sinh khối A thành công");
				break;
			case 2:
				thisinh = new KhoiB();
				System.out.println("Thêm thí sinh khối B thành công");
				break;
			case 3:
				thisinh = new KhoiC();
				System.out.println("Thêm thí sinh khối C thành công");
				break;
			default:
				System.out.println("Nhập sai!");
				i--;
				break;
			}
			thiSinhs.add(thisinh);
		}
	}

	@Override
	public void hienThiSinh() {
		// 
		for (ThiSinh thiSinh : thiSinhs) {
			thiSinh.infor();
		}
	}

	@Override
	public void timTheoSBD() {
		// 
		System.out.print("SBD của thí sinh cần tìm:");
		int sbd = Integer.parseInt(sc.next());
		for (int i = 0; i < thiSinhs.size(); i++) {
			if (thiSinhs.get(i).getSoBaoDanh()==sbd) {
				System.out.println("Thông tin cần tìm:");
				thiSinhs.get(i).infor();
				break;
			} else {
				System.out.println("Không tìm thấy dữ liệu");
			}
		}
	}

}
