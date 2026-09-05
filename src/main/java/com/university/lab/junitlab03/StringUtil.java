package com.university.lab.junitlab03;

public class StringUtil {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }
}