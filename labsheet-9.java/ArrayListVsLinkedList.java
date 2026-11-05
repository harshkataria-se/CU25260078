import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Machine Learning");

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("Machine Learning");

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        arrayList.add(1, "JavaScript");
        linkedList.add(1, "JavaScript");

        System.out.println("\nAfter Insertion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.remove("Python");
        linkedList.remove("Python");

        System.out.println("\nAfter Deletion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\nGet Element at Index 2:");
        System.out.println("ArrayList: " + arrayList.get(2));
        System.out.println("LinkedList: " + linkedList.get(2));

        System.out.println("\nCollection Sizes:");
        System.out.println("ArrayList Size: " + arrayList.size());
        System.out.println("LinkedList Size: " + linkedList.size());

        System.out.println("\nArrayList Iteration:");
        for (String course : arrayList) {
            System.out.println(course);
        }

        System.out.println("\nLinkedList Iteration:");
        for (String course : linkedList) {
            System.out.println(course);
        }
    }
}