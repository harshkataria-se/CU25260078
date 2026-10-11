import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's marks: ");
            String input = sc.nextLine();

            int marks = Integer.parseInt(input);

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Marks: " + marks);

            if (marks >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric marks.");
        }
        catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Exam evaluation completed.");
            sc.close();
        }
    }
}