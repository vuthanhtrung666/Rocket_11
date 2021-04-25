package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentation.UserController;
import com.vti.entity.Manager;

public class Funtion {
	private UserController controller;

	public Funtion() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		controller = new UserController();
	}

	public void getListUser(int id) throws ClassNotFoundException, SQLException {
		List<Manager> users = controller.getListUser(id);
		for(int i=0;i<users.size();i++) {
			users.get(i).display();
		}
	}
	
	public boolean Login(String email,String password) throws ClassNotFoundException, SQLException {
		if(controller.Login(email, password)) {
			System.out.println("Đăng nhập thành công.");
			return true;
		} else {
			System.out.println("Thất bại.");
			return false;
		}
	}
}
