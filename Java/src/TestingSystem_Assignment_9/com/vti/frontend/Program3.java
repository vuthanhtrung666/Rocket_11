package TestingSystem_Assignment_9.com.vti.frontend;

import TestingSystem_Assignment_9.com.vti.entity.exer2.CPU;
import TestingSystem_Assignment_9.com.vti.entity.exer2.CPU.Processor;
import TestingSystem_Assignment_9.com.vti.entity.exer2.CPU.Ram;
import TestingSystem_Assignment_9.com.vti.entity.exer2.NgayThangNam;
import TestingSystem_Assignment_9.com.vti.entity.exer2.NgayThangNam.GioPhutGiay;

public class Program3 {
	public static void main(String[] args) {
		NgayThangNam date = new NgayThangNam();
		date.ngay = 31;
		date.thang = 04;
		date.nam = 2015;
		GioPhutGiay time = new NgayThangNam().new GioPhutGiay();
		time.gio = 10;
		time.phut = 24;
		time.giay = 45;
//		time.xuatThongtin();
		CPU cpu = new CPU();
		Processor processor = cpu.new Processor();
		System.out.println(processor.getCache());
		Ram ram = cpu.new Ram();
		System.out.println(ram.getClockSpeed());
	}
}
