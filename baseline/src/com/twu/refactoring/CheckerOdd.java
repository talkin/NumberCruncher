package com.twu.refactoring;

public class CheckerOdd implements Checker{
    public boolean check(int number) {
        return number % 2 == 1;
    }
}
