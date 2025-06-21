package org.example;

public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public void markAsIncompleted() {
        isCompleted = false;
    }

    public String displayTString() {
        return (isCompleted ? "[x] " : "[ ] ") + description;
    }
}
