package com.kodilla.mockito.homework;

public class NotificationService {
    public void notify(Person person, String message) {
        System.out.println("Notifying " + person.getName() + ": " + message);
    }
}
