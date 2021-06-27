import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input 1st integer");
		int num1 = input.nextInt();
		System.out.println("Input 2st integer");
		int num2 = input.nextInt();
		
		System.out.printf("Sum of two integers: %d%n", num1+num2);
		System.out.printf("Product of two integers: %d%n", num1*num2);
		System.out.printf("Average of two integers: %d%n", num1+num2/2);
		System.out.printf("Distance of two integers: %d%n", Math.abs(num1-num2));
		System.out.printf("Max integer: %d%n", Math.max(num1,num2));
		System.out.printf("Min integer: %d%n", Math.min(num1,num2));
		
		input.close();
	}
}
