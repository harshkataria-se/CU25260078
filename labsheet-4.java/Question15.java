class SimpleInterest {
    double principal;
    double rate;
    double time;

    static String bank = "State Bank";

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Bank: " + bank);
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();

        s.principal = 10000;
        s.rate = 5;
        s.time = 2;

        s.calculateInterest();
    }
}