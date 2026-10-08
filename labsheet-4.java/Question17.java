class StudentGrade {
    String name;
    int marks;

    static int passingMarks = 40;

    void assignGrade() {
        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= passingMarks) {
            grade = "D";
        } else {
            grade = "F";
        }

        String studentName = name;

        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();

        s.name = "Talha";
        s.marks = 85;

        s.assignGrade();
    }
}