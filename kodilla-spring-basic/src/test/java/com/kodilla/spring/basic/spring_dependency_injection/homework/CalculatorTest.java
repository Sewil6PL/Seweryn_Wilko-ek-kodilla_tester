package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void shouldAddTwoNumbers() {
        calculator.add(3.0, 5.0);
        // Oczekuj na rezultat w konsoli
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        calculator.subtract(8.0, 3.0);
        // Oczekuj na rezultat w konsoli
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        calculator.multiply(4.0, 6.0);
        // Oczekuj na rezultat w konsoli
    }

    @Test
    public void shouldDivideTwoNumbers() {
        calculator.divide(9.0, 3.0);
        // Oczekuj na rezultat w konsoli
    }

    @Test
    public void shouldHandleDivisionByZero() {
        calculator.divide(7.0, 0.0);
        // Oczekuj na rezultat w konsoli
    }

}