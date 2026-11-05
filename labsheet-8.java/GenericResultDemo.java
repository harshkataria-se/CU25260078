class Result<T> {
    private T marks;

    void setMarks(T marks) {
        this.marks = marks;
    }

    T getMarks() {
        return marks;
    }
}

public class GenericResultDemo {
    public static void main(String[] args) {
        Result<Integer> result1 = new Result<>();
        Result<Double> result2 = new Result<>();

        result1.setMarks(85);
        result2.setMarks(92.5);

        System.out.println("Integer Marks: " + result1.getMarks());
        System.out.println("Double Marks: " + result2.getMarks());
    }
}