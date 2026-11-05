import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorModification {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");

        System.out.println("Original List: " + students);

        ListIterator<String> iterator = students.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Amit")) {
                iterator.set("Harsh");
            }

            if (name.equals("Priya")) {
                iterator.add("Rohan");
            }
        }

        System.out.println("Modified List: " + students);

        System.out.println("Traversing Modified List:");

        ListIterator<String> newIterator = students.listIterator();

        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }
    }
}