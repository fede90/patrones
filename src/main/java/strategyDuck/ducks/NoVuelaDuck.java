package strategyDuck.ducks;

import strategyDuck.behaviorStrategies.fly.FlyBehavior;
import strategyDuck.behaviorStrategies.quack.QuackBehavior;

public class NoVuelaDuck extends Duck {

	public NoVuelaDuck(QuackBehavior quack, FlyBehavior fly) {
		super(quack, fly);
	}

	@Override
	public void display() {
		System.out.println("Che yo no tengo alas para volar");
	}

}
