package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.Basic;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Basic basic = new Basic();
		basic.connect();
		basic.readPosition();
//		basic.createPosition("DEV");
//		basic.updatePosition(2, "DEV");
		basic.close();
	}

}
