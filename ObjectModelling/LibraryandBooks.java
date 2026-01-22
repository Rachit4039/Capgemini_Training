import java.util.ArrayList;

public class LibraryandBooks {
    public static void main(String[] args) {
        Book b1 = new Book("acvd", "Rachit");
        Book b2 = new Book("Java", "Joshi");

        Library lib1 = new Library("Library1");
        Library lib2 = new Library("Library2");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1);

        lib1.showBooks();
        lib2.showBooks();
    }
}
class Library {
    String libraryName;
    ArrayList<Book> books;

    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println(title + " by " + author);
    }
}