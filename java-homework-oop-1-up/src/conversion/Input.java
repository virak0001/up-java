package conversion;

public class Input {
	private double in;
	private IConversion con;
	public Input(double in) {
		this.in = in;
	}
	public void setConversion(IConversion con) {
		this.con = con;
	}
	public double getValueTo() {
		return con.valueTo(in);
	}
	public double getValueFrom() {
		return con.valueFrom(in);
	}
}
