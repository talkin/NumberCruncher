package com.twu.refactoring;

public class CheckerNegative implements Checker{
    public  boolean check(int number) {
        return number < 0;
    }
}
