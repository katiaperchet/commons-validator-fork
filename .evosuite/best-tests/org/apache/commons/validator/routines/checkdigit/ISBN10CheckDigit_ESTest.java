/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 18:07:18 GMT 2024
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.routines.checkdigit.ISBN10CheckDigit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISBN10CheckDigit_ESTest extends ISBN10CheckDigit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      try { 
        iSBN10CheckDigit0.toInt('k', 1, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Character[1] = 'k'
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      int int0 = iSBN10CheckDigit0.weightedValue(0, 2900, 2900);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      int int0 = iSBN10CheckDigit0.weightedValue(88, 88, 88);
      assertEquals(7744, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = (ISBN10CheckDigit)ISBN10CheckDigit.ISBN10_CHECK_DIGIT;
      int int0 = iSBN10CheckDigit0.weightedValue(3052, 3052, (-1));
      assertEquals((-3052), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      int int0 = iSBN10CheckDigit0.toInt('0', 4033, 9);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      int int0 = iSBN10CheckDigit0.toInt('1', 1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      try { 
        iSBN10CheckDigit0.toCheckDigit(3011);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid Check Digit Value =3011
         //
         verifyException("org.apache.commons.validator.routines.checkdigit.ModulusCheckDigit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      boolean boolean0 = iSBN10CheckDigit0.isValid("9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      String string0 = iSBN10CheckDigit0.toCheckDigit(10);
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      String string0 = iSBN10CheckDigit0.toCheckDigit(9);
      assertEquals("9", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISBN10CheckDigit iSBN10CheckDigit0 = new ISBN10CheckDigit();
      boolean boolean0 = iSBN10CheckDigit0.isValid("X");
      assertFalse(boolean0);
  }
}
