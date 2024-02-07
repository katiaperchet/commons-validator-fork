/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 18:04:46 GMT 2024
 */

package org.apache.commons.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections.FastHashMap;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValidatorResult_ESTest extends ValidatorResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.add("|Q=54Y1I[H", true);
      boolean boolean0 = validatorResult0.isValid("|Q=54Y1I[H");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.add("[]", true, object0);
      Object object1 = validatorResult0.getResult("[]");
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      Field field0 = validatorResult0.getField();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setIndexedListProperty("org.apache.commons.validator.ValidatorResult$ResultStatus");
      Field field1 = validatorResult0.getField();
      assertNull(field1.getIndexedProperty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Field field0 = new Field();
      field0.setClientValidation(false);
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Field field1 = validatorResult0.getField();
      assertNull(field1.getDepends());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.page = 1;
      Field field1 = validatorResult0.getField();
      assertNull(field1.getProperty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setPage((-1));
      Field field1 = validatorResult0.getField();
      assertNull(field1.getDepends());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.setFieldOrder(458);
      Field field1 = validatorResult0.getField();
      assertEquals(458, field1.getFieldOrder());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      field0.fieldOrder = (-2531);
      Field field1 = validatorResult0.getField();
      assertNull(field1.getProperty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.isValid("E@xxnI&:=`u~FQ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.getResult("7J)_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      FastHashMap fastHashMap0 = new FastHashMap();
      validatorResult0.hAction = (Map<String, ValidatorResult.ResultStatus>) fastHashMap0;
      fastHashMap0.put("org.apache.commons.validator.ValidatorResult", fastHashMap0);
      // Undeclared exception!
      try { 
        validatorResult0.getResult("org.apache.commons.validator.ValidatorResult");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections.FastHashMap cannot be cast to org.apache.commons.validator.ValidatorResult$ResultStatus
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.getActions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Map<String, ValidatorResult.ResultStatus> map0 = validatorResult0.hAction;
      validatorResult0.hAction = map0;
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.getActionMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ValidatorResult validatorResult0 = new ValidatorResult((Field) null);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.containsAction("E@xxnI&:=`u~FQ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Map<String, ValidatorResult.ResultStatus> map0 = validatorResult0.getActionMap();
      validatorResult0.hAction = map0;
      // Undeclared exception!
      try { 
        validatorResult0.add("[]", true, (Object) map0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.add("[]", true, (Object) field0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Map<String, ValidatorResult.ResultStatus> map0 = validatorResult0.getActionMap();
      validatorResult0.hAction = map0;
      // Undeclared exception!
      try { 
        validatorResult0.add("Zz{T", false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.hAction = null;
      // Undeclared exception!
      try { 
        validatorResult0.add("[]", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(true, "[]");
      validatorResult_ResultStatus0.getResult();
      assertTrue(validatorResult_ResultStatus0.isValid());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      boolean boolean0 = validatorResult0.isValid("2HVNR2g!axS~36)4#O");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Object object0 = validatorResult0.getResult("[]");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      validatorResult0.add("[]", true);
      boolean boolean0 = validatorResult0.containsAction("[]");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      boolean boolean0 = validatorResult0.containsAction("[]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Field field0 = new Field();
      ValidatorResult validatorResult0 = new ValidatorResult(field0);
      Iterator<String> iterator0 = validatorResult0.getActions();
      FastHashMap fastHashMap0 = new FastHashMap(1);
      validatorResult0.hAction = (Map<String, ValidatorResult.ResultStatus>) fastHashMap0;
      fastHashMap0.put("", iterator0);
      // Undeclared exception!
      try { 
        validatorResult0.isValid("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Collections$UnmodifiableCollection$1 cannot be cast to org.apache.commons.validator.ValidatorResult$ResultStatus
         //
         verifyException("org.apache.commons.validator.ValidatorResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(false, (Object) null);
      validatorResult_ResultStatus0.setResult(validatorResult_ResultStatus0);
      assertFalse(validatorResult_ResultStatus0.isValid());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(false, (Object) null);
      validatorResult_ResultStatus0.setValid(false);
      assertFalse(validatorResult_ResultStatus0.isValid());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ValidatorResult.ResultStatus validatorResult_ResultStatus0 = new ValidatorResult.ResultStatus(false, (Object) null);
      boolean boolean0 = validatorResult_ResultStatus0.isValid();
      assertFalse(boolean0);
  }
}
