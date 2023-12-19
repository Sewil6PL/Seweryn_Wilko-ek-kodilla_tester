package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherAlertService {
    private final Map<Person, Set<Location>> subscriptions = new HashMap<>();
    private final Set<Person> allSubscribers = new HashSet<>();
    private final NotificationService notificationService;

    public WeatherAlertService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void subscribe(Person person, Location location) {
        subscriptions.computeIfAbsent(person, k -> new HashSet<>()).add(location);
        allSubscribers.add(person);
    }

    public void unsubscribe(Person person, Location location) {
        subscriptions.computeIfPresent(person, (k, v) -> {
            v.remove(location);
            return v.isEmpty() ? null : v;
        });
    }

    public void unsubscribeAll(Person person) {
        subscriptions.remove(person);
        allSubscribers.remove(person);
    }

    public void sendAlert(Location location, String message) {
        Set<Person> subscribers = subscriptions.entrySet().stream()
                .filter(entry -> entry.getValue().contains(location))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        subscribers.forEach(person -> notificationService.notify(person, message));
    }

    public void sendAlertToAll(String message) {
        allSubscribers.forEach(person -> notificationService.notify(person, message));
    }

    public void removeLocation(Location location) {
        subscriptions.values().forEach(locations -> locations.remove(location));
    }

    public boolean isSubscribed(Person person, Location location) {
        return subscriptions.getOrDefault(person, Collections.emptySet()).contains(location);
    }
}
