package com.kodilla.abstracts.homework.Job;

public abstract class Job {
    private final double salary;
    private final String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public abstract void displayJobDetails();

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}
