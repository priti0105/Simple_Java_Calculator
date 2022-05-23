package simplejavacalculatorTest;

import static java.lang.Double.NaN;
import junit.framework.Assert;

import org.junit.Test;

import simplejavacalculator.Calculator;

public class CalculatorTest {
	
	@Test
	public void calculateBiNormalTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0);
		Assert.assertEquals(NaN, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
    }
	
	@Test
	public void calculateBiAddTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 3.0);
		Assert.assertEquals(5.5, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.5));
	}
	
	@Test
	public void calculateBiMinusTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.minus, 3.1415);
		Assert.assertEquals(2.0415, calculator.calculateBi(Calculator.BiOperatorModes.normal, 1.1));
	}
	
	@Test
	public void calculateBiMultiplyTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.multiply, 3.2);
		Assert.assertEquals(6.4, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}
	
	@Test
	public void calculateBiDivideTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.divide, 6.4);
		Assert.assertEquals(3.2, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}
	
	@Test
	public void calculateEqualTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
		calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0);
		Assert.assertEquals(11.4, calculator.calculateEqual(3.0));
	}
	
	@Test
	public void resetTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
		Assert.assertEquals(8.4, calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0));
		Assert.assertEquals(NaN, calculator.reset());		
	}
	
	@Test
	public void CalculateMonoSquareTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(9.0, calculator.calculateMono(Calculator.MonoOperatorModes.square, 3.0));
	}
	
	@Test
	public void CalculateMonoSquareRootTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(5.0, calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0));
	}
	
	@Test
	public void CalculateMonoOneDividedByTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0.10, calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0));
	}
	
	@Test
	public void CalculateMonoSinTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0.5, calculator.calculateMono(Calculator.MonoOperatorModes.sin, java.lang.Math.PI / 6), 0.0000000001);
	}
	
	@Test
	public void CalculateMonoCosTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0.5, calculator.calculateMono(Calculator.MonoOperatorModes.cos, java.lang.Math.PI / 3), 0.0000000001);
	}
	
	@Test
	public void CalculateMonoTanTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(1.0, calculator.calculateMono(Calculator.MonoOperatorModes.tan, java.lang.Math.PI / 4), 0.0000000001);
	}
	
	@Test
	public void CalculateMonoLogTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2.0, calculator.calculateMono(Calculator.MonoOperatorModes.log, 100.0));
	}
	
	@Test
	public void CalculateMonoRateTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(.75, calculator.calculateMono(Calculator.MonoOperatorModes.rate, 75.0));
	}
	
	@Test
	public void CalculateMonoAbsTest() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, -3.0));
		Assert.assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, 3.0));
	}

}
