/*Q: Define a class named "Book" having title, author, publisher, qty and price as
data members. Add setter and getter methods inside the class. Define a method named valuation() to calculate the total valuation of all the books. 
 
Provide a test class to test the functionalit of Book class.*/
import java.util.Scanner;
class Book
{
	String title,author,publisher;
	int quantity;
	float price;
	void setBook()
	{
		Scanner sc=new Scanner(System.in);
		//sc.nextLine();
		System.out.print("\nEnter Title of Book : ");
		title=sc.nextLine();
		System.out.print("Enter Author of Book : ");
		author=sc.nextLine();
		System.out.print("Enter Publisher of Book : ");
		publisher=sc.nextLine();
		System.out.print("Enter Quantity of Book : ");
		quantity=sc.nextInt();
		System.out.print("Enter Price of Book : ");
		price=sc.nextFloat();
		
	}
	void getBook()
	{
		System.out.println("\nTitle of Book : "+title);
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
class BookArrayMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		double total=0.0;
		System.out.print("Enter The Number of Books : ");
		size=sc.nextInt();
		Book b[]=new Book[size];
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i]=new Book();
			b[i].setBook();
		}
		for(i=0;i<b.length;i++)
		{
			b[i].getBook();
			System.out.println("Total Price of Books : "+b[i].valuation());
			total=total+b[i].valuation();
		}
		System.out.print("\nTotal Price of all Books : "+total);
	}
}