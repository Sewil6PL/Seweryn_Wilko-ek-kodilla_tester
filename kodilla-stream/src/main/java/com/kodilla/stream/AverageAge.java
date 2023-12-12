package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.printf(String.valueOf(avg));

    }
}
