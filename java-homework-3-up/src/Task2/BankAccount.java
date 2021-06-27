package Task2;

public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	private int pin;
	
	public BankAccount(String name, int accountNumber, double balance, int pin) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}
	
	public void withdraw(double amount) {
	    this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void transfer(BankAccount account, double amount) {
	    withdraw(amount);
	    account.deposit(amount);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
