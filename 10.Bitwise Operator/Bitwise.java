import java.util.Scanner;
class Bitwise
{
	public static void main(String args[])
	{
		byte a=25;
	    System.out.println("Bitwise Unary Not : " +(~a));
	    System.out.println("Shift Left : " +(a<<1));
	    System.out.println("Shift Right Zero Fill : " +(a>>>1));
	    System.out.println("Shift Right : " +(a>>1));
	}
}
