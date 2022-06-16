class FactorialMain
{
    public static void main(String args[]) 
    {
        try
        {
        int num=Integer.parseInt(args[0]);
        int fact=1;
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
        System.out.println("Factorial of "+args[0]+" is "+fact);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("NumberFormatException is caught \n Enter a Number ");
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("ArrayIndexOutOfBoundsException is caught \n Enter only one Number");
        }
    }
}