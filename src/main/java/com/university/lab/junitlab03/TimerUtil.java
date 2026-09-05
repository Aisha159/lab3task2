package com.university.lab.junitlab03;

public class TimerUtil {
    public int secondsBetween(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("End < start");
        }
        return end - start;
    }
}