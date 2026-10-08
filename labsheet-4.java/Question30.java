class Library {
    int booksAvailable;

    static String libraryName = "Central Library";

    void issueBook() {
        int availableBooks = booksAvailable;

        if (availableBooks > 0) {
            availableBooks--;
            booksAvailable = availableBooks;

            System.out.println("Book issued successfully.");
            System.out.println("Books Available: " + booksAvailable);
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {
        int returnedBooks = booksAvailable + 1;

        booksAvailable = returnedBooks;

        System.out.println("Book returned successfully.");
        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {
        Library l = new Library();

        l.booksAvailable = 10;

        System.out.println("Library: " + libraryName);
        System.out.println("Initial Books: " + l.booksAvailable);

        l.issueBook();
        l.returnBook();
    }
}