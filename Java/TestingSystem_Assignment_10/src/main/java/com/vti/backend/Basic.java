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
import java.util.Properties;

public class Basic {
	private Properties properties;
	Connection connection;

	public Basic() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream("src\\main\\resource\\database.properties"));
	}

	public void connect() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		Class.forName(properties.getProperty("driver"));

		connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect success!");
	}

	public void readPosition() throws SQLException {
		Statement statement = connection.createStatement();

		String select = "SELECT * FROM testingsystem.position";

		ResultSet rSet = statement.executeQuery(select);
		while (rSet.next()) {
			System.out.println(rSet.getInt("PositionId") + " " + rSet.getString("PositionName"));
		}
	}

	public void createPosition(String PositionName) throws SQLException {
		String insert = "INSERT INTO Position	(PositionName	) " + "VALUES 					(?			)";
		PreparedStatement statement = connection.prepareStatement(insert);
		statement.setString(1, PositionName);
		int a = 0;
		try {
			a = statement.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		}

		if (a == 1) {
			System.out.println("Insert success!");
		} else {
			System.out.println("Insert fail!");
		}
	}

	public void updatePosition(int PositionId, String PositionName) throws SQLException {
		String update = "update position set PositionName = ? where PositionID = ?";
		PreparedStatement statement = connection.prepareStatement(update);
		statement.setString(1, PositionName);
		statement.setInt(2, PositionId);
		int a = 0;
		try {
			a = statement.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		}

		if (a == 1) {
			System.out.println("Update success!");
		} else {
			System.out.println("Update fail!");
		}
	}

	public void deletePosition(int PositionId) throws SQLException {
		String delete = "delete from position where PositionID = ?";
		PreparedStatement statement = connection.prepareStatement(delete);
		statement.setInt(1, PositionId);
		int a = 0;
		try {
			a = statement.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		}

		if (a == 1) {
			System.out.println("Delete success!");
		} else {
			System.out.println("Delete fail!");
		}
	}
	
	public void close() throws SQLException {
		connection.close();
		System.out.println("Connect close!");
	}
}
