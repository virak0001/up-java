import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		int firstNumber;
		int secondNumber;
		do {
			showMenu();
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			System.out.print("Enter a number1: ");
			firstNumber = input.nextInt();
			System.out.print("Enter a number2: ");
			secondNumber = input.nextInt();
			System.out.println("The result is: "+showData(choice, firstNumber, secondNumber));
			System.out.print("Do you want to perform another operation: ");
			String performOperation = input.next();
			if (performOperation.equals("y")) {
			} else if (performOperation.equals("n")) {
				System.out.println("End performent");
			    break;
			}
		}while(choice !=6);
		input.close();
	}
	
	public static void showMenu() {
		System.out.println("MENU");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		System.out.println("5: Modulus");
		System.out.println("6: Exit");
	}
	
	public static int showData(int choice, int firstNumber, int secondNumber) {
		int result = 0;
		switch(choice) {
		case 1: 
			result =add(firstNumber, secondNumber);
			break;
		case 2:
			result = substract(firstNumber,  secondNumber);
			break;
		case 3:
			result = multitple( firstNumber, secondNumber);
			break;
		case 4:
			result= divide(firstNumber, secondNumber);
			break;
		case 5: 
			result = mudulus(firstNumber,secondNumber);
			break;
		}
		return result;	
	}
	
	public static int add(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}
	
	public static int substract(int firstNumber, int secondNumber) {
		return firstNumber-secondNumber;
	}
	
	public static int multitple(int firstNumber, int secondNumber) {
		return firstNumber*secondNumber;
	}
	public static int divide(int firstNumber, int secondNumber) {
		return firstNumber/secondNumber;
	}
	public static int mudulus(int firstNumber, int secondNumber) {
		return firstNumber%secondNumber;
	}
}
