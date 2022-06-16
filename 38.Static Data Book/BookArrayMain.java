/*Q: Define a class named "Book" having title, author, publisher, qty and price as
data members. Add setter and getter methods inside the class. Define a method named valuation() to calculate the total valuation of all the books. 
 
Provide a test class to test the functionalit of Book class.*/
import java.util.Scanner;
class BookMain
{
	String title,author,publisher;
	float quantity,price;
	static Scanner sc=new Scanner(System.in);
	void setBook()
	{
		sc.nextLine();
		System.out.print("Enter Title of Book : ");
		title=sc.nextLine();
		System.out.print("Enter Author of Book : ");
		author=sc.nextLine();
		System.out.print("Enter Publisher of Book : ");
		publisher=sc.nextLine();
		System.out.print("Enter Quantity of Book : ");
		quantity=sc.nextFloat();
		System.out.print("Enter Price of Book : ");
		price=sc.nextFloat();
		
	}
	void getBook()
	{
		System.out.println("Title of Book : "+title);
		System.out.println("Author of Book : "+author);
		System.out.println("Publisher of Book : "+publisher);
		System.out.println("Quantity of Book : "+quantity);
		System.out.println("Price of Book : "+price);
	}
	static void sByPrice(BookMain b[])
	{
		int j;
		for(j=0;j<b.length;j++)
		{
			if(b[j].price<=400)
			{
				b[j].getBook();
			}
		}
	}
	static void searchByPriceRange(BookMain b[])
	{
		System.out.println("\n\nBooks Having Specific Price Range : ");
		System.out.print("Minimum Range : ");
		float minran=sc.nextFloat();
		System.out.print("Maximum Range : ");
		float maxran=sc.nextFloat();
		int j;
		for(j=0;j<b.length;j++)
		{
			if(b[j].price<=maxran&&b[j].price>=minran)
			{
				b[j].getBook();
			}
		}
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
		//Scanner sc=new Scanner(System.in);
		int size;
		double total=0.0;
		System.out.print("Enter The Number of Books : ");
		size=BookMain.sc.nextInt();
		BookMain b[]=new BookMain[size];
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i]=new BookMain();
			b[i].setBook();
			//System.out.println("Total Price of Books : "+b[i].valuation());
			//=total+b[i].valuation();
		}
		for(i=0;i<b.length;i++)
		{
		b[i].getBook();
		}
		//System.out.print("Total Price of all Books : "+total);
		System.out.println("\n\nBooks Having Price <400 : ");
		BookMain.sByPrice(b);
		System.out.println("\n\nBooks Having Price Between  : ");
		BookMain.searchByPriceRange(b);
	}
}