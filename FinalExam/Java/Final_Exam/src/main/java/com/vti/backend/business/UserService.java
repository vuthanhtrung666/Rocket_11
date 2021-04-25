package com.vti.backend.business;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.data.UserRepository;
import com.vti.entity.Manager;

public class UserService {
	private UserRepository repository;
	
	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		repository = new UserRepository();
	}
	
	public List<Manager> getListUser(int id) throws ClassNotFoundException, SQLException {
		return repository.getListUser(id);
	}
	
	public boolean Login(String email, String password) throws ClassNotFoundException, SQLException {
		return repository.Login(email, password);
	}
}
