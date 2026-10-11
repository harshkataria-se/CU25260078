import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}

public class DrugDosageValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drugName = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            String input = sc.nextLine();

            double dosage = Double.parseDouble(input);

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Dosage must be between 1 mg and 1000 mg."
                );
            }

            System.out.println("\nDosage validated successfully.");
            System.out.println("Patient Name: " + patientName);
            System.out.println("Drug Name: " + drugName);
            System.out.println("Dosage: " + dosage + " mg");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric dosage.");
        }
        catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Dosage validation completed.");
            sc.close();
        }
    }
}