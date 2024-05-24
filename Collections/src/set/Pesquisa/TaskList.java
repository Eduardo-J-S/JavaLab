package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;
//import java.util.stream.Collectors;

public class TaskList {
    private Set<Task> tasks;

    public TaskList() {
        this.tasks = new HashSet<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    // public void removeTask(String description) {
    // tasks.removeIf(task ->
    // task.getDescription().equalsIgnoreCase(description));
    // }

    public void removeTask(String description) {
        if (!this.tasks.isEmpty()) {
            for (Task task : tasks) {
                if (task.getDescription().equalsIgnoreCase(description)) {
                    tasks.remove(task);
                    return;
                }
            }
            System.out.println("Task not found: " + description);
        } else {
            System.out.println("The set is empty.");
        }
    }

    public void displayTasks() {
        if (this.tasks.isEmpty()) {
            throw new IllegalStateException("The set is empty.");
        }
        System.out.println(tasks);
    }

    public int countTasks() {
        return tasks.size();
    }

    // public Set<Task> getCompletedTasks() {
    // return tasks.stream()
    // .filter(Task::isCompleted)
    // .collect(Collectors.toSet());
    // }

    // public Set<Task> getPendingTasks() {
    // return tasks.stream()
    // .filter(task -> !task.isCompleted())
    // .collect(Collectors.toSet());
    // }

    public Set<Task> getCompletedTasks() {
        Set<Task> completedTasks = new HashSet<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public Set<Task> getPendingTasks() {
        Set<Task> pendingTasks = new HashSet<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public void markTaskAsCompleted(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setCompleted(true);
                return;
            }
        }
        System.out.println("Task not found: " + description);
    }

    public void markTaskAsPending(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setCompleted(false);
                return;
            }
        }
        System.out.println("Task not found: " + description);
    }

    public void clearTaskList() {
        tasks.clear();
    }

}