package practice;

public class Main {

	public static void main(String[] args) {
		
		Address address = new Address("No 435", 34, "#98");
		
		Employee employee = new Employee(0, "virak", address);

		System.out.println(employee.toString());
	}

}
