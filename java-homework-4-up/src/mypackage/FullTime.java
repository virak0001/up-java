package mypackage;

public class FullTime extends HoursEmployee {

	public FullTime(String name, int hireYear, int hoursPerWeek, double hoursWage) {
		super(name, hireYear, hoursPerWeek, hoursWage);
	}

	@Override
	public String annaulPay() {
		return "Employee name " + getName() + " salary " + monthlyPay();
	}
}
