class Employee<T, U> {
    private T employeeId;
    private U employeeName;

    Employee(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

public class GenericEmployeeDemo {
    public static void main(String[] args) {
        Employee<Integer, String> emp = new Employee<>(101, "Rahul");

        emp.display();
    }
}