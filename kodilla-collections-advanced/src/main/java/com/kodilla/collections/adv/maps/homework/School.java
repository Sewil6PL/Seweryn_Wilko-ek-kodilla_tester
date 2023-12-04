package com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsList;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.studentsList = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentsList() {
        return studentsList;
    }
    public void addStudentsList(int student){
        studentsList.add(student);
    }
    public int getTotalStudents() {
        int totalStudents = 0;
        for (int studentsList : studentsList){
            totalStudents += studentsList;
        }
        return totalStudents;
    }
}
