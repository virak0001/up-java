package Task1;

public class SalariedEmployee {
	
	private double rate;
	
	public SalariedEmployee(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "" + rate*50*40 + "";
	}

	public double getSalary() {
		return rate;
	}

	public void setSalary(int salary) {
		this.rate = salary;
	}
}
