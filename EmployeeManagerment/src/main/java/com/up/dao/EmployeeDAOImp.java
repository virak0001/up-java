package com.up.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.up.connection.util.DBConnectionUtil;
import com.up.model.Employee;

import connectionDB.ConnectionUtils;

public class EmployeeDAOImp implements EmployeeDAO {
	Connection connection = null;
	ResultSet resultset = null;
	Statement statement = null;
	PreparedStatement prepareStatement = null;
	
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		List<Employee> list = null;
		Employee employee = null;
		try {
			list = new ArrayList<Employee>();
			String sql = "SELECT * FROM employee";
			connection = DBConnectionUtil.openConection();
			statement = connection.createStatement();
			resultset = statement.executeQuery(sql);
			System.out.print(resultset);
			while (resultset.next()) {
				System.out.print(resultset.getInt("id"));
				employee = new Employee();
				employee.setId(resultset.getInt("id"));
				employee.setName(resultset.getString("name"));
				employee.setName(resultset.getString("department"));
				employee.setName(resultset.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Employee employee) {
		boolean insert = false;
		String sql = "INSERT INTO emloyee(name, department, description) VALUES(?,?,?)";
		try {
			connection = ConnectionUtils.getSQLConnection();
			statement = ((Connection) statement).createStatement();
			resultset = statement.executeQuery(sql);
			insert = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insert;
	}

	@Override
	public boolean delete(int id) {
		boolean delete = false;
		try {
			String sql = "DELETE FROM employee where id="+id;
			connection = (Connection) DBConnectionUtil.openConection();
			statement = ((Connection) statement).createStatement();
			resultset = statement.executeQuery(sql);
			delete = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return delete;
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
