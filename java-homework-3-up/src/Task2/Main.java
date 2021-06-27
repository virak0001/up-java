package Task2;

public class Main {

	public static void main(String[] args) {
		
		
		BankAccount user1 = new BankAccount("Virak", 0001, 300, 2134);
		BankAccount user2 = new BankAccount("Test", 0001, 300, 2134);
		
		user1.transfer(user2,200);
		System.out.println("Your account balance $: " + user1.getBalance());
		System.out.println(user2.getBalance());

	}

}
