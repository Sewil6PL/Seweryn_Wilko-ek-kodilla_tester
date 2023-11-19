package com.kodilla.abstracts.homework.Job;

public abstract class Job {
    private double salary;
    private String responsibilities;

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
