package com.kodilla.jacoco;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        // given
        Year year = new Year(1600);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        Assertions.assertTrue(isLeapYear);
    }
}
