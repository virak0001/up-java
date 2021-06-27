package conversion;

public class Main {

	public static void main(String[] args) {
		
		Input minuteToSecond = new Input(10);
		minuteToSecond.setConversion(new MinuteSecond());
		// 10 minute to seconds 600s
		System.out.println("Minute to seconds: " + minuteToSecond.getValueTo() + "s");
		
		Input secondToMinute = new Input(600);
		secondToMinute.setConversion(new MinuteSecond());
		// 600s = 10mn
		System.out.println("second to minute: " + secondToMinute.getValueFrom() + "mn");
	}

}
