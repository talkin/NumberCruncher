package com.twu.refactoring;

public class CheckerEven implements Checker{
    public boolean check(int number) {
        return number % 2 == 0;
    }
}
