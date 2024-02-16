/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 17:52:24 GMT 2024
 */

package org.apache.commons.validator.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.validator.util.Flags;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Flags_ESTest extends Flags_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Flags flags0 = new Flags((-1144L));
      flags0.turnOffAll();
      boolean boolean0 = flags0.isOn((-1144L));
      assertEquals(0L, flags0.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Flags flags0 = new Flags((-870L));
      boolean boolean0 = flags0.isOff(1979L);
      assertFalse(boolean0);
      assertEquals((-870L), flags0.getFlags());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Flags flags0 = new Flags();
      Object object0 = flags0.clone();
      flags0.turnOn(1L);
      boolean boolean0 = flags0.equals(object0);
      assertEquals(1L, flags0.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Flags flags0 = new Flags();
      flags0.turnOn(274L);
      long long0 = flags0.getFlags();
      assertEquals(274L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Flags flags0 = new Flags(361L);
      String string0 = flags0.toString();
      assertEquals("0000000000000000000000000000000000000000000000000000000101101001", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Flags flags0 = new Flags((-895L));
      boolean boolean0 = flags0.isOn((-895L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Flags flags0 = new Flags();
      boolean boolean0 = flags0.isOn(9L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Flags flags0 = new Flags((-895L));
      boolean boolean0 = flags0.isOff((-895L));
      assertEquals((-895L), flags0.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Flags flags0 = new Flags();
      Object object0 = new Object();
      boolean boolean0 = flags0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Flags flags0 = new Flags();
      boolean boolean0 = flags0.equals(flags0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Flags flags0 = new Flags((-895L));
      Flags flags1 = new Flags();
      boolean boolean0 = flags0.equals(flags1);
      assertFalse(boolean0);
      assertFalse(flags1.equals((Object)flags0));
      assertEquals((-895L), flags0.getFlags());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Flags flags0 = new Flags();
      flags0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Flags flags0 = new Flags();
      Object object0 = flags0.clone();
      boolean boolean0 = flags0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Flags flags0 = new Flags();
      flags0.turnOnAll();
      long long0 = flags0.getFlags();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Flags flags0 = new Flags();
      long long0 = flags0.getFlags();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Flags flags0 = new Flags((-895L));
      flags0.turnOn((-895L));
      assertEquals((-895L), flags0.getFlags());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Flags flags0 = new Flags(361L);
      flags0.turnOff(361L);
      boolean boolean0 = flags0.isOff(361L);
      assertEquals(0L, flags0.getFlags());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Flags flags0 = new Flags();
      flags0.clear();
      assertEquals(0L, flags0.getFlags());
  }
}