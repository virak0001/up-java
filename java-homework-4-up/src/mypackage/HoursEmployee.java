package mypackage;

public class HoursEmployee extends Customer {
	private int hoursPerWeek;
	private double hoursWage;

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public HoursEmployee(String name, int hireYear, int hoursPerWeek, double hoursWage) {
		super(name, hireYear);
		this.hoursPerWeek = hoursPerWeek;
		this.setHoursWage(hoursWage);
	}

	@Override
	public String monthlyPay() {
		var result = getHoursPerWeek() * getHoursPerWeek() * 4;
		return String.valueOf(result);
	}

	public double getHoursWage() {
		return hoursWage;
	}

	public void setHoursWage(double hoursWage) {
		this.hoursWage = hoursWage;
	}
}	
