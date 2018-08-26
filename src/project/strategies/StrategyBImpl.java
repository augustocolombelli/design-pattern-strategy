package project.strategies;

public class StrategyBImpl implements Strategy {

	public double calculate(Double value) {
		return value * 0.05;
	}
	
	public String toString() {
		return "Strategy B";
	}
	
}
