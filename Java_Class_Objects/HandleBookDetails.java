package Java_Class_Objects;
class Book{
	String title;
	String author;
	int price;
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails(){
		System.out.println("Name of Book is " +title);
		System.out.println("Name of Author is " +author);
		System.out.println("Price of Book is " +price);
     }
}

public class HandleBookDetails {

	public static void main(String[] args) {
		Book B1 = new Book("Rich Dad POOR DAD ", "Robert T.K", 200 );
		B1.displayDetails();

	}

}
