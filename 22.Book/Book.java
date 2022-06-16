/*Q: Define a class named "Book" having title, author, publisher, qty and price as
data members. Add setter and getter methods inside the class. Define a method named valuation() to calculate the total valuation of all the books. 
 
Provide a test class to test the functionalit of Book class.*/
import java.util.Scanner;
class BookMain
{
	String title,author,publisher;
	int quantity,price;
	void setBook()
	{
		BookMain b1=new BookMain();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Title of Book : ");
		title=sc.nextLine();
		System.out.print("Enter Author of Book : ");
		author=sc.nextLine();
		System.out.print("Enter Publisher of Book : ");
		publisher=sc.nextLine();
		System.out.print("Enter Quantity of Book : ");
		quantity=sc.nextInt();
		System.out.print("Enter Price of Book : ");
		price=sc.nextInt();
		
	}
	void getBook()
	{
		System.out.println("Title of Book : "+title);
		
		System.out.println("Author of Book : "+author);
		
		System.out.println("Publisher of Book : "+publisher);
		
		System.out.println("Quantity of Book : "+quantity);
		
		System.out.println("Price of Book : "+price);
		
	}
	double valuation()
	{
		return quantity*price;
	}
}
class Book
{
	public static void main(String args[])
	{
		BookMain b1=new BookMain();
		b1.setBook();
		b1.getBook();
		System.out.println("Total Price of Books : "+b1.valuation());
	}
}