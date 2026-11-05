public class GenericMethodDemo {

    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        display(100);
        display(25.75);
        display("Hello Java");
        display('A');
    }
}