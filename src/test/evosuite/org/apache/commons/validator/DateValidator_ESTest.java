/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:40:48 GMT 2024
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.validator.DateValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateValidator_ESTest extends DateValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid("", "6-", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateValidator dateValidator0 = DateValidator.getInstance();
      boolean boolean0 = dateValidator0.isValid("2*Ymdr2", "u", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid("6-", "6-", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid("6-", "6-", false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      // Undeclared exception!
      try { 
        dateValidator0.isValid("WT", "\"f", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid("", "", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid((String) null, ".$>^S#", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid("", (Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      boolean boolean0 = dateValidator0.isValid((String) null, (Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateValidator dateValidator0 = new DateValidator();
      Locale locale0 = Locale.ITALY;
      boolean boolean0 = dateValidator0.isValid("vr,$jv,:OeCfZ@@", locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateValidator dateValidator0 = DateValidator.getInstance();
      boolean boolean0 = dateValidator0.isValid("7z", (String) null, true);
      assertFalse(boolean0);
  }
}
