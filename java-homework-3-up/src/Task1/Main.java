package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		final String enterName = "Please enter name of employee: ";
		final String enterHoursRate = "Please enter hours rate of ";
		Scanner input = new Scanner(System.in);
		System.out.print("How many employee?: ");
		int numberOfEmployee = input.nextInt();
		Employee getNumberOfEmplyee = new Employee(numberOfEmployee);
		String name = null;
		SalariedEmployee salaryRate = null;
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		int	 i = 0;
		while(i  < getNumberOfEmplyee.getNumberOfEmployee()) {
			System.out.print(enterName);
			name = input.next();
			System.out.print(enterHoursRate + name + " :");
			double rate = input.nextDouble();
			salaryRate = new SalariedEmployee(rate);
			Employee employee = new Employee(name, salaryRate);
			employeeList.add(employee);
			i++;
		}
		
		for (Employee i1 : employeeList) {
		    System.out.println(i1.getName()+"'s annual salary is $" + i1.getSalariedEmployee().toString());
		 }	
		input.close();
	}
}
