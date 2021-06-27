package Task1;

public class Employee {
	private String name;
	private int numberOfEmployee;
	private SalariedEmployee salariedEmployee;

	public Employee(String name, SalariedEmployee salariedEmployee) {
		this.setName(name);
		this.setSalariedEmployee(salariedEmployee);
	}
	
	public Employee(int numberOfEmployee) {
		this.setNumberOfEmployee(numberOfEmployee);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", numberOfEmployee=" + numberOfEmployee + ", salariedEmployee="
				+ salariedEmployee + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SalariedEmployee getSalariedEmployee() {
		return salariedEmployee;
	}

	public void setSalariedEmployee(SalariedEmployee salariedEmployee) {
		this.salariedEmployee = salariedEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		if(numberOfEmployee <= 0) {
			System.out.println("Number should be positive");
		} else {
			this.numberOfEmployee = numberOfEmployee;
		}
	}
}
