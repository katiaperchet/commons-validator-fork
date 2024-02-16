/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 18:05:37 GMT 2024
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.checkdigit.ISSNCheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISSNCheckDigit_ESTest extends ISSNCheckDigit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      try { 
        iSSNCheckDigit0.calculateModulus("[", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Character[1] = '['
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      String string0 = iSSNCheckDigit0.toCheckDigit(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      int int0 = iSSNCheckDigit0.weightedValue(0, 0, 2664);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      int int0 = iSSNCheckDigit0.weightedValue(4, 4, 4);
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      int int0 = iSSNCheckDigit0.weightedValue(2379, 1174, 2379);
      assertEquals((-2771535), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = (ISSNCheckDigit)ISSNCheckDigit.ISSN_CHECK_DIGIT;
      int int0 = iSSNCheckDigit0.toInt('0', 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      int int0 = iSSNCheckDigit0.toInt('2', 782, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      try { 
        iSSNCheckDigit0.toInt(':', (-2078), (-2078));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Character[-2078] = ':'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid("X");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      String string0 = iSSNCheckDigit0.toCheckDigit(10);
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      try { 
        iSSNCheckDigit0.toCheckDigit(51);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Check Digit Value =51
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISSNCheckDigit iSSNCheckDigit0 = new ISSNCheckDigit();
      boolean boolean0 = iSSNCheckDigit0.isValid("0");
      assertFalse(boolean0);
  }
}