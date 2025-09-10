package this_final;

public class LibraryManagementSystem {

    // 🔹 Static
    static String libraryName = "Central Library";
    static int totalBooks = 0;

    // 🔹 Final
    final String isbn;   // unique, cannot change

    // 🔹 Instance variables
    private String title;
    private String author;

    // 🔹 Static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // 🔹 Constructor (using this)
    LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public void displayBookDetails() {
        if (this instanceof LibraryManagementSystem) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Invalid Object: Not a Book");
        }
    }

    // 🔹 Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        LibraryManagementSystem book1 = new LibraryManagementSystem("1984", "George Orwell", "ISBN001");
        LibraryManagementSystem book2 = new LibraryManagementSystem("The Alchemist", "Paulo Coelho", "ISBN002");

        // Display library name
        LibraryManagementSystem.displayLibraryName();

        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("Book 2 Details:");
        book2.displayBookDetails();

        System.out.println("Total Books in Library: " + totalBooks);
    }
}
