class Factorial {
    static int totalCalls = 0;

    void calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        f.calculateFactorial(5);

        System.out.println("Total Calls: " + totalCalls);
    }
}