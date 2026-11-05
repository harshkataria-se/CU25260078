class Student<T> {
    private T studentId;

    Student(T studentId) {
        this.studentId = studentId;
    }

    void displayId() {
        System.out.println("Student ID: " + studentId);
    }
}

public class GenericStudentDemo {
    public static void main(String[] args) {
        Student<Integer> student = new Student<>(101);

        student.displayId();
    }
}