package strategyDuck.ducks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import strategyDuck.behaviorStrategies.fly.FlyCagando;
import strategyDuck.behaviorStrategies.fly.FlyHelicopter;
import strategyDuck.behaviorStrategies.quack.Quack;
import strategyDuck.behaviorStrategies.quack.QuackInsoportable;

public class CriolloEvolucionadoDuckTest {
	Duck criollo;
	//Dado un pato que es criollo y evoluciona
		//Primero nace como criollo y luego de un tiempo
		//al volar tiene que hacerlo como helicoptero
		//al emitir un sonido tiene ser insoportable
	
	//Esto es para mostrar el beneficio del strategy, se puede cambiar dinamicamente el comportamiento. 
	//Si hubiese elegido herencia la única forma es modificando el código del método
	
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
	
	
	@Test
	@DisplayName("al volar lo hace como helicoptero")
	public void vuelaHelicoptero() {
		criollo.setFlyB(new FlyHelicopter()); //cambio dinamico
		assertEquals("Vuelo con hélices",criollo.performFly());
	}
	
	@Test
	@DisplayName("al hacer cuak es insoportable")
	public void quackInsoporteble() {
		criollo.setQuackB(new QuackInsoportable()); //cambio dinamico
		assertEquals("QUACK QUACK QUACK QUACK QUACK QUACK QUACK",criollo.performQuack());
	}	
}
