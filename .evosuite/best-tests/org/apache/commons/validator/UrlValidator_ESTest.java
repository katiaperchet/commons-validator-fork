/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:11:05 GMT 2024
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.UrlValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UrlValidator_ESTest extends UrlValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 4);
      urlValidator0.isValidFragment("?1M%*7q%,x[flqJ|%<>");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      urlValidator0.countToken("^[^s;/@&=,.?:+$]+(.[^s;/@&=,.?:+$]+)*$", "^[^s;/@&=,.?:+$]+(.[^s;/@&=,.?:+$]+)*$");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 906);
      // Undeclared exception!
      try { 
        urlValidator0.countToken("V$MtQ}:%>g<^]w75$", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ftp";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      urlValidator0.isValidScheme("ftp");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      urlValidator0.isValidScheme("ftp");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValidScheme((String) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValidScheme("org.apache.commons.validator.util.Flags");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(4);
      urlValidator0.isValidQuery((String) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 3140);
      urlValidator0.isValidQuery("`K+$r^q");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 4);
      urlValidator0.isValidPath("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValidPath("]tp");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValidPath((String) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValidPath("");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(4);
      urlValidator0.isValidFragment((String) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      urlValidator0.isValidFragment("dsrDH6#1tAr?;\")7");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValidAuthority((String) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      // Undeclared exception!
      try { 
        urlValidator0.isValidAuthority("org.apache.commons.validator.util.Flags");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      // Undeclared exception!
      try { 
        urlValidator0.isValid("[^s;/@&=,.?:+$]");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, 7);
      urlValidator0.isValid((String) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      urlValidator0.isValid("");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      urlValidator0.countToken("ftp", "");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      // Undeclared exception!
      urlValidator0.countToken("", "");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((-1));
      boolean boolean0 = urlValidator0.isValidScheme("Fyr}HT|H+");
      assertFalse(boolean0);
  }
}
