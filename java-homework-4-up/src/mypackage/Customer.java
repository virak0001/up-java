package mypackage;

public class Customer {
	private String name;
	private int hireYear;
	
	public Customer(String name, int hireYear) {
		this.name = name;
		this.hireYear = hireYear;
	}
	
	public String monthlyPay() {
		return null;
	}
	
	public String annaulPay() {
		return null;
	}
	
	public int getHireYear() {
		return hireYear;
	}
	
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
