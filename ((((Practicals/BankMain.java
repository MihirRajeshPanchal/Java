/*Define a class Bank having acc number,name,balance and city as data members.
Write a choice  based java program to perform deposit and withdraw operations .
While withdrawing the amount from the account,minimum balance of 1000 should 
be kept in the account otherwise program should raise a user defined Exception
.write a java program to test functionality by providing appropriate methods.*/

import java.util.Scanner;
class InvalidBalanceException extends Exception
{
	public String toString()
	{
		return "InvalidBalanceException Generated\nBalance Amount cannot be less than 1000";
	}
}
class Bank
{
	Scanner sc=new Scanner(System.in);
	String accno,name,city;
	float balance,deposit,withdraw,temp;

	void setAccount() throws InvalidBalanceException
	{
		System.out.print("Enter Account Number : ");
		accno=sc.nextLine();
		System.out.print("Enter Account Holder Name : ");
		name=sc.nextLine();
		System.out.print("Enter Balance in Account "+accno+" : ");
		balance=sc.nextFloat();
		if(balance<1000)
		{
			throw new InvalidBalanceException();
		}
		sc.nextLine();
		System.out.print("Enter City Name : ");
		city=sc.nextLine();
	}

	void getAccount()
	{
		System.out.println("Account Number : "+accno);
		System.out.println("Account Holder Name : "+name);
		System.out.println("Balance in Account "+accno+" : "+balance);
		System.out.println("City Name : "+city);	
	}

	void depositAccount()
	{
		System.out.print("Enter Deposit Amount : ");
		deposit=sc.nextFloat();
		System.out.println("Balance Before Deposition in Account "+accno+" : "+balance);
		System.out.println("Deposit Amount : "+deposit);
		System.out.print("Transaction : "+balance+" + "+deposit);
		balance=balance+deposit;
		System.out.println(" = "+balance);
		System.out.println("Balance After Deposition : "+balance);
	}

	void withdrawAccount() throws InvalidBalanceException
	{
		System.out.print("Enter Withdraw Amount : ");
		withdraw=sc.nextFloat();
		temp=balance-withdraw;
		if(temp<1000)
		{
			System.out.println("Cannot Withdraw "+withdraw+" from Balance "+balance);
			throw new InvalidBalanceException();
		}
		System.out.println("Balance Before Deposition in Account "+accno+" : "+balance);
		System.out.println("Withdraw Amount : "+withdraw);
		System.out.print("Transaction : "+balance+" - "+withdraw);
		balance=temp;
		System.out.println(" = "+balance);
		System.out.println("Balance After Deposition : "+balance);
	}
}
class BankMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Bank b=new Bank();
		do
		{
			System.out.println("\n(1).Set Acccount");
			System.out.println("(2).Get Acccount");
			System.out.println("(3).Withdraw");
			System.out.println("(4).Deposit");
			System.out.println("(5).Exit");
			System.out.print("\nEnter Choice : ");
			choice=sc.nextInt();
			System.out.println();
			switch(choice)
			{
				case 1:		try
							{
								b.setAccount();	
								break;
							}
							catch(InvalidBalanceException ibe)
							{
								System.out.println(ibe);
								System.exit(0);
							}
							System.out.println();
							break;

				case 2 : 	b.getAccount();
							break;

				case 3 : 	try
							{
								b.withdrawAccount();	
								break;
							}
							catch(InvalidBalanceException ibe)
							{
								System.out.println(ibe);
							}
							break;

				case 4 : 	b.depositAccount();
							break;

				case 5 : 	System.out.println("Program Terminated");
							break;

				default : 	System.out.println("Invalid Choice");
							break;
			}
		}while(choice!=5);	
	}
}