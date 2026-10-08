class Triangle {
    int a, b, c;

    static String type = "Scalene/Isosceles/Equilateral";

    void checkValidity() {
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);

        if (valid) {
            String triangleType;

            if (a == b && b == c) {
                triangleType = "Equilateral";
            } else if (a == b || b == c || a == c) {
                triangleType = "Isosceles";
            } else {
                triangleType = "Scalene";
            }

            System.out.println("Triangle is Valid.");
            System.out.println("Type: " + triangleType);
        } else {
            System.out.println("Triangle is Invalid.");
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.a = 5;
        t.b = 5;
        t.c = 6;

        t.checkValidity();
    }
}