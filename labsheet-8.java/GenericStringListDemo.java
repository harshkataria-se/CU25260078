import java.util.ArrayList;

public class GenericStringListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohan");

        System.out.println("Original List: " + students);

        System.out.println("Student at index 2: " + students.get(2));

        students.set(1, "Ankit");
        System.out.println("After set(): " + students);

        students.remove("Neha");
        System.out.println("After remove(): " + students);

        System.out.println("Total Students: " + students.size());
    }
}