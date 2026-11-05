import java.util.HashSet;

public class UniqueDepartments {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();

        departments.add("Computer Science");
        departments.add("Mechanical");
        departments.add("Electrical");
        departments.add("Civil");
        departments.add("Computer Science");
        departments.add("Mechanical");
        departments.add("AI & ML");

        System.out.println("Unique Departments:");

        for (String department : departments) {
            System.out.println(department);
        }

        System.out.println("Total Unique Departments: " + departments.size());
    }
}