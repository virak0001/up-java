package com.up.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.up.dao.EmployeeDAO;
import com.up.dao.EmployeeDAOImp;
import com.up.model.Employee;
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;
	EmployeeDAO employeeDAO = null;
	
	public EmployeeController() {
		employeeDAO = new EmployeeDAOImp();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action == null) {
			action = "LIST";
		}
		switch (action) {
			case "LIST":
				listEmployee(request, respone);
				break;
			case "EDIT":
				getSingleEmployee(request, respone);
				break;
			default: 
				listEmployee(request, respone);
				break;
		}
	}
	private void getSingleEmployee(HttpServletRequest request, HttpServletResponse respone) {
		// TODO Auto-generated method stub
		
	}

	private void listEmployee(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		EmployeeDAOImp employee = new EmployeeDAOImp();
		List<Employee> theList = employee.get();
		request.setAttribute("list", theList);
		dispatcher = request.getRequestDispatcher("/views/employee/index.jsp");
		dispatcher.forward(request, respone);
	}
}

