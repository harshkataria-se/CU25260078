import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        try {
            FileWriter writer = new FileWriter("input.txt");

            writer.write("Java Programming 123");
            writer.write("\nHello World 456");

            writer.close();

            FileReader reader = new FileReader("input.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                char character = Character.toLowerCase((char) ch);

                if (character >= 'a' && character <= 'z') {
                    if (character == 'a' || character == 'e' ||
                        character == 'i' || character == 'o' ||
                        character == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (character >= '0' && character <= '9') {
                    digits++;
                } else if (character == ' ') {
                    spaces++;
                }
            }

            reader.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Consonants: " + consonants);
            System.out.println("Total Digits: " + digits);
            System.out.println("Total Spaces: " + spaces);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}