package com.kodilla.collections.adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolDirectory = new HashMap<>();

        School school1 = new School("High School");
        school1.addStudentsList(100);
        school1.addStudentsList(120);
        schoolDirectory.put(school1, new Principal("John Doe"));

        School school2 = new School("Elementary School");
        school2.addStudentsList(90);
        school2.addStudentsList(100);
        schoolDirectory.put(school2, new Principal("Jane Smith"));

        School school3 = new School("Middle School");
        school3.addStudentsList(150);
        school3.addStudentsList(160);
        schoolDirectory.put(school3, new Principal("Bob Johnson"));

        System.out.println("Informacje o dyrektorach i szkołach:");
        for (Map.Entry<School, Principal> entry : schoolDirectory.entrySet()) {
            School school = entry.getKey();
            Principal principal = entry.getValue();

            System.out.println("Dyrektor: " + principal.getPrincipalName());
            System.out.println("Szkoła: " + school.getSchoolName());
            System.out.println("Liczba uczniów: " + school.getTotalStudents());
            System.out.println("------------------------");
        }
    }
}
