/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:43:02 GMT 2024
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.validator.routines.IntegerValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntegerValidator_ESTest extends IntegerValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 100);
      Long long0 = new Long((-2147483648L));
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Object object0 = integerValidator0.processParsedValue(long0, mockSimpleDateFormat0);
      assertEquals(Integer.MIN_VALUE, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      boolean boolean0 = integerValidator0.minValue((Integer) integerValidator0.STANDARD_FORMAT, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Integer integer0 = new Integer(1386);
      boolean boolean0 = integerValidator0.isInRange(integer0, 1, 1386);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(false, 73);
      Locale locale0 = new Locale("org.apache.commons.vali[ator.rou_ines.IntegerValidator", "org.apache.commons.vali[ator.rou_ines.IntegerValidator", "org.apache.commons.vali[ator.rou_ines.IntegerValidator");
      Integer integer0 = integerValidator0.validate("0>l:'~P7K]_gGRv9", locale0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(false, (-2483));
      Locale locale0 = Locale.GERMAN;
      Integer integer0 = integerValidator0.validate("8b?$`Hryz!$80z/|h", locale0);
      assertNotNull(integer0);
      assertEquals(8, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Locale locale0 = Locale.CANADA;
      Integer integer0 = integerValidator0.validate("-1", locale0);
      assertNotNull(integer0);
      assertEquals((-1), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Locale locale0 = Locale.GERMANY;
      Integer integer0 = integerValidator0.validate("0", "", locale0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 100);
      Locale locale0 = Locale.PRC;
      Integer integer0 = integerValidator0.validate("1632", "", locale0);
      assertEquals(1632, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Locale locale0 = new Locale("", "", "");
      Integer integer0 = integerValidator0.validate("-1Om1", "1Om", locale0);
      assertEquals((-1), (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Integer integer0 = integerValidator0.validate("0b[dg)7-", "0b[dg)7-");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(false, (-2483));
      Integer integer0 = integerValidator0.validate("9X>w+B;,", "");
      assertEquals(9, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      Integer integer0 = integerValidator0.validate("7");
      assertNotNull(integer0);
      assertEquals(7, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Integer integer0 = integerValidator0.validate("-1");
      assertEquals((-1), (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      Long long0 = new Long(2147483647L);
      Object object0 = integerValidator0.processParsedValue(long0, numberFormat0);
      assertEquals(Integer.MAX_VALUE, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      boolean boolean0 = integerValidator0.minValue((Integer) integerValidator0.STANDARD_FORMAT, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(false, 73);
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        integerValidator0.validate("org.apache.commons.vali[ator.rou_ines.IntegerVa#idator", "org.apache.commons.vali[ator.rou_ines.IntegerVa#idator", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Multiple decimal separators in pattern \"org.apache.commons.vali[ator.rou_ines.IntegerVa#idator\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      // Undeclared exception!
      try { 
        integerValidator0.validate("r_i,p8/3L[,", "!d'0R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed pattern \"!d'0R\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(false, (-1905));
      // Undeclared exception!
      try { 
        integerValidator0.maxValue((Integer) null, (-1905));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.IntegerValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      // Undeclared exception!
      try { 
        integerValidator0.isInRange((Integer) null, 38, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.IntegerValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      boolean boolean0 = integerValidator0.minValue(1044, 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      boolean boolean0 = integerValidator0.maxValue(0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      boolean boolean0 = integerValidator0.maxValue(100, 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(false, 245);
      boolean boolean0 = integerValidator0.isInRange(0, (-1253), 245);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      boolean boolean0 = integerValidator0.isInRange(1, 2, 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      boolean boolean0 = integerValidator0.isInRange(1, 1, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      Long long0 = new Long(2147483685L);
      Object object0 = integerValidator0.processParsedValue(long0, numberFormat0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 73);
      Long long0 = new Long((-2147483656L));
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Object object0 = integerValidator0.processParsedValue(long0, mockSimpleDateFormat0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      Object object0 = integerValidator0.processParsedValue(integerValidator0.STANDARD_FORMAT, numberFormat0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 2399);
      boolean boolean0 = integerValidator0.minValue(0, 2399);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 2399);
      boolean boolean0 = integerValidator0.maxValue((Integer) 2, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 2399);
      boolean boolean0 = integerValidator0.isInRange((Integer) 1, 1, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator(true, 2399);
      boolean boolean0 = integerValidator0.isInRange((Integer) 2, 2399, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Integer integer0 = integerValidator0.validate("0b/)g)7-");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      boolean boolean0 = integerValidator0.maxValue((Integer) integerValidator0.CURRENCY_FORMAT, 38);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      // Undeclared exception!
      try { 
        integerValidator0.minValue((Integer) null, (-1146));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.IntegerValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      Locale locale0 = new Locale("U#mN6o", "-J>D>HvVYmg34", "U#mN6o");
      Integer integer0 = integerValidator0.validate("-J>D>HvVYmg34", locale0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IntegerValidator integerValidator0 = IntegerValidator.getInstance();
      Integer integer0 = integerValidator0.validate((String) null, (String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IntegerValidator integerValidator0 = new IntegerValidator();
      Locale locale0 = new Locale("U#mN6o", "-J>D>HvVYmg34", "U#mN6o");
      Integer integer0 = integerValidator0.validate("-J>D>HvVYmg34", "-J>D>HvVYmg34", locale0);
      assertNull(integer0);
  }
}
