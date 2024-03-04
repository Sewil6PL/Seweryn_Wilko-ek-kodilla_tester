package com.kodilla;

import com.kodilla.hibernate.tasklist.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    private Task task;

    @Mock
    private TaskList taskList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        task = new Task();
    }

    @Test
    void testGetTasks() {
        // Given
        Task task1 = new Task();
        Task task2 = new Task();
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        task.setTasks(tasks);

        // When
        List<Task> retrievedTasks = task.getTasks();

        // Then
        assertEquals(2, retrievedTasks.size());
    }

    @Test
    void testSetAndGetTaskList() {
        // Given
        task.setTaskList(taskList);

        // When
        TaskList retrievedTaskList = task.getTaskList();

        // Then
        assertEquals(taskList, retrievedTaskList);
    }

    @Test
    void testSetAndGetDuration() {
        // Given
        int duration = 5;
        task.setDuration(duration);

        // When
        int retrievedDuration = task.getDuration();

        // Then
        assertEquals(duration, retrievedDuration);
    }

    // Add more tests for other methods as needed
}