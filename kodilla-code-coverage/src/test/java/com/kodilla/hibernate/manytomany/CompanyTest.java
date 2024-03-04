package com.kodilla.hibernate.manytomany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompanyTest {

    @Test
    void testGetId() {
        // Given
        Company company = new Company();
        company.setId(1);

        // When
        int id = company.getId();

        // Then
        assertEquals(1, id);
    }

    @Test
    void testGetName() {
        // Given
        String name = "Test Company";
        Company company = new Company(name);

        // When
        String retrievedName = company.getName();

        // Then
        assertEquals(name, retrievedName);
    }
}