package com.kodilla.abstracts.homework.Job;

public class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Doctor responsibilities: " + getResponsibilities());
    }
}

