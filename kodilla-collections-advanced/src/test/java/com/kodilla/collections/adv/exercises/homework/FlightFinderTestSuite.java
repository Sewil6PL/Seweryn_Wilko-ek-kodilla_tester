package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        // given
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        // when
        List<Flight> result = flightFinder.findFlightsFrom("Paris");

        // then
        assertEquals(1, result.size());
        assertEquals("Paris", result.get(0).getDeparture());
    }

    @Test
    public void testFindFlightsTo() {
        // given
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        // when
        List<Flight> result = flightFinder.findFlightsTo("Los Angeles");

        // then
        assertEquals(1, result.size());
        assertEquals("Sydney", result.get(0).getDeparture());
    }

}