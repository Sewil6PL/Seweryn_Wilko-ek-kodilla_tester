package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightFinder {
    private List<Flight> flights;

    public FlightFinder(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {
        // Wyszukiwanie lotów z danego miasta
        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .toList();
    }

    public List<Flight> findFlightsTo(String arrival) {
        // Wyszukiwanie lotów do danego miasta
        return flights.stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .toList();
    }
}
