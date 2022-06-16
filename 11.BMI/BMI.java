import java.util.Scanner;
class BMI
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Weight (KiloGrams) : ");
		float w=sc.nextFloat();
		System.out.print("Enter Your Height (Meters) : ");
		float h=sc.nextFloat();

		float bmi=w/(h*h);

		if(bmi<=18.5)
		{
		System.out.print("You fall in underweight category");
		}
		else if(bmi>18.5 && bmi<=24.9)
		{
		System.out.print("You fall in normal weight category");
		}
		else if(bmi>25.0 && bmi<=29.9)
		{
		System.out.print("You fall in overweight category");
		}
		else if(bmi>30.0 && bmi<=34.9)
		{
		System.out.print("You fall in obesity class I category");
		}
		else if(bmi>35.0 &&bmi<=39.9)
		{
		System.out.print("You fall in obesity class II category");
		}
		else
		{
		System.out.print("You fall in obesity class III category");
		}
	}
}
