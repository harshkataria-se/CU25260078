class Student {
    String name;
    int age;

    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void displayDetails() {
        String studentName = name;
        int studentAge = age;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Talha", 20);
        Student s2 = new Student("Rahul", 21);

        s1.displayDetails();
        s2.displayDetails();

        System.out.println("Total Students: " + count);
    }
}