package org.example;
import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks; // Array to hold tasks
    private int taskCount; // Number of tasks currently in the list

    // Constructor to initialize the task list
    public TaskList() {
        tasks = new ArrayList<>();
        taskCount = 0; // Initialize task count to zero
    }

    // Method to add a task to the list
    public void addTask(Task task) { 
        if (task != null && !task.getDescription().isEmpty()) { // Check if the task is not null and has a description
            tasks.add(task); // Add the task to the list
            taskCount++; // Increase the task count
        } else {
            System.out.println("Cannot add a null task.");
        }
    }

    // Metghod to display all tasks in the list
    public String displayAll() {
        String taskListString = ""; // String to hold the task list
        if (taskCount == 0) {
            return "No tasks available."; // Return message if no tasks are present
        }
        for (int i = 0; i < taskCount; i++) {
            Task task = tasks.get(i); // Get the task at index i
            taskListString += (i + 1) + ": " + task.displayTString() + "\n"; // Append the task to the string
        }
        return taskListString; // Return the complete task list string
    }

    // Method to clear all tasks from the list
    public void clearTasks() {
        tasks = new ArrayList<>(); // Reset the task list
        taskCount = 0; // Reset the task count
    }

    public int getTaskCount() {
        return taskCount; // Return the current number of tasks
    }

    public Task getTask(int index) {
        if (index >= 0 && index < taskCount) {
            return tasks.get(index); // Return the task at the specified index
        } else {
            System.out.println("Invalid task index.");
            return null; // Return null if the index is invalid
        }
    }

    // Method to display completed tasks
    public void completedTasks () {
        String completedTasksString = ""; // String to hold completed tasks

        if (taskCount == 0) {
            System.out.println("No tasks available."); // Print message if no tasks are present
            return; // Exit the method if there are no tasks
        }

        for (int i = 0; i < taskCount; i++) {
            Task task = tasks.get(i); // Get the task at index i
            if (task.isCompleted()) { // Check if the task is completed
                completedTasksString += task.displayTString() + "\n"; // Append the completed task to the string
            }
        }
        System.out.println(completedTasksString.toString()); // Print the completed tasks
    }

    // Method to display incompleted tasks
    public void incompletedTasks() {
        String incompleteTasksString = ""; // String to hold incomplete tasks

        if (taskCount == 0) {
            System.out.println("No tasks available."); // Print message if no tasks are present
            return; // Exit the method if there are no tasks
        }

        for (int i = 0; i < taskCount; i++) {
            Task task = tasks.get(i); // Get the task at index i
            if (!task.isCompleted()) { // Check if the task is not completed
                incompleteTasksString += task.displayTString() + "\n"; // Append the incomplete task to the string
            }
        }
        System.out.println(incompleteTasksString.toString()); // Print the incomplete tasks
    }
}
