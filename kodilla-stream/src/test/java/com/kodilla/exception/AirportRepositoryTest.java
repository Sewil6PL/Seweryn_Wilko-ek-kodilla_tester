package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTest {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsaw = airportRepository.isAirportsInUse("Warsaw");
        //then
        assertTrue(isWarsaw);
    }

    @Test
    public void testIsAirpirtInuse_withException(){
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        //then
        assertThrows(AirportNotFoundException.class, () ->airportRepository.isAirportsInUse("Vienna"));
    }
}
