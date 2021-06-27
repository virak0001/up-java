package packages;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	private ArrayList<Student> students;
	private static String filename="Student.txt";
	public StudentManager() {
		setStudents(new ArrayList<Student>());
	}
	
	public void printStudent(ArrayList<Student> students) {
		for(Student s: students) {
			System.out.println(s);
		}
	}
	public ArrayList<Student> readFile() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream=new FileInputStream(filename);
		@SuppressWarnings("resource")
		ObjectInputStream objInputStream=new ObjectInputStream(fileInputStream);
		@SuppressWarnings("unchecked")
		ArrayList<Student> stus=(ArrayList<Student>) objInputStream.readObject();
		
		return stus;
		
	}
	
	public ArrayList<Student> findOne() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream=new FileInputStream(filename);
		@SuppressWarnings("resource")
		ObjectInputStream objInputStream=new ObjectInputStream(fileInputStream);
		@SuppressWarnings("unchecked")
		ArrayList<Student> students=(ArrayList<Student>) objInputStream.readObject();
		ArrayList<Student> student =new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		System.out.println("Input student ID: ");
		int id = input.nextInt();
		for (Student item : students) { 	
			if(item.getRoll_number() == id) {
				student.add(item);
				return student;
			}
	    }
		return student;
	}
	
	public void deleteOne() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream=new FileInputStream(filename);
		@SuppressWarnings("resource")
		ObjectInputStream objInputStream=new ObjectInputStream(fileInputStream);
		@SuppressWarnings("unchecked")
		ArrayList<Student> students=(ArrayList<Student>) objInputStream.readObject();
		Scanner input = new Scanner(System.in);
		ArrayList<Student> student=new ArrayList<Student>();
		System.out.println("Input student ID: ");
		int id = input.nextInt();
		for (Student item : students) { 	
			if(item.getRoll_number() == id) {
				continue;
			}
			Student stu=new Student(item.getRoll_number(),item.getName());
			student.add(stu);
			FileUtil.openOutputObject(filename);
			FileUtil.writeObject(student);
			FileUtil.closeOutputObject();
	    }
	}
	
	public void updateOne() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream=new FileInputStream(filename);
		@SuppressWarnings("resource")
		ObjectInputStream objInputStream=new ObjectInputStream(fileInputStream);
		@SuppressWarnings("unchecked")
		ArrayList<Student> students=(ArrayList<Student>) objInputStream.readObject();
		Scanner input = new Scanner(System.in);
		ArrayList<Student> student=new ArrayList<Student>();
		System.out.println("Input student ID: ");
		int id = input.nextInt();
		for (Student item : students) { 	
			if(item.getRoll_number() == id) {
				System.out.println("Enter new name: ");
				String name = input.nextLine();
				Student stu=new Student(item.getRoll_number(),name);
				student.add(stu);
				FileUtil.openOutputObject(filename);
				FileUtil.writeObject(student);
				FileUtil.closeOutputObject();
			} else {
				Student stu=new Student(item.getRoll_number(),item.getName());
				student.add(stu);
				FileUtil.openOutputObject(filename);
				FileUtil.writeObject(student);
				FileUtil.closeOutputObject();	
			}
	    }
	}
	
	private ArrayList<Student> getStudentFromConsole() throws IOException{
		Scanner input=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Student> students=new ArrayList<Student>();
		int option;
		do {
			System.out.println("Roll Number: ");
			int roll=input.nextInt();
			System.out.println("Name: ");
			String name=br.readLine();
			Student student=new Student(roll,name);
			students.add(student);
			System.out.println("Do you want to insert another student? (1 or 0)");
			option=input.nextInt();
			
		}while(option!=0);
		return students;
	}
	
	public void writeFile() throws IOException {
		
		
		ArrayList<Student> students=new ArrayList<Student>();
		students=getStudentFromConsole();
		
		FileUtil.openOutputObject(filename);
		FileUtil.writeObject(students);
		FileUtil.closeOutputObject();
	}
	
	public void writeTextFile() throws IOException {
		

		Scanner input=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Roll Number: ");
		int roll=input.nextInt();
		System.out.println("Name: ");
		String name=br.readLine();
		
		String message=roll + ";" + name;
		FileTextUtil.openOutputWriter(filename);
		FileTextUtil.writeMessage(message);
		FileTextUtil.closeOutputWriter();
		input.close();
		
		
	}
	
	public void readTextFile() {
		Scanner in=FileTextUtil.openScanner(filename);
		if(in==null) {
			System.out.println("no data");
			System.exit(-1);
		}
		while(in.hasNextLine()) {
			String line=in.nextLine().trim();
			String[] tokens=line.split(";");
			System.out.println("ID: " + tokens[0] + " Name: " + tokens[1]);
	
		}
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
