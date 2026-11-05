import java.util.ArrayList;
import java.util.Scanner;

class Student<T, U, V> {
    private T id;
    private U name;
    private V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    T getId() {
        return id;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("-------------------------");
    }
}

public class GenericStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student<Integer, String, Double>> students = new ArrayList<>();

        students.add(new Student<>(101, "Rahul", 85.5));
        students.add(new Student<>(102, "Amit", 78.0));
        students.add(new Student<>(103, "Priya", 92.5));
        students.add(new Student<>(104, "Neha", 88.0));
        students.add(new Student<>(105, "Rohan", 76.5));

        System.out.println("===== Student Management System =====");

        System.out.println("\nAll Student Records:");

        for (Student<Integer, String, Double> student : students) {
            student.display();
        }

        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            Student<Integer, String, Double> student = students.get(i);

            if (student.getId().equals(searchId)) {
                System.out.println("\nStudent Found:");
                student.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        System.out.println("Total Number of Students: " + students.size());

        System.out.println("\nType Safety Demonstration:");

        Student<Integer, String, Double> testStudent =
                new Student<>(106, "Ankit", 90.5);

        System.out.println("Valid student object created successfully.");

        sc.close();
    }
}