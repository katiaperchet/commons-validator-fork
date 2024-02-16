/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 07 18:11:14 GMT 2024
 */

package org.apache.commons.validator.routines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.validator.routines.TimeValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeValidator_ESTest extends TimeValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "8:21 PM", 2, 0, 0, 0, 0, 0, 0, 0);
      Calendar calendar0 = timeValidator0.validate("", "U8f+lLIksKU0b#v2R", (TimeZone) simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      Calendar calendar0 = timeValidator0.validate("", "1iel!=)k7");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(true, 12);
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      int int0 = timeValidator0.compareTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      TimeZone timeZone0 = TimeZone.getTimeZone("oBTE&;5!j*^cDa");
      Locale locale0 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      // Undeclared exception!
      try { 
        timeValidator0.compareHours(calendar0, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      Locale locale0 = Locale.CANADA;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "8:21 PM", 2, 0, 0, 0, 0, 0, 0, 0);
      Calendar calendar0 = timeValidator0.validate("8:21 PM", locale0, (TimeZone) simpleTimeZone0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=8:21 PM,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=2,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=8,HOUR_OF_DAY=?,MINUTE=21,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = timeValidator0.validate("1", "1", timeZone0);
      assertFalse(calendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeValidator timeValidator0 = new TimeValidator(true, 2953);
      Locale locale0 = Locale.forLanguageTag("Invalid field: ");
      Calendar calendar0 = timeValidator0.validate("1", "1", locale0, timeZone0);
      assertEquals(1, calendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      Locale locale0 = Locale.UK;
      Calendar calendar0 = timeValidator0.validate("YyEW4~#", "", locale0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      Locale locale0 = Locale.TAIWAN;
      Calendar calendar0 = timeValidator0.validate("3", "3", locale0);
      assertEquals(1, calendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      Calendar calendar0 = timeValidator0.validate("[", "[");
      assertEquals(1, calendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      Calendar calendar0 = timeValidator0.validate("8:21 PM");
      assertFalse(calendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(true, 12);
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, (-2877), 59, 0, 12);
      int int0 = timeValidator0.compareSeconds(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      int int0 = timeValidator0.compareSeconds(mockGregorianCalendar1, mockGregorianCalendar0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(true, 1309);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      int int0 = timeValidator0.compareHours(mockGregorianCalendar0, mockGregorianCalendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(false, 11);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(11, "z57?`3|p,x");
      // Undeclared exception!
      try { 
        timeValidator0.validate("z57?`3|p,x", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 11
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(false, 13);
      Locale locale0 = Locale.CHINESE;
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        timeValidator0.validate("lT:t", locale0, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 13
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(false, 1025);
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        timeValidator0.validate("$Bk/5&q:*loV=C.Py})", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 1025
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      // Undeclared exception!
      try { 
        timeValidator0.validate(";T5H#.\"<By", ";T5H#.\"<By", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      Locale locale0 = Locale.GERMANY;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-580), "-3c\"5");
      // Undeclared exception!
      try { 
        timeValidator0.validate("-3c\"5", "org.apache.commons.validator.routines.AbstractCalendarValidator", locale0, (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(false, 1826);
      // Undeclared exception!
      try { 
        timeValidator0.validate(".=]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 1826
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        timeValidator0.processParsedValue(mockGregorianCalendar0, (Format) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.TimeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      Locale locale0 = new Locale("");
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      // Undeclared exception!
      try { 
        timeValidator0.processParsedValue((Object) null, numberFormat0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.text.DecimalFormat cannot be cast to java.text.DateFormat
         //
         verifyException("org.apache.commons.validator.routines.TimeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 1513);
      // Undeclared exception!
      try { 
        timeValidator0.compareTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(true, (-546));
      // Undeclared exception!
      try { 
        timeValidator0.compareSeconds((Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-1155));
      // Undeclared exception!
      try { 
        timeValidator0.compareSeconds(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(true, 12);
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        timeValidator0.compareMinutes((Calendar) null, mockGregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator(false, 1);
      // Undeclared exception!
      try { 
        timeValidator0.compareTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.validator.routines.AbstractCalendarValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      int int0 = timeValidator0.compareMinutes(mockGregorianCalendar0, mockGregorianCalendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      Calendar calendar0 = timeValidator0.validate("");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)timeValidator0.processParsedValue((Object) null, dateFormat0);
      assertEquals(1, gregorianCalendar0.getFirstDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "8:21 PM", 2, 0, 0, 0, 0, 0, 0, 0);
      Calendar calendar0 = timeValidator0.validate("gregory", (TimeZone) simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      // Undeclared exception!
      try { 
        timeValidator0.validate("C7", "C7", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'C'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      // Undeclared exception!
      try { 
        timeValidator0.validate("org.apache.commons.validator.routines.AbstractFormatValidator", "org.apache.commons.validator.routines.AbstractFormatValidator");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = timeValidator0.validate("C;o", locale0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      Locale locale0 = Locale.ITALY;
      Calendar calendar0 = timeValidator0.validate("", locale0, (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeValidator timeValidator0 = TimeValidator.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      int int0 = timeValidator0.compareSeconds(mockGregorianCalendar0, mockGregorianCalendar0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeValidator timeValidator0 = new TimeValidator();
      Locale locale0 = Locale.GERMAN;
      TimeZone timeZone0 = TimeZone.getTimeZone("%}XsZ%]a&vgEnl(0UU");
      Calendar calendar0 = timeValidator0.validate("", "", locale0, timeZone0);
      assertNull(calendar0);
  }
}