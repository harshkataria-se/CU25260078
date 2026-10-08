class Laptop {

    String brand;
    int RAM;

    static String os = "Windows";

    void displayDetails() {
        
        String laptopBrand = brand;
        int laptopRAM = RAM;
        String operatingSystem = os;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("Operating System: " + operatingSystem);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();

        l.brand = "Dell";
        l.RAM = 8;

        l.displayDetails();
    }
}