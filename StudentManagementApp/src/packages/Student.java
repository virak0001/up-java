package packages;

import java.io.Serializable;

/**
 * Student Class
 * 
 * @author Virak.Ran
 * Created: 4/3/2021
 * Modified: 4/03/2021
 */
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int roll_number;
	private String name;
	public Student() {
		this(0,"Unknown");
	}
	/**
	 * 
	 * @param int roll_number
	 * @param String name
	 * @param name
	 */
	public Student(int roll_number, String name) {
		super();
		this.roll_number = roll_number;
		this.name = name;
	}
	/**
	 * 
	 * @return roll number
	 */
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	/**
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return Information of student
	 */
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + "]";
	}	
}
