markdown
# Digital Library Management System

## Project Overview
The Digital Library Management System is a simple Java-based console application that allows users to manage a collection of books. The system includes functionality to:
- Add new books.
- View all books in the library.
- Search for books by ID or title.
- Update details of existing books.
- Delete books from the library.

This project is built with a modular structure using object-oriented programming principles. It includes a `Book` class for representing individual books and a `Library` class for managing the book collection.

---

## Features
1. **Add Book**: Users can add new books with attributes such as book ID, title, author, genre, and availability status.
2. **View All Books**: Displays the complete list of books available in the library.
3. **Search Book**: Searches for a book by its ID or title and displays its details.
4. **Update Book**: Allows users to update the title, author, and availability status of a book.
5. **Delete Book**: Users can remove a book from the library based on its ID.

---

## Project Structure
The project follows a straightforward structure:
DigitalLibrary/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── Book.java # Represents a single book │ │ │ ├── Library.java # Handles operations on the book collection │ │ │ ├── LibraryManagementSystem.java # Provides the console-based user interface


---

## Requirements
- **Java Development Kit (JDK)** 8 or later
- A terminal or command prompt for running the application

---

## How to Run
1. **Compile the Project**:
   Open a terminal and navigate to the `src/main/java` directory. Compile the Java files:
   ```bash
   javac *.java
Run the Application: Execute the following command:

bash
java LibraryManagementSystem
Use the Console Menu: Follow the on-screen menu options to add, view, update, search, or delete books.

Example Usage
Adding a Book
Enter your choice: 1
Enter Book ID: B001
Enter Title: To Kill a Mockingbird
Enter Author: Harper Lee
Enter Genre: Fiction
Enter Availability Status (Available/Checked Out): Available

Viewing All Books
Enter your choice: 2
BookID: B001, Title: To Kill a Mockingbird, Author: Harper Lee, Genre: Fiction, Status: Available
Searching for a Book
Enter your choice: 3
Enter Book ID or Title: B001
BookID: B001, Title: To Kill a Mockingbird, Author: Harper Lee, Genre: Fiction, Status: Available
Files Description
Book.java: Represents the Book class, including attributes like book ID, title, author, genre, and status. Also includes getter and setter methods.

Library.java: Manages the list of books and provides methods for adding, viewing, searching, updating, and deleting books.

LibraryManagementSystem.java: The main class that provides the menu-driven console interface for interacting with the library.

Future Enhancements
While this project is currently console-based, future improvements may include:

Adding a graphical user interface (GUI) using Java Swing or JavaFX.

Implementing a web-based interface with a backend for API handling.

Storing book data in a database or file for persistence.
