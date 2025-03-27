public class Book {
    private String bookID;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;

    public Book(String bookID, String title, String author, String genre, String availabilityStatus) {
        if (bookID.isEmpty() || title.isEmpty() || author.isEmpty()) {
            throw new IllegalArgumentException("Book ID, Title, and Author cannot be empty.");
        }
        if (!availabilityStatus.equals("Available") && !availabilityStatus.equals("Checked Out")) {
            throw new IllegalArgumentException("Invalid availability status.");
        }
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }
    public void setbookId(String bookId) {
        this.bookID = bookId;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author +
               ", Genre: " + genre + ", Status: " + availabilityStatus;
    }
}
