package com.university.lab.junitlab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testPalindromeStandard() {
        StringUtil util = new StringUtil();
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeCaseInsensitive() {
        StringUtil util = new StringUtil();
        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    public void testNotPalindrome() {
        StringUtil util = new StringUtil();
        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    public void testNullOrEmptyString() {
        StringUtil util = new StringUtil();
        assertFalse(util.isPalindrome(null));
        assertTrue(util.isPalindrome(""));
    }
}