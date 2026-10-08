class Pen {

    String color;
    String type;

    static String manufacturer = "Cello";

    void displayDetails() {
        // Local variables
        String penColor = color;
        String penType = type;
        String penManufacturer = manufacturer;

        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
        System.out.println("Manufacturer: " + penManufacturer);
    }

    public static void main(String[] args) {
        Pen p = new Pen();

        p.color = "Blue";
        p.type = "Ball Pen";

        p.displayDetails();
    }
}