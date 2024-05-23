public class Student implements Comparable<Student> {
    private String name;
    private long id;
    private double grade;

    public Student(String name, long id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", grade=" + grade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareToIgnoreCase(o.getName());
    }
}
