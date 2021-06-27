package commamd.up.com;

import java.util.ArrayList;
import java.util.List;

public class Number {
	
	private double value;
	
	List<ICommand> commandList = new ArrayList<ICommand>();
	List<Double> resultList = new ArrayList<>();

	public Number(double value) {
		this.value = value;
		resultList.add(value);
	}

	public void setCommand(ICommand cmd) {
		commandList.add(cmd);
		double preValue = resultList.get(resultList.size() - 1);
		resultList.add(cmd.action(preValue));
	}
	
	public void undo() {
		resultList.remove(resultList.size() - 1);
	}
	
	public double getResult() {
		return resultList.get(resultList.size() - 1);
	}
	

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
}
