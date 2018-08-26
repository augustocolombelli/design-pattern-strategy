package project.strategies;

public class StrategyAImpl implements Strategy {

	public double calculate(Double value) {
		return value * 0.03;
	}

	@Override
	public String toString() {
		return "Strategy A";
	}
}
