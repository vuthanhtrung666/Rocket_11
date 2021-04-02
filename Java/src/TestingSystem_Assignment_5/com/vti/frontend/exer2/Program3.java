package TestingSystem_Assignment_5.com.vti.frontend.exer2;

import TestingSystem_Assignment_5.com.vti.entity.exer2.ques3.HinhChuNhat;
import TestingSystem_Assignment_5.com.vti.entity.exer2.ques3.HinhVuong;

public class Program3 {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		float chuvihcn = hcn.tinhChuVi(2, 4);
		float dientichhcn = hcn.tinhDienTich(2, 4);
		HinhVuong hv = new HinhVuong();
		float chuvihv = hv.tinhChuVi(4);
		float dientichhv = hv.tinhDienTich(4);
		System.out.println(chuvihcn);
		System.out.println(dientichhcn);
		System.out.println(chuvihv);
		System.out.println(dientichhv);
	}
}
