package Bookshelf;

public class Main {
    static String[] bookshelf = new String[5];
    static int bookCount = 0;

    public static void main(String[] args) {
        System.out.println(bookshelf.length);
        // View all books
        for (int i = 0; i < bookCount; i++) {
            System.out.println(bookshelf[i]);
        }
    }

    public static void addBook(String book) {
        if (bookCount >= bookshelf.length) {
            System.out.println("Bookshelf is full");
            return;
        }
        // Add book to bookshelf
        bookshelf[bookCount] = book;
        bookCount++;
    }
}
