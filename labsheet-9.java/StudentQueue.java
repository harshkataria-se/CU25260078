import java.util.LinkedList;

public class StudentQueue {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addLast("Rahul");
        students.addLast("Amit");
        students.addLast("Priya");

        System.out.println("Initial Student Queue: " + students);

        students.addFirst("Harsh");
        System.out.println("After addFirst(): " + students);

        students.addLast("Neha");
        System.out.println("After addLast(): " + students);

        students.removeFirst();
        System.out.println("After removeFirst(): " + students);

        students.removeLast();
        System.out.println("After removeLast(): " + students);
    }
}