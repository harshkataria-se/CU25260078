import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Student Name: Harsh\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: BCA AI & ML\n");
            writer.write("Semester: 4th Semester\n");

            writer.close();

            System.out.println("File student.txt created successfully.");
            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}