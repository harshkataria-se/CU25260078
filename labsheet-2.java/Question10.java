import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter starting year: ");
        int startYear = sc.nextInt();

        System.out.print("Enter ending year: ");
        int endYear = sc.nextInt();

        boolean leapYear;

        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (leapYear && year >= startYear && year <= endYear) {
            System.out.println(year +
                    " is a leap year and is within the given range.");
        } else {
            System.out.println(year +
                    " does not satisfy both conditions.");
        }

        sc.close();
    }
}