public class GenericThreeValuesDemo {

    public static <T> void display(T a, T b, T c) {
        System.out.println("First Value: " + a);
        System.out.println("Second Value: " + b);
        System.out.println("Third Value: " + c);
        System.out.println();
    }

    public static void main(String[] args) {
        display(10, 20, 30);
        display("Java", "Python", "C++");
        display(10.5, 20.5, 30.5);
    }
}