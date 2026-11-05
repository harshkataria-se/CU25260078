import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CountFileData {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Java is a programming language.\n");
            writer.write("It is used for software development.\n");
            writer.write("Java supports object oriented programming.");

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();

                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    words += trimmedLine.split("\\s+").length;
                }
            }

            reader.close();

            System.out.println("File created and read successfully.");
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}