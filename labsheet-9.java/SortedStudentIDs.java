import java.util.TreeSet;

public class SortedStudentIDs {
    public static void main(String[] args) {
        TreeSet<Integer> studentIDs = new TreeSet<>();

        studentIDs.add(105);
        studentIDs.add(102);
        studentIDs.add(108);
        studentIDs.add(101);
        studentIDs.add(105);
        studentIDs.add(104);
        studentIDs.add(102);
        studentIDs.add(110);

        System.out.println("Unique Sorted Student IDs: " + studentIDs);

        System.out.println("First Student ID: " + studentIDs.first());
        System.out.println("Last Student ID: " + studentIDs.last());

        System.out.println("Higher than 105: " + studentIDs.higher(105));
        System.out.println("Lower than 105: " + studentIDs.lower(105));
    }
}