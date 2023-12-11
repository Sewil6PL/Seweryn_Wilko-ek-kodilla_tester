package com.kodilla.stream;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {

        // when
        List<String> resultUsernames = UsersManager.filterChemistGroupUsernames();

        // then
        List<String> expectedUsernames = Arrays.asList("Walter White", "Gale Boetticher");
        assertEquals(expectedUsernames, resultUsernames);
    }

    @Test
    public void testFilterUsersOlderThan() {
        // given
        int ageThreshold = 30;
        List<User> users = UsersRepository.getUsersList();

        // when
        List<User> resultUsers = UsersManager.filterUsersOlderThan(users, ageThreshold);

        // then
        assertEquals(5, resultUsers.size());
        for (User user : resultUsers) {
            assertTrue(user.getAge() > ageThreshold);
        }
    }

    @Test
    public void testFilterUsersOlderThanWithEmptyList() {
        // given
        int ageThreshold = 30;
        List<User> users = List.of(); // empty list

        // when
        List<User> resultUsers = UsersManager.filterUsersOlderThan(users, ageThreshold);

        // then
        assertEquals(0, resultUsers.size());
    }

    @Test
    public void testFilterUsersOlderThanWithNoMatchingUsers() {
        // given
        int ageThreshold = 60;
        List<User> users = UsersRepository.getUsersList();

        // when
        List<User> resultUsers = UsersManager.filterUsersOlderThan(users, ageThreshold);

        // then
        assertEquals(0, resultUsers.size());
    }
}