/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.validator.routines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.junit.jupiter.api.Test;

/**
 * Test Case for RegexValidatorTest.
 */
class RegexValidatorTest {

    private static final String REGEX = "^([abc]*)(?:\\-)([DEF]*)(?:\\-)([123]*)$";

    private static final String COMPONENT_1 = "([abc]{3})";
    private static final String COMPONENT_2 = "([DEF]{3})";
    private static final String COMPONENT_3 = "([123]{3})";
    private static final String SEPARATOR_1 = "(?:\\-)";
    private static final String SEPARATOR_2 = "(?:\\s)";
    private static final String REGEX_1 = "^" + COMPONENT_1 + SEPARATOR_1 + COMPONENT_2 + SEPARATOR_1 + COMPONENT_3 + "$";
    private static final String REGEX_2 = "^" + COMPONENT_1 + SEPARATOR_2 + COMPONENT_2 + SEPARATOR_2 + COMPONENT_3 + "$";
    private static final String REGEX_3 = "^" + COMPONENT_1 + COMPONENT_2 + COMPONENT_3 + "$";
    private static final String[] MULTIPLE_REGEX = { REGEX_1, REGEX_2, REGEX_3 };

    /**
     * Compare two arrays
     *
     * @param label  Label for the test
     * @param expect Expected array
     * @param result Actual array
     */
    private void checkArray(final String label, final String[] expect, final String[] result) {

        // Handle nulls
        if (expect == null || result == null) {
            if (expect == null && result == null) {
                return; // valid, both null
            }
            fail(label + " Null expect=" + expect + " result=" + result);
            return; // not strictly necessary, but prevents possible NPE below
        }

        // Check Length
        if (expect.length != result.length) {
            fail(label + " Length expect=" + expect.length + " result=" + result.length);
        }

        // Check Values
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i], result[i], label + " value[" + i + "]");
        }
    }

    /**
     * Test exceptions
     */
    @Test
    void testExceptions() {
        final String invalidRegex = "^([abCD12]*$";
        try {
            new RegexValidator(invalidRegex);
            fail("PatternSyntaxException should be raised.");
        } catch (final PatternSyntaxException e) {
            // expected
        }
    }

    @Test
    void testGetPatterns() {
        final RegexValidator regexValidator = new RegexValidator(MULTIPLE_REGEX);
        assertNotSame(regexValidator.getPatterns(), regexValidator.getPatterns());
        final Pattern[] patterns = regexValidator.getPatterns();
        assertEquals(REGEX_1, patterns[0].pattern());
        assertEquals(REGEX_2, patterns[1].pattern());
        assertEquals(REGEX_3, patterns[2].pattern());
    }

    /**
     * Test exceptions
     */
    @Test
    void testMissingRegex() {

        // Single Regular Expression - null
        try {
            new RegexValidator((String) null);
            fail("Single Null - expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals( "Regular expression[0] is missing", e.getMessage(),"Single Null");
        }

        // Single Regular Expression - Zero Length
        try {
            new RegexValidator("");
            fail("Single Zero Length - expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals( "Regular expression[0] is missing", e.getMessage(), "Single Zero Length");
        }

        // Multiple Regular Expression - Null array
        try {
            new RegexValidator((String[]) null);
            fail("Null Array - expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals( "Regular expressions are missing", e.getMessage(),"Null Array");
        }

        // Multiple Regular Expression - Zero Length array
        try {
            new RegexValidator();
            fail("Zero Length Array - expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals( "Regular expressions are missing", e.getMessage(),"Zero Length Array");
        }

        // Multiple Regular Expression - Array has Null
        String[] expressions = { "ABC", null };
        try {
            new RegexValidator(expressions);
            fail("Array has Null - expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals( "Regular expression[1] is missing",e.getMessage(), "Array has Null");
        }

        // Multiple Regular Expression - Array has Zero Length
        expressions = new String[] { "", "ABC" };
        try {
            new RegexValidator(expressions);
            fail("Array has Zero Length - expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals( "Regular expression[0] is missing", e.getMessage(),"Array has Zero Length");
        }
    }

    /**
     * Test with multiple regular expressions (case in-sensitive).
     */
    @Test
    void testMultipleInsensitive() {

        // Set up In-sensitive Validators
        final RegexValidator multiple = new RegexValidator(MULTIPLE_REGEX, false);
        final RegexValidator single1 = new RegexValidator(REGEX_1, false);
        final RegexValidator single2 = new RegexValidator(REGEX_2, false);
        final RegexValidator single3 = new RegexValidator(REGEX_3, false);

        // Set up test values
        String value = "AAC FDE 321";
        final String expect = "AACFDE321";
        final String[] array = { "AAC", "FDE", "321" };

        // isValid()
        assertEquals(true, multiple.isValid(value), "isValid() Multiple");
        assertEquals(false, single1.isValid(value), "isValid() 1st");
        assertEquals(true, single2.isValid(value), "isValid() 2nd");
        assertEquals(false, single3.isValid(value), "isValid() 3rd");

        // validate()
        assertEquals(expect, multiple.validate(value), "validate() Multiple");
        assertEquals(null, single1.validate(value), "validate() 1st");
        assertEquals(expect, single2.validate(value), "validate() 2nd");
        assertEquals(null, single3.validate(value), "validate() 3rd");

        // match()
        checkArray("match() Multiple", array, multiple.match(value));
        checkArray("match() 1st", null, single1.match(value));
        checkArray("match() 2nd", array, single2.match(value));
        checkArray("match() 3rd", null, single3.match(value));

        // All invalid
        value = "AAC*FDE*321";
        assertEquals(false, multiple.isValid(value), "isValid() Invalid");
        assertEquals(null, multiple.validate(value), "validate() Invalid");
        assertEquals(null, multiple.match(value), "match() Multiple");
    }

    /**
     * Test with multiple regular expressions (case sensitive).
     */
    @Test
    void testMultipleSensitive() {

        // Set up Sensitive Validators
        final RegexValidator multiple = new RegexValidator(MULTIPLE_REGEX);
        final RegexValidator single1 = new RegexValidator(REGEX_1);
        final RegexValidator single2 = new RegexValidator(REGEX_2);
        final RegexValidator single3 = new RegexValidator(REGEX_3);

        // Set up test values
        String value = "aac FDE 321";
        final String expect = "aacFDE321";
        final String[] array = { "aac", "FDE", "321" };

        // isValid()
        assertEquals(true, multiple.isValid(value), "Sensitive isValid() Multiple");
        assertEquals(false, single1.isValid(value), "Sensitive isValid() 1st");
        assertEquals(true, single2.isValid(value), "Sensitive isValid() 2nd");
        assertEquals(false, single3.isValid(value), "Sensitive isValid() 3rd");

        // validate()
        assertEquals(expect, multiple.validate(value), "Sensitive validate() Multiple");
        assertEquals(null, single1.validate(value), "Sensitive validate() 1st");
        assertEquals(expect, single2.validate(value), "Sensitive validate() 2nd");
        assertEquals(null, single3.validate(value), "Sensitive validate() 3rd");

        // match()
        checkArray("Sensitive match() Multiple", array, multiple.match(value));
        checkArray("Sensitive match() 1st", null, single1.match(value));
        checkArray("Sensitive match() 2nd", array, single2.match(value));
        checkArray("Sensitive match() 3rd", null, single3.match(value));

        // All invalid
        value = "AAC*FDE*321";
        assertEquals(false, multiple.isValid(value), "isValid() Invalid");
        assertEquals(null, multiple.validate(value), "validate() Invalid");
        assertEquals(null, multiple.match(value), "match() Multiple");
    }

    /**
     * Test Null value
     */
    @Test
    void testNullValue() {

        final RegexValidator validator = new RegexValidator(REGEX);
        assertEquals(false, validator.isValid(null), "Instance isValid()");
        assertEquals(null, validator.validate(null), "Instance validate()");
        assertEquals(null, validator.match(null), "Instance match()");
    }

    /**
     * Test instance methods with single regular expression.
     */
    @Test
    void testSingle() {
        final RegexValidator sensitive = new RegexValidator(REGEX);
        final RegexValidator insensitive = new RegexValidator(REGEX, false);

        // isValid()
        assertEquals(true, sensitive.isValid("ac-DE-1"), "Sensitive isValid() valid");
        assertEquals(false, sensitive.isValid("AB-de-1"), "Sensitive isValid() invalid");
        assertEquals(true, insensitive.isValid("AB-de-1"), "Insensitive isValid() valid");
        assertEquals(false, insensitive.isValid("ABd-de-1"), "Insensitive isValid() invalid");

        // validate()
        assertEquals( "acDE1", sensitive.validate("ac-DE-1"),"Sensitive validate() valid");
        assertEquals(null, sensitive.validate("AB-de-1"), "Sensitive validate() invalid");
        assertEquals( "ABde1", insensitive.validate("AB-de-1"),"Insensitive validate() valid");
        assertEquals(null, insensitive.validate("ABd-de-1"), "Insensitive validate() invalid");

        // match()
        checkArray("Sensitive match() valid", new String[] { "ac", "DE", "1" }, sensitive.match("ac-DE-1"));
        checkArray("Sensitive match() invalid", null, sensitive.match("AB-de-1"));
        checkArray("Insensitive match() valid", new String[] { "AB", "de", "1" }, insensitive.match("AB-de-1"));
        checkArray("Insensitive match() invalid", null, insensitive.match("ABd-de-1"));
        assertEquals( "ABC", new RegexValidator("^([A-Z]*)$").validate("ABC"), "validate one");
        checkArray("match one", new String[] { "ABC" }, new RegexValidator("^([A-Z]*)$").match("ABC"));
    }

    /**
     * Test toString() method
     */
    @Test
    void testToString() {
        final RegexValidator single = new RegexValidator(REGEX);
        assertEquals(single.toString(), "RegexValidator{" + REGEX + "}", "Single");

        final RegexValidator multiple = new RegexValidator(REGEX, REGEX);
        assertEquals(multiple.toString(), "RegexValidator{" + REGEX + "," + REGEX + "}", "Multiple");
    }

}
