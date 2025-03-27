import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book\n2. View All Books\n3. Search Book\n4. Update Book\n5. Delete Book\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        String bookID = scanner.nextLine();
                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter Genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Enter Availability Status (Available/Checked Out): ");
                        String status = scanner.nextLine();
                        Book book = new Book(bookID, title, author, genre, status);
                        library.addBook(book);
                        break;

                    case 2:
                        library.viewAllBooks();
                        break;

                    case 3:
                        System.out.print("Enter Book ID or Title: ");
                        String query = scanner.nextLine();
                        System.out.println(library.searchBookByIdOrTitle(query));
                        break;

                    case 4:
                        System.out.print("Enter Book ID to update: ");
                        String updateID = scanner.nextLine();
                        System.out.print("Enter New Title: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter New Author: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Enter New Availability Status: ");
                        String newStatus = scanner.nextLine();

                        library.updateBookDetails(updateID, newTitle, newAuthor, newStatus);
                        break;

                    case 5:
                        System.out.print("Enter Book ID to delete: ");
                        String deleteID = scanner.nextLine();
                        library.deleteBook(deleteID);
                        break;

                    case 6:
                        System.out.println("Exiting system...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);

        scanner.close();
    }
}
