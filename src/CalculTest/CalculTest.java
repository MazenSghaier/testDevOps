package CalculTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Calculatrice.Calcul;

class CalculTest {
	
	@Test
	public void testSum() {
		
		Calcul calculator = new Calcul();
		
		int result = calculator.sum(2, 2);
		
		if (result != 4) {   
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Calcul calculator = new Calcul();
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		Calcul calculator = new Calcul();
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	@Test
	public void testMultiply() {
		Calcul calculator = new Calcul();
		Assert.assertEquals(20, calculator.multiply(5, 4));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calcul calculator = new Calcul();
		calculator.divide(6, 0);
	}

}
