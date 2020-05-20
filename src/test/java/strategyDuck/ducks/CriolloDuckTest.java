package strategyDuck.ducks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import strategyDuck.behaviorStrategies.fly.FlyCagando;
import strategyDuck.behaviorStrategies.quack.Quack;

@DisplayName("Dado un pato que es criollo")
public class CriolloDuckTest {

	Duck criollo;
	//Dado un pato que es criollo 
		//al volar tiene que cagar
		//al emitir un sonido tiene que cagar
	
	@BeforeEach
	private void init() {
		criollo = new CriolloDuck(new Quack(),new FlyCagando());
	}
	
	@Test
	@DisplayName("al volar se caga")
	public void vuelaCagando() {
		assertEquals("Vuelo y cago",criollo.performFly());
	}
	
	@Test
	@DisplayName("al hacer cuak se caga")
	public void quackCagando() {
		assertEquals("Hago quack y cago",criollo.performQuack());
	}	
}
