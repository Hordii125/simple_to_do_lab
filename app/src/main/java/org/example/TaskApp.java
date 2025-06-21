package org.example;

import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        TaskList taskList = new TaskList(); // TaskList to manage tasks
        boolean running = true; // Control variable for the main loop

        // Main loop for the application
        while (running) {
            System.out.println("\n------------ MENU ------------");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Mark Task as Complete");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // Check if the input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 to 5.");
                scanner.nextLine(); // Clears invalid input
                continue;
            }

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumes newline

            // Process the user's choice
            if (choice == 1) {
                System.out.print("Enter description: ");
                String desc = scanner.nextLine();
                if (desc.trim().isEmpty()) {
                    System.out.println("Description cannot be empty.");
                } else {
                    Task task = new Task(desc);
                    taskList.addTask(task);
                    System.out.println("Task added.");
                }

            } else if (choice == 2) {
                System.out.println("\nAll Tasks:");
                System.out.println(taskList.displayAll());

            } else if (choice == 3) {
                if (taskList.getTaskCount() == 0) {
                    System.out.println("No tasks to remove.");
                } else {
                    System.out.print("Enter task index to remove: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid index.");
                        scanner.nextLine();
                    } else {
                        int indexToRemove = scanner.nextInt() - 1;
                        scanner.nextLine();
                        taskList.removeTask(indexToRemove);
                    }
                }

            } else if (choice == 4) {
                if (taskList.getTaskCount() == 0) {
                    System.out.println("No tasks to mark.");
                } else {
                    System.out.print("Enter task index to mark as complete: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid index.");
                        scanner.nextLine();
                    } else {
                        int indexToComplete = scanner.nextInt() - 1;
                        scanner.nextLine();
                        taskList.markTaskComplete(indexToComplete);
                    }
                }

            } else if (choice == 5) {
                running = false;
                System.out.println("Exiting...");

            } else {
                System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }

        scanner.close();
    }
}
