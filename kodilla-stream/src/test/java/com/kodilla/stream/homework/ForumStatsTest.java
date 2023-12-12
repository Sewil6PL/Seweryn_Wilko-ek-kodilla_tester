package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    void testCalculateAveragePostsForUsersAbove40() {
        // given
        List<User> testUsers = Arrays.asList(
                new User("User1", 45, 5),
                new User("User2", 50, 10),
                new User("User3", 42, 8)
                // Add more test users as needed
        );

        // when
        double result = ForumStats.calculateAveragePostsForUsersAbove40(testUsers);

        // then
        assertEquals(7.67, result, 0.01); // Adjust delta based on expected result
    }

    @Test
    void testCalculateAveragePostsForUsersBelow40() {
        // given
        List<User> testUsers = Arrays.asList(
                new User("User4", 30, 3),
                new User("User5", 35, 6),
                new User("User6", 38, 4)
                // Add more test users as needed
        );

        // when
        double result = ForumStats.calculateAveragePostsForUsersBelow40(testUsers);

        // then
        assertEquals(4.33, result, 0.01); // Adjust delta based on expected result
    }
}