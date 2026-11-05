import java.util.ArrayList;
import java.util.Scanner;

public class GenericListSearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        System.out.println("ArrayList: " + numbers);

        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();

        if (numbers.contains(num)) {
            System.out.println(num + " exists in the ArrayList.");
        } else {
            System.out.println(num + " does not exist in the ArrayList.");
        }

        sc.close();
    }
}