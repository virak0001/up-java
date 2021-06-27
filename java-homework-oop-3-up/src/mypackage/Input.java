package mypackage;

import java.security.NoSuchAlgorithmException;

public class Input {
	private String input;
	private Encription encription;
	
	public Input(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public Encription getEncription() {
		return encription;
	}
	
	public void setEncription(Encription encription) {
		this.encription = encription;
	}
	
	public String displayEncript() throws NoSuchAlgorithmException {
		return encription.encript(getInput());
	}
}
