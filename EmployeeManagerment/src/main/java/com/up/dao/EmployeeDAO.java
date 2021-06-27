package com.up.dao;
import java.util.List;
import com.up.model.Employee;
public interface EmployeeDAO {
	List<Employee> get();
	Employee get(int id);
	boolean save(Employee employee);
	boolean delete(int id);
	boolean update(Employee employee);
}
