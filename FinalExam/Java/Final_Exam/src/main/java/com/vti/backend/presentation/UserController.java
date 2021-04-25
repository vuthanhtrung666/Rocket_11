package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.business.UserService;
import com.vti.entity.Manager;

public class UserController {
	private UserService service;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		service = new UserService();
	}
	
	public List<Manager> getListUser(int id) throws ClassNotFoundException, SQLException {
		return service.getListUser(id);
	}
	
	public boolean Login(String email, String password) throws ClassNotFoundException, SQLException {
		return service.Login(email, password);
	}
}
