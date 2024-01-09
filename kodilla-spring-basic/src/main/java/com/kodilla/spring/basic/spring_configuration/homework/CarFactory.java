package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
@Configuration
public class CarFactory {
    @Bean
    public Car chooseCarForSeason() {
        LocalDateTime dateTime = LocalDateTime.now();
        int month = dateTime.getMonthValue();
        int hour = dateTime.getHour();
        boolean isNight = hour >= 20 || hour < 6;

        if (month >= 6 && month <= 8) {
            return new Cabrio(isNight);
        } else if (month >= 12 || month <= 2) {
            return new SUV(isNight);
        } else {
            return new Sedan(isNight);
        }
    }
}
