import java.util.Scanner;
class EmailValidation
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String email;
    System.out.print("Enter Email Id : ");
    email=sc.next();//input

    if((email.indexOf('@')!=0)&&(email.indexOf('.')!=-1))//if @  be first char in email and if . not available then
    {
    	if(email.indexOf('@')==email.lastIndexOf('@'))//if there are two or more @ sign then go to else
    	{
            if(email.indexOf('@')<email.lastIndexOf('.'))//after @ there should be a . if not goto else
            {
                if(email.lastIndexOf('.')-email.indexOf('@')>1)//if there is no character between @. go to else
                {
                    System.out.println("Email Id Verified");
                }
                else
                {
                    System.out.println("There is no domain name");
                }

            }
            else
            {
                System.out.println("Email id has no '.' after @ ");
            }
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