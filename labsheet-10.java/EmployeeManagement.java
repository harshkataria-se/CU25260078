import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");
            FileWriter writer = new FileWriter(file, true);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            writer.write("Employee ID: " + id + "\n");
            writer.write("Employee Name: " + name + "\n");
            writer.write("Department: " + department + "\n");
            writer.write("Salary: " + salary + "\n");
            writer.write("-----------------------------\n");

            writer.close();

            System.out.println("\nEmployee record saved successfully.");

            System.out.print("\nEnter Employee ID to search: ");
            int searchID = sc.nextInt();

            if (!file.exists()) {
                System.out.println("Error: employees.txt file does not exist.");
            } else {
                BufferedReader reader = new BufferedReader(new FileReader(file));

                String line;
                StringBuilder record = new StringBuilder();
                boolean found = false;

                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Employee ID: ")) {
                        record.setLength(0);

                        if (line.equals("Employee ID: " + searchID)) {
                            found = true;
                            record.append(line).append("\n");
                        } else {
                            found = false;
                        }
                    } else if (found) {
                        record.append(line).append("\n");

                        if (line.startsWith("----------------")) {
                            System.out.println("\nEmployee Record Found:");
                            System.out.print(record);
                            break;
                        }
                    }
                }

                reader.close();

                if (!found) {
                    System.out.println("Employee record not found.");
                }
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }

        sc.close();
    }
}