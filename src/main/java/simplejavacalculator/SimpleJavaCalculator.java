/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        Main.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-03-30
 *
 * @modifiedby  Achintha Gunasekara
 * @modweb      http://www.achinthagunasekara.com
 * @modemail    contact@achinthagunasekara.com
 */

package simplejavacalculator;

import static java.lang.Double.NaN;

import java.awt.Frame;
import java.awt.event.WindowEvent;

import junit.framework.Assert;
import simplejavacalculatorTest.CalculatorTest;

public class SimpleJavaCalculator {

	public static void main(String[] args) {
		try {
			UI uiCal = new UI();
			//uiCal.init();
			//Frame f = new Frame();
			//f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0);
		Assert.assertEquals(NaN, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
	}
}
