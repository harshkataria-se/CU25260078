import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWordInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        try {
            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Java is a programming language.\n");
            writer.write("Java is used for application development.\n");
            writer.write("Learning Java improves programming skills.");

            writer.close();

            System.out.print("Enter word to search: ");
            String searchWord = sc.next().toLowerCase();

            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("[^a-zA-Z0-9]+");

                for (String word : words) {
                    if (word.contains(searchWord)) {
                        count++;
                    }
                }
            }

            reader.close();

            if (count > 0) {
                System.out.println("Word found in the file.");
                System.out.println("Number of occurrences: " + count);
            } else {
                System.out.println("Word not found in the file.");
                System.out.println("Number of occurrences: 0");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}