class Container<T> {
    private T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericContainerDemo {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        Container<String> stringContainer = new Container<>();
        Container<Double> doubleContainer = new Container<>();

        intContainer.add(100);
        stringContainer.add("Hello Java");
        doubleContainer.add(25.75);

        System.out.println("Integer Value: " + intContainer.get());
        System.out.println("String Value: " + stringContainer.get());
        System.out.println("Double Value: " + doubleContainer.get());
    }
}