package com.up.connection.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class DBConnectionUtil {
	private static final String URL = "jdbc:mysql://localhost3306/employee_managerment";
	
	private static final String DIRVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String USER_NAME = "root";
	
	private static final String PASSWORD = "";
	
	private static Connection connection = null;
	
	public static Connection openConection() {
		if(connection != null) {
			return connection;
		} else {
			try {
				Class.forName(DIRVER);
				connection = (Connection) DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			} catch ( ClassNotFoundException e ) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}
