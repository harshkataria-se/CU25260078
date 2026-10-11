import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class HospitalPatientRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        try {
            System.out.print("Enter patient age: ");
            String input = sc.nextLine();

            int age = Integer.parseInt(input);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Patient age must be between 0 and 120."
                );
            }

            System.out.println("Patient registered successfully.");
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a numeric age.");
        }
        catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}