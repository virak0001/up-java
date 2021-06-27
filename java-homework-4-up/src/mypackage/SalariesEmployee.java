package mypackage;

public class SalariesEmployee extends Customer {

	public SalariesEmployee(String name, int hireYear, int annualSalary) {
		super(name, hireYear);
		this.annualSalary = annualSalary;
	}

	private int annualSalary;

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
}
