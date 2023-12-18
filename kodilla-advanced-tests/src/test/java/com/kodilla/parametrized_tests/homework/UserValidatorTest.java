package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private final UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"john_doe", "JaneDoe123", "user-123", "a.b_c"})
    void shouldValidateCorrectUsernames(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jo", "a@b", "user@domain@com", "@user123", "user!name"})
    void shouldNotValidateIncorrectUsernames(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@example.com", "john.doe@company.co.uk", "123@email.org"})
    void shouldValidateCorrectEmails(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@.com", "john.doe@company", "123@.org", "invalid-email"})
    void shouldNotValidateIncorrectEmails(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

}