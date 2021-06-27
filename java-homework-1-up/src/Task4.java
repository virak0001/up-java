import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number:");
		int firstNumber = input.nextInt();
		System.out.print("Input second number:");
		int secondNumber = input.nextInt();
		System.out.print("Input operator(+,-,*,/,%): ");
		String operator = input.next();
		System.out.println(doOperation(firstNumber, secondNumber, operator));
		input.close();
	}  
	
	public static String doOperation(int firstNumber,int secondNumber,String operator) {
		var baseOutPut = firstNumber + operator + secondNumber;
		var result = "";
		switch(operator)
		{
		    case "+" :
		    {
		    	result=baseOutPut + " = " + (firstNumber + secondNumber);
		        break;
		    }
		    case "-" :
		    {
		    	result=baseOutPut + " = " + (firstNumber - secondNumber);
		        break;
		    }
		    case "*" :
		    {
		    	result=baseOutPut + " = " + (firstNumber * secondNumber);
		        break;
		    }
		    case "/" :
		    {
		    	result=baseOutPut + " = " + (firstNumber / secondNumber);
		        break;
		    }
		    default:
		    	result = "Incorrect opertion";
		    	break;
		}
		return result;
	}
}
