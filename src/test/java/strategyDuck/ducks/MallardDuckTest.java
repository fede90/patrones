package strategyDuck.ducks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import strategyDuck.behaviorStrategies.fly.FlyWithWings;
import strategyDuck.behaviorStrategies.quack.QuackInsoportable;

@DisplayName("Dado un pato que es Mallard")
public class MallardDuckTest {
	Duck mallard;
	//Dado un pato que es mallard 
		//al volar lo hace con las alas
		//al emitir un sonido es insoportable
	
	@BeforeEach
	private void init() {
		mallard = new MallardDuck(new QuackInsoportable(),new FlyWithWings());
	}
	
	@Test
	@DisplayName("al volar se caga")
	public void vuelaCagando() {
		assertEquals("Vuelo con mis alas",mallard.performFly());
	}
	
	@Test
	@DisplayName("al hacer cuak se caga")
	public void quackCagando() {
		assertEquals("QUACK QUACK QUACK QUACK QUACK QUACK QUACK",mallard.performQuack());
	}	
	
}
