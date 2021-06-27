package mypackage;

public class PartTime extends HoursEmployee {

	public PartTime(String name, int hireYear, int hoursPerWeek, double hoursWage) {
		super(name, hireYear, hoursPerWeek, hoursWage);
	}
	
	@Override
	public String annaulPay() {
		return "Employee name " + getName() + " salary " + monthlyPay();
	}
}
