package project.strategies;

public class ExecuteStrategy {

	private Strategy strategy;

	public ExecuteStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute(Double value) {
		double result = strategy.calculate(value);

		printResult(result);
	}

	private void printResult(double result) {
		System.out.println("Result of " + strategy + " is: " + result);
	}

}
