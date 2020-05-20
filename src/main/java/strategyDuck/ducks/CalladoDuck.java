package strategyDuck.ducks;

import strategyDuck.behaviorStrategies.fly.FlyBehavior;
import strategyDuck.behaviorStrategies.quack.QuackBehavior;

public class CalladoDuck extends Duck {

	public CalladoDuck(QuackBehavior quack, FlyBehavior fly) {
		super(quack, fly);
	}

	@Override
	public void display() {
		System.out.println("Soy un pato callado");
	}


}
