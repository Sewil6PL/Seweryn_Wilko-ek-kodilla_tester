package com.kodilla.collections.adv.exercises.homework;

import java.util.Arrays;
import java.util.List;

public class FlightRepository{
    public static List<Flight> getFlightsTable() {
        return Arrays.asList(
                new Flight("Warsaw", "Berlin"),
                new Flight("Berlin", "Paris"),
                new Flight("Paris", "London"),
                new Flight("London", "New York"),
                new Flight("New York", "Tokyo"),
                new Flight("Tokyo", "Sydney"),
                new Flight("Sydney", "Los Angeles"),
                new Flight("Los Angeles", "San Francisco"),
                new Flight("San Francisco", "Chicago"),
                new Flight("Chicago", "Warsaw")
        );
    }
}
