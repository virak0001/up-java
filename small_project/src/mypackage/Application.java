package mypackage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a choice: ");
		System.out.println("1: Insert new student: ");
		System.out.println("2: Update the student: ");
		System.out.println("3: Delete a student: ");
		System.out.println("4: View a student: ");
		System.out.println("5: View all students: ");
		System.out.println("0: Exit. ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
		case 1: 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Inser a new student");
			int roll = input.nextInt();
			System.out.println("Name: ");
			String name = br.readLine();
			Student student = new Student(name, roll);
			ArrayList<Student> students = new ArrayList<Student>();
			System.out.println(student);
			FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
			objOutputStream.writeObject(student);
			fileOutputStream.close();
			objOutputStream.close();
			break;
		case 2: 
			System.out.println("Update the student");
			break;
		case 3: 
			System.out.println("Delete a student");
			break;
		case 4: 
			System.out.println("View a student");
			break;
		case 5:
			System.out.println("View all student");
			FileInputStream FileInputStream = new FileInputStream("Student.txt");
			ObjectInputStream objInputStream = new ObjectInputStream(FileInputStream);
			break;
		default: 
			System.out.println("Invalid input");
		}
		input.close();
	}

}
