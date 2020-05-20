package strategyDuck.ducks;

import strategyDuck.behaviorStrategies.fly.FlyBehavior;
import strategyDuck.behaviorStrategies.quack.QuackBehavior;

public class CriolloDuck extends Duck {

	
	public CriolloDuck(QuackBehavior quack, FlyBehavior fly) {
		super(quack, fly);
	}

	@Override
	public void display() {
		System.out.println("Un paso mil cagadas");
	}

	
}
