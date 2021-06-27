package commamd.up.com;

public class Minus implements ICommand {
	
	private double newValue;

	public Minus(double newValue) {
		this.newValue = newValue;
	}

	@Override
	public double action(double preValue) {
		return preValue - newValue;
	}
	
	public double getNewValue() {
		return newValue;
	}

	public void setNewValue(double newValue) {
		this.newValue = newValue;
	}

}
