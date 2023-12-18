package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    private final GamblingMachine gamblingMachine = new GamblingMachine();
    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    void shouldThrowInvalidNumbersExceptionForInvalidNumbers(String numbers) {
        Set<Integer> userNumbers = parseNumbers(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    void shouldThrowExceptionForInvalidNumbers(String numbers) {
        Set<Integer> userNumbers = parseNumbers(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    private Set<Integer> parseNumbers(String numbers) {
        String[] numbersArray = numbers.split(",");
        Set<Integer> parsedNumbers = new HashSet<>();
        for (String number : numbersArray) {
            parsedNumbers.add(Integer.parseInt(number));
        }
        return parsedNumbers;
    }
}