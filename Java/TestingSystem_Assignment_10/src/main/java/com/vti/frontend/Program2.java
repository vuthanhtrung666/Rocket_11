package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

public class Program2 {

	public static void main(String[] args) throws Exception {
//		question1();
//		question2();
//		question4();
//		question5();
//		question6();
//		question7();
	}

	private static void question7() throws Exception {
		System.out.print("Nhap id can xoa:");
		int a = ScannerUtils.inputInt("id la 1 so int");
		DepartmentDao dao = new DepartmentDao();
		dao.deleteDepartment(a);
	}

	private static void question6() throws Exception {
		System.out.print("Nhap Id can sua:");
		int id = ScannerUtils.inputInt("nhap 1 so");
		System.out.print("Nhap name sua:");
		String name = ScannerUtils.inputString("Khong de trong");
		DepartmentDao dao = new DepartmentDao();
		dao.updateDepartmentName(id, name);
	}

	private static void question5() throws SQLException, Exception {
		System.out.print("Nhap DepartmentName them:");
		String name = ScannerUtils.inputString("Khong de trong");
		DepartmentDao dao = new DepartmentDao();
		dao.createDepartment(name);
	}

	private static void question4() throws FileNotFoundException, IOException, Exception {
		System.out.print("Nhap DepartmentName can tim:");
		String name = ScannerUtils.inputString("Khong de trong");
		boolean isExist = new DepartmentDao().isDepartmentNameExists(name);
		if(isExist) {
			System.out.println("Department name co ton tai");
		} else {
			System.out.println("Department name khong ton tai");
		}
	}

	private static void question2() throws Exception {
		System.out.print("Nhap id can tim:");
		int a = ScannerUtils.inputInt("id la 1 so int");
		List<Department> departments = new DepartmentDao().getDepartmentsById(a);
		for (Department department : departments) {
			System.out.println(department);
		}
	}

	private static void question1() throws Exception {
		List<Department> departments = new DepartmentDao().getDepartments();
		for (Department department : departments) {
			System.out.println(department);
		}
	}
	
}
