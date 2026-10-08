public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

        // Number stored as a String
        String number = "123";

        try {
            // Convert String into integer
            int value = Integer.parseInt(number);

            System.out.println("Converted integer: " + value);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: The string does not contain a valid integer.");
        }
    }
}