package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTaskApp {

    @Test
    public void testAddTask() {
        TaskList taskList = new TaskList();
        Task task = new Task("Test task");
        taskList.addTask(task);
        assert taskList.getTaskCount() == 1 : "Task count should be 1 after adding a task";
    }

    @Test
    public void testDisplayTasks() {
        TaskList taskList = new TaskList();
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        taskList.addTask(task1);
        taskList.addTask(task2);
        
        // Capture the output of displayTasks method
        String expectedOutput = "1: [ ] Task 1\n2: [ ] Task 2\n";
        String actualOutput = taskList.displayAll();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testClearTasks() {
        TaskList taskList = new TaskList();
        Task task1 = new Task("Task 1");
        taskList.addTask(task1);
        taskList.clearTasks();
        assert taskList.getTaskCount() == 0 : "Task count should be 0 after clearing tasks";
    }

    @Test
    public void testMarkTaskAsCompleted() {
        TaskList taskList = new TaskList();
        Task task = new Task("Test task");
        taskList.addTask(task);
        
        // Mark the task as completed
        task.markAsCompleted();
        
        // Check if the task is marked as completed
        assertEquals(true, task.isCompleted());
    }

    @Test
    public void emptyInputTest() {
        TaskList taskList = new TaskList();
        Task task = new Task(""); // Create a task with an empty description
        taskList.addTask(task); // Attempt to add the invalid task
        assertEquals(0, taskList.getTaskCount());
    }
}
