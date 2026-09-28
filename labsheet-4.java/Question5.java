class Book {
    
    String title;
    String author;
    double price;

    static String publisher = "Penguin Books";

    void displayDetails() {
       
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 499;

        b.displayDetails();
    }
}