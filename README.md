### Strategy Design Pattern
Simple example using Strategy Design Pattern

#### How can we use this Design Pattern?
We can use this Design Pattern when part of your algorithm respect a specific business rule. In our example, we have two steps in the execution, calculate and print the result. Print the result is common, but the calculate is specifically.

#### How can this Design Pattern can help us?
Using this pattern, we can made our code more clean with class more responsibles. It is more easy introduce a new rule when it's necessary. One example, imagine that Product Owner needs a new calculate rule for the next month that need to increase 10 value in the result using 10% factor.  It is possible this only creating a new Strategy. For this, we can create a new Stragey like this:
```
public class StrategyDImpl implements Strategy {

  public double calculate(Double value) {
    return (value * 0.1) + 10.0;
	}
	
	public String toString() {
		return "Strategy D";
	}
}
```

#### Class Diagram
![My image](https://github.com/augustocolombelli/design-pattern-strategy/blob/master/ClassDiagram.png)

