import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearching {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("BCA");
        courses.add("BBA");
        courses.add("B.Tech");
        courses.add("MCA");
        courses.add("MBA");

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Courses: " + courses);

        System.out.print("Enter course name to search: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println(course + " is available in the list.");
        } else {
            System.out.println(course + " is not available in the list.");
        }

        sc.close();
    }
}