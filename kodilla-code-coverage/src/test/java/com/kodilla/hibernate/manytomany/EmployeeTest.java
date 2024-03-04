package com.kodilla.hibernate.manytomany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testGetId() {
        // Given
        Employee employee = new Employee();
        employee.setId(1);

        // When
        int id = employee.getId();

        // Then
        assertEquals(1, id);
    }

    @Test
    void testGetFirstname() {
        // Given
        String firstname = "John";
        Employee employee = new Employee(firstname, "Doe");

        // When
        String retrievedFirstname = employee.getFirstname();

        // Then
        assertEquals(firstname, retrievedFirstname);
    }

    @Test
    void testGetLastname() {
        // Given
        String lastname = "Doe";
        Employee employee = new Employee("John", lastname);

        // When
        String retrievedLastname = employee.getLastname();

        // Then
        assertEquals(lastname, retrievedLastname);
    }
}