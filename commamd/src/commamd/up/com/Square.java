package commamd.up.com;

public class Square implements ICommand {
	
	private double newValue;
	
	public Square(double newValue) {
		this.newValue = newValue;
	}

	@Override
	public double action(double preValue) {
		return Math.sqrt(preValue);
	}

	public double getNewValue() {
		return newValue;
	}

	public void setNewValue(double newValue) {
		this.newValue = newValue;
	}
	

}
