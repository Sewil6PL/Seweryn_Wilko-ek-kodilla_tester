package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @BeforeEach
    void setUp() {
        TaskList taskList1 = new TaskList("ToDo", "Tasks to do");
        TaskList taskList2 = new TaskList("InProgress", "Tasks in progress");
        TaskList taskList3 = new TaskList("Done", "Completed tasks");

        taskListRepository.save(taskList1);
        taskListRepository.save(taskList2);
        taskListRepository.save(taskList3);
    }

    @AfterEach
    void tearDown() {
        taskListRepository.deleteAll();
    }

    @Test
    void testFindByListName() {
        // Given
        String listName = "ToDo";

        // When
        List<TaskList> foundTaskLists = taskListRepository.findByListName(listName);

        // Then
        assertEquals(1, foundTaskLists.size());
        assertEquals(listName, foundTaskLists.get(0).getListName());
    }
}