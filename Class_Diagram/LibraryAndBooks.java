package Class_Diagram;

import java.util.ArrayList;

public class LibraryAndBooks {

	static class Book {
	    String title;
	    String author;
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }
	    public void displayBook() {
	        System.out.println("Title: " + title + ", Author: " + author);
	    }
	}
	static class Library {
	    String name;
	    ArrayList<Book> books;  

	    public Library(String name) {
	        this.name = name;
	        this.books = new ArrayList<>();
	    }
	    public void addBook(Book book) {
	        books.add(book);
	    }
	    
	    public void showLibraryBooks() {
	        System.out.println("Library: " + name);
	        for (Book b : books) {
	            b.displayBook();
	        }
	    }
	}
	    public static void main(String[] args) {
	        // Create independent Book objects
	        Book b1 = new Book("123", "abc");
	        Book b2 = new Book("456", "xyz");
	        Book b3 = new Book("789", "ab");

	        Library lib1 = new Library("Central Library");
	        Library lib2 = new Library("AB2 Library");

	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        lib2.addBook(b2);
	        lib2.addBook(b3);

	        lib1.showLibraryBooks();
	        System.out.println();
	        lib2.showLibraryBooks();
	    }
}
