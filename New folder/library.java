import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Library {
    private Map<String, Book> catalog;
    private List<Book> borrowedBooks;

    public Library() {
        this.catalog = new HashMap<>();
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        catalog.put(title, newBook);
    }

    public void displayCatalog() {
        for (Book book : catalog.values()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Available: " + book.isAvailable());
        }
    }

    public void borrowBook(String title) {
        Book book = catalog.get(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            borrowedBooks.add(book);
            System.out.println("You have borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
        }
    }

    public void returnBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                book.setAvailable(true);
                borrowedBooks.remove(book);
                System.out.println("You have returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found in borrowed books.");
    }
}

public class library {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");

        System.out.println("Library Catalog:");
        library.displayCatalog();

        System.out.println("\nBorrowing a book:");
        library.borrowBook("The Great Gatsby");
        library.borrowBook("1984");

        System.out.println("\nLibrary Catalog after borrowing:");
        library.displayCatalog();

        System.out.println("\nReturning a book:");
        library.returnBook("1984");

        System.out.println("\nLibrary Catalog after returning:");
        library.displayCatalog();
    }
}