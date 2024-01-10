package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClockTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreateDifferentTimeInEachBean() throws InterruptedException {
        Clock firstClock = context.getBean(Clock.class);
        Thread.sleep(1000);  // czeka 1 sekundę
        Clock secondClock = context.getBean(Clock.class);

        assertNotEquals(firstClock.getTime(), secondClock.getTime());
    }
}