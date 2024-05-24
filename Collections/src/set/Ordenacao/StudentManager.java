package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }

    public void addStudent(String name, Long id, double grade){
        students.add(new Student(name, id, grade));
    }

    public void removeStudent(long id){
        if (!this.students.isEmpty()) {
            students.removeIf(student -> student.getId() == id);
        }
    }

    public Set<Student> displayStudentsByName(){
        if (this.students.isEmpty()) {
            throw new IllegalStateException("The set is empty.");
        }
        Set<Student> studentsByName = new TreeSet<>(students);
        return studentsByName;
    }

    public Set<Student> displayStudentsByGrade(){
        if (this.students.isEmpty()) {
            throw new IllegalStateException("The set is empty.");
        }
        Set<Student> studentsByGrade = new TreeSet<>(new GradeComparator());
        studentsByGrade.addAll(students);
        return studentsByGrade;
    }

    public void displayStudents(){
        students.forEach(System.out::println);
    }
}
