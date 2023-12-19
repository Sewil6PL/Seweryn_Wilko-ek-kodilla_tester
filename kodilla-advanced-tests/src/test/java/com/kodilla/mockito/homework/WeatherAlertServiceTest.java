package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class WeatherAlertServiceTest {
    @Mock
    private NotificationService notificationService;

    @InjectMocks
    private WeatherAlertService weatherAlertService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherAlertService = new WeatherAlertService(notificationService);
    }
    @Test
    void shouldSubscribePersonToLocation() {
        // Arrange
        Person person = new Person("John Doe");
        Location location = new Location("City A");

        // Act
        weatherAlertService.subscribe(person, location);

        // Assert
        assertSubscribed(person, location);
    }

    @Test
    void shouldUnsubscribePersonFromLocation() {
        // Arrange
        Person person = new Person("John Doe");
        Location location = new Location("City A");
        weatherAlertService.subscribe(person, location);

        // Act
        weatherAlertService.unsubscribe(person, location);

        // Assert
        assertUnsubscribed(person, location);
    }

    @Test
    void shouldUnsubscribePersonFromAllLocations() {
        // Arrange
        Person person = new Person("John Doe");
        Location locationA = new Location("City A");
        Location locationB = new Location("City B");
        weatherAlertService.subscribe(person, locationA);
        weatherAlertService.subscribe(person, locationB);

        // Act
        weatherAlertService.unsubscribeAll(person);

        // Assert
        assertUnsubscribed(person, locationA);
        assertUnsubscribed(person, locationB);
    }

    @Test
    void shouldSendAlertToSubscribedPersons() {
        // Arrange
        Location location = new Location("City A");
        Person person1 = new Person("John Doe");
        Person person2 = new Person("Jane Doe");
        weatherAlertService.subscribe(person1, location);
        weatherAlertService.subscribe(person2, location);

        // Act
        weatherAlertService.sendAlert(location, "Hailstorm approaching!");

        // Assert
        verify(notificationService, times(2)).notify(any(), eq("Hailstorm approaching!"));
    }

    @Test
    void shouldSendAlertToAllPersons() {
        // Arrange
        Person person1 = new Person("John Doe");
        Person person2 = new Person("Jane Doe");
        weatherAlertService.subscribe(person1, new Location("City A"));
        weatherAlertService.subscribe(person2, new Location("City B"));

        // Act
        weatherAlertService.sendAlertToAll("New regulations in effect!");

        // Assert
        verify(notificationService).notify(person1, "New regulations in effect!");
        verify(notificationService).notify(person2, "New regulations in effect!");
    }

    private void assertSubscribed(Person person, Location location) {
        assertTrue(weatherAlertService.isSubscribed(person, location));
    }

    private void assertUnsubscribed(Person person, Location location) {
        assertFalse(weatherAlertService.isSubscribed(person, location));
    }
}
