import java.util.Scanner;
class Book
{
	Scanner sc=new Scanner(System.in);
	String author,publisher,title,isbn;
	int qty,price;

	void setBook()
	{
		System.out.print("Enter ISBN : ");
		isbn=sc.nextLine();
		System.out.print("Enter Title : ");
		title=sc.nextLine();
		System.out.print("Enter Publisher : ");
		publisher=sc.nextLine();
		System.out.print("Enter Author : ");
		author=sc.nextLine();
		System.out.print("Enter Quantity : ");
		qty=sc.nextInt();
		System.out.print("Enter Price : ");
		price=sc.nextInt();		
	}

	void getBook()
	{
		System.out.println("ISBN : "+isbn);
		System.out.println("Title : "+title);
		System.out.println("Publisher : "+publisher);
		System.out.println("Author : "+author);
		System.out.println("Quantity : "+qty);
		System.out.println("Price : "+price);	
		System.out.println("\nTotal Amount : "+totalAmount());
	}

	int totalAmount()
	{
		return price*qty;
	}

	void updatePrice()
	{
		System.out.print("Enter New Price : ");
		price=sc.nextInt();	
		System.out.println("Update Price Successful");
	}

	void updateQty()
	{
		System.out.print("Enter New Quantity : ");
		qty=sc.nextInt();	
		System.out.println("Update Quantity Successful");
	}

}
class BookMain
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		b.setBook();
		System.out.println();
		b.getBook();

		System.out.println("\n(1).Update Price");	
		System.out.println("(2).Update Quantity");
		System.out.println("(3).Display");
		System.out.println("(4).Exit");

		do
		{
			System.out.print("\nEnter Choice : ");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1: 
					b.updatePrice();
					break;

				case 2: 
					b.updateQty();
					break;

				case 3: 
					b.getBook();
					break;

				case 4:
					System.exit(0);

			}

		}while(choice!=4);
	}
}