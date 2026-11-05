class Student<T, U, V> {
    private T id;
    private U name;
    private V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println();
    }
}

public class GenericStudent {
    public static void main(String[] args) {
        Student<Integer, String, Double> s1 =
                new Student<>(101, "Rahul", 85.5);

        Student<Integer, String, Double> s2 =
                new Student<>(102, "Priya", 92.0);

        Student<Integer, String, Double> s3 =
                new Student<>(103, "Amit", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}