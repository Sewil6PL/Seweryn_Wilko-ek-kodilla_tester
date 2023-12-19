package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.provideTestData#provideTestData")
    public void shouldReturnCorrectBMICategory(Person person, String expectedCategory) {
        String result = person.getBMI();
        assertEquals(expectedCategory, result);
    }


}

