/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:28:56 GMT 2024
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.EmailValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmailValidator_ESTest extends EmailValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      emailValidator0.isValidUser("[*TC");
      String string0 = null;
      // Undeclared exception!
      try { 
        emailValidator0.isValidDomain((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      String string0 = ".x";
      String string1 = null;
      // Undeclared exception!
      try { 
        emailValidator0.isValidSymbolicDomain((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      String string0 = "guardian";
      emailValidator0.stripComments("guardian");
      // Undeclared exception!
      try { 
        emailValidator0.isValidSymbolicDomain("guardian");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.validator.EmailValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      emailValidator0.isValid("");
      // Undeclared exception!
      try { 
        emailValidator0.isValidDomain("qpon");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.validator.EmailValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      String string0 = "aVX#*oyDr{})";
      emailValidator0.isValid("aVX#*oyDr{})");
      String string1 = "KY ";
      emailValidator0.isValidUser("KY ");
      // Undeclared exception!
      try { 
        emailValidator0.isValidUser((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      emailValidator0.stripComments("");
      // Undeclared exception!
      emailValidator0.isValidSymbolicDomain("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      emailValidator0.isValid((String) null);
      // Undeclared exception!
      try { 
        emailValidator0.isValidIpAddress("ai");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      emailValidator0.isValidUser("^([a-zA-Z]+)$");
      emailValidator0.stripComments("xn--io0a7i");
      emailValidator0.stripComments("^([a-zA-Z]+)$");
      emailValidator0.stripComments("^([a-zA-Z]+)$");
      emailValidator0.isValid("X\"n");
      emailValidator0.isValid("^([a-zA-Z]+)$");
      emailValidator0.stripComments("^([a-zA-Z]+)$");
      emailValidator0.isValid("{K<8$#Nu]");
      emailValidator0.isValidDomain("^([a-zA-Z]+)$");
      // Undeclared exception!
      emailValidator0.isValidSymbolicDomain("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      // Undeclared exception!
      try { 
        emailValidator0.stripComments((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      String string0 = "[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]+";
      emailValidator0.stripComments("[^sp{Cntrl}()<>@,;:'\\\".[]]+");
      String string1 = null;
      emailValidator0.isValidUser("[^sp{Cntrl}()<>@,;:'\\\".[]]+");
      // Undeclared exception!
      try { 
        emailValidator0.isValidIpAddress((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      emailValidator0.stripComments("$uhH8FTGBaDz");
      emailValidator0.stripComments("6Nm:{b=h0q");
      emailValidator0.isValid("6Nm:{b=h0q");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      String string0 = ".K";
      // Undeclared exception!
      try { 
        emailValidator0.isValidIpAddress("Sl&MXl<(/H,&");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmailValidator.getInstance();
      EmailValidator emailValidator0 = EmailValidator.getInstance();
      // Undeclared exception!
      try { 
        emailValidator0.isValidIpAddress("'F94br=]^dD");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      String string0 = "GY4kk4:h7_Xk'ID";
      // Undeclared exception!
      emailValidator0.isValidSymbolicDomain("GY4kk4:h7_Xk'ID");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      String string0 = "D4J`lz#|m+nZDmUN";
      emailValidator0.stripComments("D4J`lz#|m+nZDmUN");
      emailValidator0.isValidUser("D4J`lz#|m+nZDmUN");
      emailValidator0.isValid("D4J`lz#|m+nZDmUN");
      String string1 = "^(?>[^\"\\\\]+|\\\\.)*(?>\"(?>[^\"\\\\]+|\\\\.)*\"(?>[^\"\\\\]|\\\\.)*)(?>\\((?>[^()\\\\]+|\\\\.)*\\))";
      String string2 = "0_@3";
      String string3 = "";
      emailValidator0.isValidDomain("");
      emailValidator0.isValidUser("0_@3");
      emailValidator0.isValidDomain("^(?>[^\"\\]+|\\.)*(?>\"(?>[^\"\\]+|\\.)*\"(?>[^\"\\]|\\.)*)(?>((?>[^()\\]+|\\.)*))");
      emailValidator0.isValid("|");
      String string4 = null;
      // Undeclared exception!
      try { 
        emailValidator0.isValidSymbolicDomain((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      String string0 = "^([a-zA-Z]+)$";
      emailValidator0.stripComments("^([a-zA-Z]+)$");
      // Undeclared exception!
      try { 
        emailValidator0.isValidIpAddress("^([a-zA-Z]+)$");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      emailValidator0.isValidUser("");
      String string0 = "";
      emailValidator0.isValidUser("");
      String string1 = "xn--9krt00a";
      // Undeclared exception!
      try { 
        emailValidator0.isValidDomain("xn--9krt00a");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmailValidator emailValidator0 = new EmailValidator();
      String string0 = null;
      // Undeclared exception!
      try { 
        emailValidator0.isValidDomain((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}