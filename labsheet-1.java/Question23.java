import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        int roundedFahrenheit = (int) fahrenheit;

        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Fahrenheit after type casting: "
                + roundedFahrenheit + "°F");

        sc.close();
    }
}