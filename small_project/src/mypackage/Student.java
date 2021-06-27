package mypackage;
/**
 * 
 * Student class
 * 
 * @author virak.ran
 * created 25/03/2021
 *  
 *  */
public class Student implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int roll_number;
	
	public Student() {
		this("unknow", 0);
	}
	/**
	 * 
	 * @param name
	 * @param roll_number
	 *  
	 *  */
	public Student(String name, int roll_number) {
		this.name = name;
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_number() {
		return roll_number;
	}
	
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_number=" + roll_number + "]";
	}

}
