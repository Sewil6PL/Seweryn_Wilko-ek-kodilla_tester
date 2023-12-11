package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {

    public static String displayStudentTeacherPairs(List<Student> students) {
        return students.stream()
                .map(student -> {
                    String teacherName = Optional.ofNullable(student.getTeacher())
                            .map(Teacher::getName)
                            .orElse("<undefined>");
                    return "Uczeń: " + student.getName() + ", Nauczyciel: " + teacherName;
                })
                .collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Anna Nowak", teacher2));
        students.add(new Student("Piotr Wiśniewski", null));

        String result = displayStudentTeacherPairs(students);
        System.out.println(result);
    }
}