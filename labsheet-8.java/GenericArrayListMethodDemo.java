import java.util.ArrayList;

public class GenericArrayListMethodDemo {

    public static <T> void displayList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Neha");
        names.add("Rohan");

        System.out.println("Integer ArrayList:");
        displayList(numbers);

        System.out.println("String ArrayList:");
        displayList(names);
    }
}