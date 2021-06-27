import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sumTotal = 0;
		System.out.print("Input number of terms is: ");
		int userInput = input.nextInt();
		int i = 1;
		int countOld = 0;
		System.out.println("The odd numbers are :");
		do {
			if(i % 2 == 1) {
				System.out.println(i);
				sumTotal += i;
				countOld++;
			}
			i++;
		}
		while(countOld < userInput);
		System.out.println("The Sum of odd Natural Number upto" + userInput + "terms is: "+ sumTotal);
		input.close();
	}

}
