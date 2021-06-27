package com.up.model;

public class Employee {
	private int id;
	private String name;
	private String department;
	private String description;
	public Employee(int id, String name, String department, String description) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.description = description;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
