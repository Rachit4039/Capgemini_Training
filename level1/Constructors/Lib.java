package level1.Constructors;
public class Lib {

    // Nested static class representing a book
    static class LibraryBook {
        String title;
        String author;
        double price;
        boolean available;

        LibraryBook(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = true;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("Book borrowed: " + title);
            } else {
                System.out.println("Book not available: " + title);
            }
        }

        void display() {
            System.out.println(title + " by " + author + " Rs " + price + " Available " + available);
        }
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Basics", "James Gosling", 500);
        LibraryBook book2 = new LibraryBook("Python Essentials", "Guido van Rossum", 450);

        book1.display();
        book1.borrowBook();
        book1.borrowBook(); 
        book1.display();

        book2.display();
        book2.borrowBook();
        book2.display();
    }
}
