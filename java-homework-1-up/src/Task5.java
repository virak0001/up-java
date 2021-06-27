import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input distance in metters:");
		float distance = input.nextInt();
		System.out.print("Input hours:");
		float hours = input.nextInt();
		System.out.print("Input minutes:");
		float minutes = input.nextInt();	
		System.out.print("Input seconds:");
		float seconds = input.nextInt();
		
		float convertTimeToSeconds = ((hours*3600)+(minutes*60)+seconds);
		
		System.out.println("Speed in metters per seconds: " + distance/convertTimeToSeconds + "m/s");
		System.out.println("Speed kilometters per hours: "+ (distance/1000)/(convertTimeToSeconds/3600) + "km/h");
		System.out.println("Speed miles per hours: "+ (distance/1609)/(convertTimeToSeconds/3600) + "miles/h");
		input.close();

	}

}
