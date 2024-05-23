public class App {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        try {
            taskList.addTask("Task 1");
            taskList.addTask("Task 2");
            taskList.addTask("Task 3");
            taskList.displayTasks();
            
            taskList.removeTask("Task");
    
            taskList.removeTask("Task 1");

            taskList.displayTasks();
            System.out.println("----------------------------------");
            System.out.println(taskList.countTasks());

            taskList.markTaskAsCompleted("Task 1");

            taskList.markTaskAsCompleted("Task 2");

            System.out.println(taskList.getCompletedTasks());
            System.out.println(taskList.getPendingTasks());

            taskList.markTaskAsPending("Task 1");

            System.out.println(taskList.getCompletedTasks());
            System.out.println(taskList.getPendingTasks());

            taskList.clearTaskList();

            
            taskList.displayTasks();
            
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}