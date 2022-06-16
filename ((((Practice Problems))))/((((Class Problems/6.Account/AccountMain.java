import java.util.Scanner;
class Account
{
	private String id,name;
	private int balance=0;

	Account(String id,String name)//constructor with two params
	{
		this.id=id;
		this.name=name;
		balance=0;
	}

	Account(String id,String name,int balance)//constructor with 3 params
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}	

	String getID()//return id
	{
		return id;
	}

	String getName()//return name
	{
		return name;
	}

	int getBalance()//return balance
	{
		return balance;
	}

	int credit(int amount)//credit function with one param
	{
		balance=balance+amount;
		return balance;
	}

	int debit(int amount)//debit function with one param
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			return balance;
		}
		else
		{
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}

	int tranferTo(String anotheraccount,int amount)//transferto with two param
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+" Rupees has been transferred from Account with ID "+id+" to Account with ID "+anotheraccount);
			return balance;
		}
		else
		{
			System.out.println("Amount exceeded balance");
			return balance;
		}		
	}

	public String toString()//to string function
	{
		return "Account[ID="+id+",Name="+name+",Balance="+balance+"]";
	}
}

class AccountMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int amountc,amountd,amountt;
		String anotheraccount;
		//When Balance =0 constructor
		System.out.println("\nInside Constructor with Two Parameters : ");
		Account a1=new Account("A0001","Mihir");
		System.out.println("ID : "+a1.getID());
		System.out.println("Name : "+a1.getName());
		System.out.println("Balance : "+a1.getBalance());
		System.out.print("Enter Amount to be Credited : ");
		amountc=sc.nextInt();
		System.out.println("Balance After Amount Credited : "+a1.credit(amountc));
		System.out.print("Enter Amount to be Debited : ");
		amountd=sc.nextInt();
		System.out.println("Balance After Amount Debited : "+a1.debit(amountd));
		System.out.print("Enter Transfer Transaction Account ID : ");
		anotheraccount=sc.next();
		System.out.print("Enter Amount to be Transferred : ");
		amountt=sc.nextInt();
		System.out.println("Balance After Amount Transferred : "+a1.tranferTo(anotheraccount,amountt));
		System.out.println(a1.toString());

		//wheen balance is paaassed in constructor
		System.out.println("\nInside Constructor with Three Parameters : ");
		Account a2=new Account("A0001","Mihir",10000);
		System.out.println("ID : "+a2.getID());
		System.out.println("Name : "+a2.getName());
		System.out.println("Balance : "+a2.getBalance());
		System.out.print("Enter Amount to be Credited : ");
		amountc=sc.nextInt();
		System.out.println("Balance After Amount Credited : "+a2.credit(amountc));
		System.out.print("Enter Amount to be Debited : ");
		amountd=sc.nextInt();
		System.out.println("Balance After Amount Debited : "+a2.debit(amountd));
		System.out.print("Enter Transfer Transaction Account ID : ");
		anotheraccount=sc.next();
		System.out.print("Enter Amount to be Transferred : ");
		amountt=sc.nextInt();
		System.out.println("Balance After Amount Transferred : "+a2.tranferTo(anotheraccount,amountt));
		System.out.println(a2.toString());
	}
}