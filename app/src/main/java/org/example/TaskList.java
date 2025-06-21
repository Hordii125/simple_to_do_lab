package org.example;
import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (task != null && !task.getDescription().isEmpty()) {
            tasks.add(task);
        } else {
            System.out.println("Cannot add an empty task.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public String displayAll() {
        if (tasks.isEmpty()) {
            return "No tasks available.";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1)).append(": ").append(tasks.get(i).displayTString()).append("\n");
        }
        return sb.toString();
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public void clearTasks() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }
}
