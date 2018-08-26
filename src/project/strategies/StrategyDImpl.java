package project.strategies;

public class StrategyDImpl implements Strategy {

	public double calculate(Double value) {
		return (value * 0.1) + 10.0;
	}
	
	public String toString() {
		return "Strategy D";
	}

}
