import java.util.Scanner;
class InvalidBalanceException extends Exception
{
	public String toString()
	{
		return "InvalidBalanceException Generated\nBalance Amount cannot be less than 1000";
	}
}
class Account
{
	Scanner sc=new Scanner(System.in);
	String accno,name,city;
	float balance;

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
}
class Savings extends Account
{
    double interest;
    float deposit;
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
    void interestAnually()
    {
        interest=balance*(3.25/100);
        System.out.println("Interest gained Anually is : "+interest);
        System.out.println("After One Year Balance with Interest will be : "+(balance+interest));
    }
}
class Current extends Account
{
    float withdraw,temp;
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
public class AccountMain 
{
    public static void main(String[] args) 
    {
       Savings s=new Savings();
       try 
        {
            s.setAccount();
            s.getAccount();
            s.depositAccount();
            s.interestAnually();
        } 
        catch (InvalidBalanceException e) 
        {
            System.out.println(e);
        }


        Current c=new Current();
        try 
        {
            c.setAccount();
            c.getAccount();
            c.withdrawAccount();
        } 
        catch (InvalidBalanceException e) 
        {
            System.out.println(e);
        } 
    }
}
