package com.up.connection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String USERNAME = "root";
	
	private static final String PASSWORD = "";
	
	private static Connection connection = null;
	
	public static Connection openConection() {
		if(connection != null) {
			return connection;
		} else {
			try {
				Class.forName(DRIVER);
				connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch ( ClassNotFoundException e ) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}
