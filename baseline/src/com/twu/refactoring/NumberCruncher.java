package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int count(Checker checker) {
        int count = 0;
        for (int number : numbers) {
            if (checker.check(number)) count++;
        }
        return count;
    }

}
