package project;

import project.strategies.Strategy;
import project.strategies.StrategyAImpl;
import project.strategies.StrategyBImpl;
import project.strategies.StrategyCImpl;

public class RunStrategies {

	public static void main(String[] args) {
		Strategy strategyA = new StrategyAImpl();
		Strategy strategyB = new StrategyBImpl();
		Strategy strategyC = new StrategyCImpl();
		
		Double valueToCalculate = 100.0;
		System.out.println("Value to calculate is: "+ valueToCalculate);
		System.out.println("Result of Strategy A is: " + strategyA.calculate(valueToCalculate));
		System.out.println("Result of Strategy B is: " + strategyB.calculate(valueToCalculate));
		System.out.println("Result of Strategy A is: " + strategyC.calculate(valueToCalculate));
	}

}
