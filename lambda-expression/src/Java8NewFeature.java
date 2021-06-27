import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Dog {
	public void eat();
}
@FunctionalInterface
interface StringLambda {
	public int getLength(String str);
}
@FunctionalInterface
interface Add {
	int addition(int a, int b);
}
@FunctionalInterface
// Method reference
interface Person {
	void walk();
}
public class Java8NewFeature {
	public static void personWalkKing() {
		System.out.println("Walking");
	}
	public static void main(String[] args) {
		Dog dog = () -> {
			System.out.println("Eat");
		};
		dog.eat();
		
		StringLambda stringLength = (String str) ->str.length();
		int lenth = stringLength.getLength("Hello");
		System.out.println(lenth);
		
		Add add = (int a, int b) -> (a+b);
		int sum = add.addition(10, 20);
		System.out.println(sum);
		
		// Call method reference
		Person person  = Java8NewFeature::personWalkKing;
		person.walk();
		
		List<String> nameList = Arrays.asList("Dara", "Lina");
		// Stream API
		Stream<String> stream = nameList.stream();
		stream = stream.filter(name-> name.startsWith("D"));
		List<String> filterdName = stream.collect(Collectors.toList());
		filterdName.forEach(System.out::println);
		
		List<Employee> employeeList = Arrays.asList(new Employee(11, "virak", 20), new Employee(12, "Dara", 20));
		Optional<Employee> employee = Optional.of((Employee) employeeList.stream()
				.filter(e -> "Dara".equals(e.getName()) && e.getAge() ==30)
				.findAny()
				.orElse(null));
		if(employee.equals(null)) {
			System.out.println("Employee not found");
		} else {
			System.out.println(employee);
		}
		if(employee.isPresent()) {
			employee.ifPresent(e->System.out.print(e));
		}
		
	}
}
