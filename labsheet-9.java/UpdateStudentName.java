import java.util.ArrayList;

public class UpdateStudentName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohan");

        System.out.println("Original Student List: " + students);

        students.set(1, "Harsh");
        students.remove(3);

        System.out.println("Updated Student List: " + students);
    }
}