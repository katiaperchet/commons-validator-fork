/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:39:48 GMT 2024
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorResources;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Validator_ESTest extends Validator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "java.lang.Object");
      // Undeclared exception!
      try { 
        validator0.validate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResources", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "", "Cr5*LF_");
      validator0.setUseContextClassLoader(true);
      boolean boolean0 = validator0.getUseContextClassLoader();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "");
      validator0.setPage((-1));
      int int0 = validator0.getPage();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "p_g{jCoycZ=Y", "java.util.Locale");
      validator0.setOnlyReturnErrors(true);
      boolean boolean0 = validator0.getOnlyReturnErrors();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "", "");
      String string0 = validator0.getFormName();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      Object object0 = new Object();
      validator0.setParameter("java.util.Locale", object0);
      // Undeclared exception!
      try { 
        validator0.validate();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Locale
         //
         verifyException("org.apache.commons.validator.Validator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Validator validator0 = null;
      try {
        validator0 = new Validator((ValidatorResources) null, "saL{J!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Resources cannot be null.
         //
         verifyException("org.apache.commons.validator.Validator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "java.lang.Object");
      String string0 = validator0.getFormName();
      assertEquals("java.lang.Object", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      Object object0 = validator0.getParameterValue("org.apache.commons.validator.Validator");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      validatorResources0.process();
      validator0.validate();
      Object object0 = validator0.getParameterValue("org.apache.commons.validator.Validator");
      assertSame(object0, validator0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "d!ZK_k", "d!ZK_k");
      validator0.setUseContextClassLoader(true);
      validator0.getClassLoader();
      assertTrue(validator0.getUseContextClassLoader());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "}tyl44$(+$tuk6l!", "}tyl44$(+$tuk6l!");
      ClassLoader classLoader0 = validator0.getClassLoader();
      validator0.setClassLoader(classLoader0);
      ClassLoader classLoader1 = validator0.getClassLoader();
      assertNotNull(classLoader1);
      assertEquals("}tyl44$(+$tuk6l!", validator0.getFormName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Validator validator0 = null;
      try {
        validator0 = new Validator((ValidatorResources) null, "P`t'-ov", "P`t'-ov");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Resources cannot be null.
         //
         verifyException("org.apache.commons.validator.Validator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Validator validator0 = null;
      try {
        validator0 = new Validator((ValidatorResources) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Resources cannot be null.
         //
         verifyException("org.apache.commons.validator.Validator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      int int0 = validator0.getPage();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      validator0.clear();
      assertEquals(0, validator0.getPage());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      boolean boolean0 = validator0.getOnlyReturnErrors();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "}tyl44$(+$tuk6l!", "}tyl44$(+$tuk6l!");
      validator0.getUseContextClassLoader();
      assertEquals("}tyl44$(+$tuk6l!", validator0.getFormName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0, "d!ZK_k", "d!ZK_k");
      validator0.setFieldName("d!ZK_k");
      assertEquals("d!ZK_k", validator0.getFormName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      validator0.setPage(1029);
      int int0 = validator0.getPage();
      assertEquals(1029, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      validator0.setFormName("java.lang.Object");
      assertEquals("java.lang.Object", validator0.getFormName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ValidatorResources validatorResources0 = new ValidatorResources();
      Validator validator0 = new Validator(validatorResources0);
      String string0 = validator0.getFormName();
      assertNull(string0);
  }
}
