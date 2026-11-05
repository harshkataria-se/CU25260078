import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohan");
        students.add("Ankit");
        students.add("Pooja");
        students.add("Karan");
        students.add("Sneha");
        students.add("Vikas");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}