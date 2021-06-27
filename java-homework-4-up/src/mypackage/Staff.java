package mypackage;

public class Staff extends SalariesEmployee {

	public Staff(String name, int hireYear, int annualSalary) {
		super(name, hireYear, annualSalary);
	}
	
	@Override
	public String annaulPay() {
		return "Staff name " + getName() + " annaul pay " + getAnnualSalary();
	}
}
