package strategyDuck.ducks;

import strategyDuck.behaviorStrategies.fly.FlyBehavior;
import strategyDuck.behaviorStrategies.quack.QuackBehavior;

public class MallardDuck extends Duck {

	public MallardDuck(QuackBehavior quack, FlyBehavior fly) {
		super(quack, fly);
	}

	@Override
	public void display() {
		System.out.println("Soy un Mallard");
	}


}
