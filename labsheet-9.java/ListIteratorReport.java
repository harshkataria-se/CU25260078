import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorReport {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Data Structures");
        courses.add("Machine Learning");

        ListIterator<String> iterator = courses.listIterator();

        System.out.println("Courses in Forward Direction:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nCourses in Backward Direction:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println("\nIndex Demonstration:");

        System.out.println("Next Index: " + iterator.nextIndex());
        System.out.println("Previous Index: " + iterator.previousIndex());

        iterator.next();

        System.out.println("After Calling next():");
        System.out.println("Next Index: " + iterator.nextIndex());
        System.out.println("Previous Index: " + iterator.previousIndex());
    }
}