package org.example;

public class TaskApp {
    public static void main(String[] args) {
        TaskList taskList = new TaskList(); // Create a new task list
        Task task1 = new Task("Do homework"); // Create a new task
        Task task2 = new Task("Go to the gym"); // Create another task
        Task task3 = new Task("Go to the grocery"); // Create yet another task

        // Add some tasks to the list
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Display all tasks
        System.out.println("Current Tasks:");
        System.out.println(taskList.displayAll());

        // Mark the first task as completed
        task1.markAsCompleted();
        System.out.println("Marked first task as completed.");

        // Display completed tasks
        System.out.println("\nCompleted Tasks:");
        taskList.completedTasks();

        // Display incompleted tasks
        System.out.println("\nIncompleted Tasks:");
        taskList.incompletedTasks();

        task3.markAsCompleted(); // Mark the third task as completed
        System.out.println("Marked third task as completed.");

        // Display tasks again to see the changes
        System.out.println("\nUpdated Tasks:");
        System.out.println(taskList.displayAll());

        // Clear all tasks from the list
        taskList.clearTasks();
        System.out.println("\nAll tasks cleared.");

        // Display tasks after clearing
        System.out.println("Current Tasks after clearing:");
        taskList.displayAll();
        // Check the task count
        System.out.println("Total tasks after clearing: " + taskList.getTaskCount());
    }
}
