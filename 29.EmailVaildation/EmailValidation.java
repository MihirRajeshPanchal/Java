import java.util.Scanner;
class EmailValidation
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String email;
    System.out.print("Enter Email Id : ");
    email=sc.next();

    if((email.indexOf('@')!=1)&&(email.indexOf('.')!=-1))
    {
    	if(email.indexOf('@')==email.lastIndexOf('@'))
    	{
            System.out.println("Email Id Verified"); 
    	}
    	else
    	{
    		System.out.println("Email Id has too many @ sign!!!");
    	}
    }
    else
    {
    	System.out.println("Email Id has no @ OR . !!!");
    }
	}
}