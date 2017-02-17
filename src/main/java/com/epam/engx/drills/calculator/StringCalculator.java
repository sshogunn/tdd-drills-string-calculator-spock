package com.epam.engx.drills.calculator;

import java.util.Arrays;

public class StringCalculator {
    public int calculate(String input) {
        if (!input.isEmpty()) {
            if (input.length() == 1) {
                return parseOneNumber(input);
            }
            return sumOfNumbers(input);
        }
        return 0;
    }

    private int parseOneNumber(String input) {
        return Integer.valueOf(input);
    }

    private int sumOfNumbers(String input) {
        String[] numbers = input.split(",|\n");
        return Arrays.stream(numbers).mapToInt(Integer::valueOf).sum();
    }
}
