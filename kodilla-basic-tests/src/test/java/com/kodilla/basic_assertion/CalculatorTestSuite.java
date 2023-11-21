package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
        int exponentiationResult = calculator.exponentiation(a, b);
        assertEquals(390625, exponentiationResult);
    }

    @Test
    public void testsubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testExponentiation() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = -2;
        int d = 0;
        int exponentiationResult = calculator.exponentiation(a, b);
        assertEquals(390625, exponentiationResult);
        int exponentiationResult2 = calculator.exponentiation(c, b);
        assertEquals(256, exponentiationResult2);
        int exponentiationResult3 = calculator.exponentiation(a, d);
        assertEquals(1, exponentiationResult3);
    }
}
