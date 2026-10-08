import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Enter number of visitors entering the store: ");
        int entering = sc.nextInt();

        for (int i = 0; i < entering; i++) {
            ++visitors;   // Prefix increment
        }

        System.out.println("Visitors after entering: " + visitors);

        System.out.print("Enter number of visitors leaving the store: ");
        int leaving = sc.nextInt();

        for (int i = 0; i < leaving; i++) {
            visitors--;   // Postfix decrement
        }

        System.out.println("Visitors remaining in store: " + visitors);

        sc.close();
    }
}