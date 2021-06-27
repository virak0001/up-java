package commamd.up.com;

public class DemoUndoNumber {
	
	public DemoUndoNumber() {
		Number number = new Number(10); // 10
		number.setCommand(new Plus(15)); // 10 + 15 = 25
		number.setCommand(new Minus(15)); // 25 - 15 = 10
		number.setCommand(new Plus(15)); // 10 + 15 = 25
		number.setCommand(new Minus(5)); // 25 + 5 = 30
		number.undo(); // remove the lastIndex = 5 ===> 30 - 5 = 25
		number.setCommand(new Square(number.getResult())); // 5
		System.out.println(number.getResult()); 
	}

	public static void main(String[] args) {
		new DemoUndoNumber();
	}

}
