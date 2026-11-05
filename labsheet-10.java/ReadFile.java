import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            Scanner reader = new Scanner(file);

            System.out.println("Student File Contents:");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file does not exist.");
        }
    }
}