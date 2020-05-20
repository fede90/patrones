package strategyDuck.ducks;

import strategyDuck.behaviorStrategies.fly.FlyBehavior;
import strategyDuck.behaviorStrategies.quack.QuackBehavior;

public abstract class Duck {
	
	private QuackBehavior quackB;
	private FlyBehavior flyB;

	public Duck(QuackBehavior quack, FlyBehavior fly) {
		quackB = quack;
		flyB = fly;
	}
	
	public void swim() {
		System.out.println("Todos nadamos");
	}
	
	public abstract void display();

	public String performFly() {
		return flyB.fly();
	}

	public String performQuack() {
		return quackB.quack();
	}

	public QuackBehavior getQuackB() {
		return quackB;
	}

	public FlyBehavior getFlyB() {
		return flyB;
	}

	public void setQuackB(QuackBehavior quackB) {
		this.quackB = quackB;
	}

	public void setFlyB(FlyBehavior flyB) {
		this.flyB = flyB;
	}
}
