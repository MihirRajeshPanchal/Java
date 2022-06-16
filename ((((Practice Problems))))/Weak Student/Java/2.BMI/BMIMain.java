import java.util.Scanner;
class BMI
{
	float weight,height;

	Scanner sc=new Scanner(System.in);

	void setBMI()
	{
		System.out.print("Enter Your Weight (KiloGrams) : ");
		weight=sc.nextFloat();
		System.out.print("Enter Your Height (Meters) : ");
		height=sc.nextFloat();
	}

	void getBMI()
	{
		System.out.println("Weight (KiloGrams) : "+weight);
		System.out.println("Height (Meters) : "+height);		
	}

	void calBMI()
	{
		float bmi=weight/(height*height);
		if(bmi<18.5)
		{
			System.out.println("You fall in underweight category");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("You fall in normal weight category");
		}
		else if(bmi>=25.0 && bmi<=29.9)
		{
			System.out.println("You fall in overweight category");
		}
		else if(bmi>=30.0)
		{
			System.out.println("You fall in obesity class category");
		}
	}
}
class BMIMain
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number of Patients : ");
		n=sc.nextInt();

		BMI b[]=new BMI[n];

		for(int i=0;i<b.length;i++)
		{
			b[i]=new BMI();
			System.out.println("\nPatient "+(i+1));
			b[i].setBMI();
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("\nPatient "+(i+1));
			b[i].getBMI();
			b[i].calBMI();
		}

	}
}