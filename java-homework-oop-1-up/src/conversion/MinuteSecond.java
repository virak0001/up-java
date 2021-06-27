package conversion;

public class MinuteSecond implements IConversion {

	@Override
	public double valueTo(double input) {
		return input * 60;
	}
	@Override
	public double valueFrom(double input) {
		return input / 60;
	}
}
