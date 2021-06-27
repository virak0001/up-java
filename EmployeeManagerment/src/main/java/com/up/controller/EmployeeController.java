package com.up.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.up.dao.EmployeeDAOImp;
import com.up.model.Employee;
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;
	EmployeeDAOImp employeeDAO = null;
	
	public EmployeeController() {
		employeeDAO = new EmployeeDAOImp();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action == null) {
			action = "LIST";
		}
		switch (action) {
			case "LIST":
				listEmployee(request, response);
				break;
			case "EDIT":
				getSingleEmployee(request, response);
				break;
			case "delete":
				deleteEmployee(request,response);
				break;
			default: 
				listEmployee(request, response);
				break;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    response.setContentType("text/html");
	    RequestDispatcher rd=request.getRequestDispatcher("LoadServlet");  
	    rd.forward(request, response);

	}

	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> theList = employeeDAO.get();
		request.setAttribute("list", theList);
		dispatcher = request.getRequestDispatcher("/views/employee/employee_list.jsp");
		dispatcher.forward(request, response);
	}
	
	private void getSingleEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Employee employee = employeeDAO.get(Integer.parseInt(id));
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee_list.jsp");
		dispatcher.forward(request,response);
	}
	
	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		if(employeeDAO.delete(Integer.parseInt(id))) {
			request.setAttribute("NOTIVICATION", "Employee delete successfully");
		}
		listEmployee(request,response);
	}
}

