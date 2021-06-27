package Interface;

public class Mix implements VirakNumber{
	private double a, b;

	
	public Mix(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getNumber() {
		if(this.a < this.b) {
			return a;
		}
		return b;
	}
}
