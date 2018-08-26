package project;

import project.strategies.ExecuteStrategy;
import project.strategies.StrategyAImpl;
import project.strategies.StrategyBImpl;
import project.strategies.StrategyCImpl;
import project.strategies.StrategyDImpl;

public class RunStrategies {

	public static void main(String[] args) {
		
		Double valueToCalculate = 100.0;
		System.out.println("Value to calculate is: "+ valueToCalculate);
		
		//Execute the Strategy A
		ExecuteStrategy executeStrategyA = new ExecuteStrategy(new StrategyAImpl());
		executeStrategyA.execute(valueToCalculate);
		
		//Execute the Strategy B
		ExecuteStrategy executeStrategyB = new ExecuteStrategy(new StrategyBImpl());
		executeStrategyB.execute(valueToCalculate);
		
		//Execute the Strategy C
		ExecuteStrategy executeStrategyC = new ExecuteStrategy(new StrategyCImpl());
		executeStrategyC.execute(valueToCalculate);
		
		//Example of new rule that the Product Owner needs for the next month
		ExecuteStrategy executeStrategyD = new ExecuteStrategy(new StrategyDImpl());
		executeStrategyD.execute(valueToCalculate);
	}

}
