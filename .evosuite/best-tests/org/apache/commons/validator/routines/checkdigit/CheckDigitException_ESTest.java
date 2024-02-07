/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 18:10:24 GMT 2024
 */

package org.apache.commons.validator.routines.checkdigit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.validator.routines.checkdigit.CheckDigitException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckDigitException_ESTest extends CheckDigitException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckDigitException checkDigitException0 = new CheckDigitException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheckDigitException checkDigitException0 = new CheckDigitException("");
      MockThrowable mockThrowable0 = new MockThrowable(checkDigitException0);
      CheckDigitException checkDigitException1 = new CheckDigitException("", mockThrowable0);
      assertFalse(checkDigitException1.equals((Object)checkDigitException0));
  }
}
