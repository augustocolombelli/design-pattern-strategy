package project.strategies;

public class StrategyCImpl implements Strategy {

	public double calculate(Double value) {
		return value * 0.1;
	}
	
	public String toString() {
		return "Strategy C";
	}

}
