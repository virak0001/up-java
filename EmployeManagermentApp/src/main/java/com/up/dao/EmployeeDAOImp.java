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

public class EmployeeDAOImp implements EmployeeDAO {
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
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
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("NAME"));
				employee.setDepartment(resultSet.getString("department"));
				employee.setDescription(resultSet.getString("description"));
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee get(int id) {
		Employee employee = null;
		try {
			employee = new Employee();
			String sql = "SELECT * FROM employee where id="+id;
			connection = DBConnectionUtil.openConection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setDepartment(resultSet.getString("department"));
				employee.setDescription(resultSet.getString("description"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	@Override
	public boolean save(Employee employee) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO employee(name, department, description)VALUES"
					+ "('"+employee.getName()+"', '"+employee.getDepartment()+"', '"+employee.getDescription()+"')";
			connection = DBConnectionUtil.openConection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(int id) {
		boolean flag = false;
		try {
			String sql = "DELETE FROM employee where id="+id;
			connection = DBConnectionUtil.openConection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Employee employee) {
		boolean flag = false;
		try {
			String sql = "UPDATE employee SET name = '"+employee.getName()+"', "
					+ "department = '"+employee.getDepartment()+"', description = '"+employee.getDescription()+"' where id="+employee.getId();
			connection = DBConnectionUtil.openConection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
