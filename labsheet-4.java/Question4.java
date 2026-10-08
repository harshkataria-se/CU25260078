class Employee {
    
    int empId;
    double salary;

    static String companyName = "ABC Technologies";

    void displayDetails() {
        
        int employeeId = empId;
        double employeeSalary = salary;
        String company = companyName;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Company Name: " + company);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.empId = 101;
        e.salary = 45000;

        e.displayDetails();
    }
}