package packages;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Application {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner input=new Scanner(System.in);
		int choice;
		StudentManager studentManager=new StudentManager();
		
		do {
			System.out.println("\nMenu ");
			System.out.println("1: Insert new student");
			System.out.println("2: Update the student");
			System.out.println("3: Delete the student");
			System.out.println("4: View a student");
			System.out.println("5: View all students");
			System.out.println("0: Exit.");
			System.out.println("\nEnter a choice (0-5): ");
			
			choice=input.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Insert new student");
					studentManager.writeFile();
					break;
				case 2:
					System.out.println("Update the student");
					studentManager.updateOne();
					System.out.println("View the student");
					ArrayList<Student> updateStudent=studentManager.readFile();
					studentManager.printStudent(updateStudent);
					break;
				case 3:
					System.out.println("Delete the student");
					studentManager.deleteOne();
					System.out.println("View the student");
					ArrayList<Student> stu=studentManager.readFile();
					studentManager.printStudent(stu);
					break;
				case 4:
					System.out.println("View the student");
					ArrayList<Student> student = studentManager.findOne();
					studentManager.printStudent(student);
					break;
				case 5:
					System.out.println("View all students");
					ArrayList<Student> students=studentManager.readFile();
					studentManager.printStudent(students);
					break;	
				default:
					System.out.println("Invalid input");
					break;
					
			}
			
		}while(choice!=0);
		System.out.println("Exit");
		
	}

}
