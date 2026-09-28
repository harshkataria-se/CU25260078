class Employee {
    String name;
    double salary;

    static String organization = "ABC Technologies";

    void compareSalary(Employee other) {
        String employee1 = this.name;
        String employee2 = other.name;

        double salary1 = this.salary;
        double salary2 = other.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2) {
            System.out.println(employee1 + " has a higher salary.");
        } else if (salary2 > salary1) {
            System.out.println(employee2 + " has a higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Talha";
        e1.salary = 50000;

        e2.name = "Rahul";
        e2.salary = 45000;

        e1.compareSalary(e2);
    }
}