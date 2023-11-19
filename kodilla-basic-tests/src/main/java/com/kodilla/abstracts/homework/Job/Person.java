package com.kodilla.abstracts.homework.Job;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        job.displayJobDetails();
    }



    public static void main(String[] args) {
        Job doctorJob = new Doctor(5000, "Diagnosing and treating patients");
        Job teacherJob = new Teacher(3000, "Teaching students");

        Person person1 = new Person("John", 30, doctorJob);
        Person person2 = new Person("Mary", 25, teacherJob);

        System.out.println("Doctor first name: "+ person1.firstName);
        person1.displayResponsibilities();
        System.out.println("Doctor salary: " + doctorJob.getSalary());

        System.out.println("Teacher first name: " + person2.firstName);
        person2.displayResponsibilities();
        System.out.println("Teacher salary: " + teacherJob.getSalary());
    }
}