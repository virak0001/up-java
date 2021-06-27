package mypackage;

public class Manager extends SalariesEmployee {

	public Manager(String name, int hireYear, int annualSalary) {
		super(name, hireYear, annualSalary);
	}
	
	@Override
	public String annaulPay() {
		return "Manager name " + getName() + " annaul pay " + getAnnualSalary();
	}
}
