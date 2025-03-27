import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getBookID().equals(book.getBookID())) {
                throw new IllegalArgumentException("Book ID must be unique.");
            }
        }
        books.add(book);
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book searchBookByIdOrTitle(String query) {
        for (Book book : books) {
            if (book.getBookID().equals(query) || book.getTitle().equalsIgnoreCase(query)) {
                return book;
            }
        }
        throw new IllegalArgumentException("Book not found.");
    }

    public void updateBookDetails(String bookID, String newTitle, String newAuthor, String newStatus) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setAvailabilityStatus(newStatus);
                return;
            }
        }
        throw new IllegalArgumentException("Book not found.");
    }

    public void deleteBook(String bookID) {
        boolean removed = books.removeIf(book -> book.getBookID().equals(bookID));
        if (!removed) {
            throw new IllegalArgumentException("Book not found.");
        }
    }
}
