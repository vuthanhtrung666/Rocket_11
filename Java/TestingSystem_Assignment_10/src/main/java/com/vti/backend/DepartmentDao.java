package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;

public class DepartmentDao {
	private List<Department> departments;
	private Properties properties;
	private Connection connection;

	public DepartmentDao() throws FileNotFoundException, IOException {
		departments = new ArrayList<>();
		properties = new Properties();
		properties.load(new FileInputStream("src\\main\\resource\\database.properties"));
	}

	public void close() throws Exception {
		connection.close();
	}

	public void connect() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		Class.forName(properties.getProperty("driver"));

		connection = DriverManager.getConnection(url, username, password);

//		System.out.println("Connect success!");
	}

	public List<Department> getDepartments() throws Exception {
		connect();
		Statement statement = connection.createStatement();

		String select = "SELECT * FROM testingsystem.department";

		ResultSet rSet = statement.executeQuery(select);
		while (rSet.next()) {
			Department department = new Department();
			department.setId(rSet.getInt("DepartmentId"));
			department.setName(rSet.getString("DepartmentName"));
			departments.add(department);
		}
		close();
		return departments;
	}

	public List<Department> getDepartmentsById(int id) throws Exception {
		connect();
		String select = "SELECT * FROM testingsystem.department WHERE DepartmentID = ? ";
		PreparedStatement statement = connection.prepareStatement(select);
		statement.setInt(1, id);
		ResultSet rSet = statement.executeQuery();
		if (rSet.next()) {
			Department department = new Department();
			department.setId(rSet.getInt("DepartmentId"));
			department.setName(rSet.getString("DepartmentName"));
			departments.add(department);
			close();
			return departments;
		} else {
			throw new Exception("Cannot find department which has id =" + id);
		}
	}

	public boolean isDepartmentNameExists(String name) throws Exception {
		connect();
		String sql = "SELECT 1 FROM Department WHERE DepartmentName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, name);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			close();
			return true;

		} else {
			close();
			return false;
		}
	}
	
	public boolean isDepartmentIdExists(int id) throws Exception {
		connect();
		String sql = "SELECT 1 FROM Department WHERE DepartmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			close();
			return true;

		} else {
			close();
			return false;
		}
	}
	
	public void createDepartment (String name) throws Exception, SQLException {
		connect();
		boolean isExist = isDepartmentNameExists(name);
		if(isExist) {
			throw new Exception("Department Name is Exists!");
		} else {
			String insert = "INSERT INTO Position (DepartmentName) VALUES (?)";
			PreparedStatement statement = connection.prepareStatement(insert);
			statement.setString(1, name);
			int a = 0;
			try {
				a = statement.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
			}
			close();
			if (a == 1) {
				System.out.println("Insert success!");
			} else {
				System.out.println("Insert fail!");
			}
		}
	}
	
	public void updateDepartmentName(int id,String newName) throws Exception {
		
		boolean isExistId = isDepartmentIdExists(id);
		if(!isExistId) {
			throw new Exception("Cannot find department which has id =" + id);
		} 
		boolean isExistName = isDepartmentNameExists(newName);
		if(isExistName) {
			throw new Exception("Department Name is Exists!");
		}
		if(isExistId && !isExistName) {
			connect();
			String update = "UPDATE department SET DepartmentName = ? WHERE DepartmentID = ?";
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1,newName);
			statement.setInt(2, id);
			int a = 0;
			try {
				a = statement.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
			}
			close();
			if (a == 1) {
				System.out.println("Update success!");
			} else {
				System.out.println("Update fail!");
			}
		}
	}
	
	public void deleteDepartment(int id) throws Exception {
		boolean isExistId = isDepartmentIdExists(id);
		if(!isExistId) {
			throw new Exception("Cannot find department which has id =" + id);
		} else {
			connect();
			String delete = "DELETE FROM department WHERE DepartmentID = ?";
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setInt(1,id);
			int a = 0;
			try {
				a = statement.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
			}
			close();
			if (a == 1) {
				System.out.println("Delete success!");
			} else {
				System.out.println("Delete fail!");
			}
		}
	}
}
