import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade (A-F): ");
        char grade = sc.next().charAt(0);

        switch (grade) {

            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;

            case 'B':
            case 'b':
                System.out.println("Good");
                break;

            case 'C':
            case 'c':
                System.out.println("Average");
                break;

            case 'D':
            case 'd':
                System.out.println("Below Average");
                break;

            case 'E':
            case 'e':
                System.out.println("Pass");
                break;

            case 'F':
            case 'f':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade.");
        }

        sc.close();
    }
}