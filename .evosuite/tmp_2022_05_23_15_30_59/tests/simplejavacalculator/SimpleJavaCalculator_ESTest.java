/*
 * This file was automatically generated by EvoSuite
 * Mon May 23 13:36:19 GMT 2022
 */

package simplejavacalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplejavacalculator.SimpleJavaCalculator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleJavaCalculator_ESTest extends SimpleJavaCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SimpleJavaCalculator.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleJavaCalculator simpleJavaCalculator0 = new SimpleJavaCalculator();
  }
}
