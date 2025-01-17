/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:27:09 GMT 2024
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IBANCheckDigit_ESTest extends IBANCheckDigit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      boolean boolean0 = iBANCheckDigit0.isValid("Z&02JSv9*F\u0003");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = (IBANCheckDigit)IBANCheckDigit.IBAN_CHECK_DIGIT;
      String string0 = iBANCheckDigit0.calculate("yiWODYEOu1");
      assertEquals("09", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      String string0 = iBANCheckDigit0.calculate("5ob(sN");
      assertEquals("51", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      try { 
        iBANCheckDigit0.calculate("M_`CUx");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Character[3] = '-1'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.IBANCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      boolean boolean0 = iBANCheckDigit0.isValid("F2EOB");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      boolean boolean0 = iBANCheckDigit0.isValid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      boolean boolean0 = iBANCheckDigit0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      boolean boolean0 = iBANCheckDigit0.isValid("1sAg0z3vO0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      String string0 = iBANCheckDigit0.calculate("F2EOB");
      assertEquals("10", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      try { 
        iBANCheckDigit0.calculate("08");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Code length=2
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.IBANCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      String string0 = iBANCheckDigit0.calculate("X1>9w");
      assertEquals("08", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IBANCheckDigit iBANCheckDigit0 = new IBANCheckDigit();
      try { 
        iBANCheckDigit0.calculate((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Code length=0
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.IBANCheckDigit", e);
      }
  }
}
