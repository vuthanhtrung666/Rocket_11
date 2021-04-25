package com.vti.backend.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.utils.JDBCUtils;

public class UserRepository {
	private JDBCUtils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JDBCUtils();
	}

	public List<Manager> getListUser(int id) throws SQLException, ClassNotFoundException {
		List<Manager> users = new ArrayList<>();

		// get connect
		connection = jdbcUltils.getConnection();

		// Step 4: Execute query
		String manager = "SELECT manager.* FROM manager inner join project on manager.ManagerID = project.ManagerID where ProjectId=? ";
		PreparedStatement preparedStatement = connection.prepareStatement(manager);
		preparedStatement.setInt(1, id);
		ResultSet resultSet1 = preparedStatement.executeQuery();

		// Step 5: Handling result set
		while (resultSet1.next()) {
			int Id = resultSet1.getInt("ManagerID");
			String fullName = resultSet1.getString("FullName");
			String email = resultSet1.getString("Email");
			String password = resultSet1.getString("Password");
			int Exp = resultSet1.getInt("ExpInYear");

			Manager user = new Manager(Id, fullName, email, password, Exp);
			users.add(user);
		}
		jdbcUltils.disconnect();
		return users;
	}
	
	public boolean Login(String email, String password ) throws ClassNotFoundException, SQLException{
		connection = jdbcUltils.getConnection();

		// Step 4: Execute query
		String manager = "SELECT 1 FROM employee where Email=? and Password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(manager);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2,password);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			jdbcUltils.disconnect();
			return true;

		} else {
			jdbcUltils.disconnect();
			return false;
		}
	}

}
