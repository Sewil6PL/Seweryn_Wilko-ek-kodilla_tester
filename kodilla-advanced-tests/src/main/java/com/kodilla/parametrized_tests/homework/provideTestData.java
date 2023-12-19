package com.kodilla.parametrized_tests.homework;

import java.util.stream.Stream;

public class provideTestData {
    static Stream<Object[]> provideTestData() {
        return Stream.of(
                new Object[]{new Person(1.70, 50), "Very severely underweight"},
                new Object[]{new Person(1.70, 55), "Severely underweight"},
                new Object[]{new Person(1.70, 60), "Underweight"},
                new Object[]{new Person(1.70, 70), "Normal (healthy weight)"},
                new Object[]{new Person(1.70, 80), "Overweight"},
                new Object[]{new Person(1.70, 95), "Obese Class I (Moderately obese)"},
                new Object[]{new Person(1.70, 110), "Obese Class II (Severely obese)"},
                new Object[]{new Person(1.70, 130), "Obese Class III (Very severely obese)"},
                new Object[]{new Person(1.70, 150), "Obese Class IV (Morbidly Obese)"},
                new Object[]{new Person(1.70, 180), "Obese Class V (Super Obese)"},
                new Object[]{new Person(1.70, 200), "Obese Class VI (Hyper Obese)"}
        );
    }
}
