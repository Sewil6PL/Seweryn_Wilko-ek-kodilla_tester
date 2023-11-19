package com.kodilla.abstracts.homework.Job;

public class Teacher extends Job {
    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Teacher responsibilities: " + getResponsibilities());
    }
}

