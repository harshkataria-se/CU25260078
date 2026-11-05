import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class StudentCollectionManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> uniqueIDs = new HashSet<>();
        TreeSet<Integer> sortedIDs = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Collection Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Iterate Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (uniqueIDs.contains(id)) {
                        System.out.println("Student ID already exists!");
                    } else {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        students.add(new Student(id, name));
                        uniqueIDs.add(id);
                        sortedIDs.add(id);

                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeID = sc.nextInt();

                    boolean removed = false;
                    Iterator<Student> iterator = students.iterator();

                    while (iterator.hasNext()) {
                        Student s = iterator.next();

                        if (s.id == removeID) {
                            iterator.remove();
                            uniqueIDs.remove(removeID);
                            sortedIDs.remove(removeID);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchID = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.id == searchID) {
                            System.out.println("Student Found:");
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nStudent Records (ArrayList):");

                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }

                    System.out.println("\nUnique Student IDs (HashSet):");
                    System.out.println(uniqueIDs);

                    System.out.println("\nSorted Student IDs (TreeSet):");
                    System.out.println(sortedIDs);
                    break;

                case 5:
                    System.out.println("Total Students: " + students.size());
                    System.out.println("Unique IDs: " + uniqueIDs.size());
                    System.out.println("Sorted IDs: " + sortedIDs.size());
                    break;

                case 6:
                    ListIterator<Student> listIterator = students.listIterator();

                    System.out.println("\nForward Traversal:");
                    while (listIterator.hasNext()) {
                        listIterator.next().display();
                    }

                    System.out.println("\nBackward Traversal:");
                    while (listIterator.hasPrevious()) {
                        listIterator.previous().display();
                    }
                    break;

                case 7:
                    System.out.println("Exiting Student Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}