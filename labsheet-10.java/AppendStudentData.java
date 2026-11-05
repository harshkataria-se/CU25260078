import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendStudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            FileWriter writer = new FileWriter("students.txt", true);

            writer.write("Student Name: " + name + "\n");
            writer.write("Roll Number: " + rollNumber + "\n");
            writer.write("Marks: " + marks + "\n");
            writer.write("----------------------\n");

            writer.close();

            System.out.println("Student record appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}