package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {


    @Test
    public void testFilterChemistGroupUsernames() {

        // when
        List<String> resultUsernames = UsersManager.filterChemistGroupUsernames();

        // then
        List<String> expectedUsernames = Arrays.asList("Walter White", "Gale Boetticher");
        assertEquals(expectedUsernames, resultUsernames);
    }
    //int ageThreshold = 40;
    //List<User> resultUsers = UsersManager.filterUsersOlderThan(null, ageThreshold);
       // private assertEquals(2,resultUsers.size());
        //for (User user ; resultUsers) {
        //ssertTrue(user.getAge() > ageThreshold);
    }
