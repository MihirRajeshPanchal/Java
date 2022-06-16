class SquareRoot
{
	public static void main(String args[])
	{
		short num=-5;
			if(num<0)
			{
			System.out.print("Square Root of Negative Number is not possible");
			}
			else
			{
			float sqrt=(float)Math.sqrt(num);
			System.out.print("Square Root of the number is "+sqrt);
			}
	}
}