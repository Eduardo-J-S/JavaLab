package set.Ordenacao;

public class App {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("João", 123L, 7.5);
        manager.addStudent("Maria", 456L, 8.9);
        manager.addStudent("Pedro", 789L, 6.4);
        manager.addStudent("Mario", 789L, 6.4);

        System.out.println("All students:");
        manager.displayStudents();

        System.out.println("\nStudents by name:");
        System.out.println(manager.displayStudentsByName());

        System.out.println("\nStudents by grade:");
        System.out.println(manager.displayStudentsByGrade());

        manager.removeStudent(456L);
        System.out.println("\nAll students after removal:");
        manager.displayStudents();
    }
}
