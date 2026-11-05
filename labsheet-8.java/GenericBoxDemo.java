class Box<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Double> doubleBox = new Box<>();

        intBox.setValue(100);
        stringBox.setValue("Hello Java");
        doubleBox.setValue(25.75);

        System.out.println("Integer Value: " + intBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());
        System.out.println("Double Value: " + doubleBox.getValue());
    }
}