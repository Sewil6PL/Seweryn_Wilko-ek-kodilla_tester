package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void testDisplayStudentTeacherPairs() {
        // given
        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Anna Nowak", teacher2));
        students.add(new Student("Piotr Wiśniewski", null));

        // when
        String result = Application.displayStudentTeacherPairs(students);

        // then
        assertEquals("Uczeń: Jan Kowalski, Nauczyciel: Tomasz Nowak\n" +
                "Uczeń: Anna Nowak, Nauczyciel: Anna Kowalska\n" +
                "Uczeń: Piotr Wiśniewski, Nauczyciel: <undefined>", result);
    }

    @Test
    public void testDisplayStudentTeacherPairsEmptyList() {
        // given
        List<Student> students = new ArrayList<>();

        // when
        String result = Application.displayStudentTeacherPairs(students);

        // then
        assertEquals("", result);
    }
}
