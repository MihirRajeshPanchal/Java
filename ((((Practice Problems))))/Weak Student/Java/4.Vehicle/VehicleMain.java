import java.util.Scanner;
class Vehicle
{
	String model_no,model_name,company;
	int qty,price;

	Scanner sc=new Scanner(System.in);

	void setVehicle()
	{
		System.out.print("Enter Model No : ");
		model_no=sc.nextLine();
		System.out.print("Enter Model Name : ");
		model_name=sc.nextLine();
		System.out.print("Enter Company : ");
		company=sc.nextLine();
		System.out.print("Enter Quantity : ");
		qty=sc.nextInt();
		System.out.print("Enter Price : ");
		price=sc.nextInt();
	}

	void getVehicle()
	{
		System.out.println("Model No : "+model_no);
		System.out.println("Model Name : "+model_name);
		System.out.println("Company : "+company);
		System.out.println("Quantity : "+qty);
		System.out.println("Price : "+price);
	}

	int calVehicle()
	{
		return qty*price;
	}

}

class Bike extends Vehicle
{
	String helmet_color;

	Scanner sc=new Scanner(System.in);

	void setBike()
	{
		setVehicle();
		System.out.print("Enter Helmet Color : ");
		helmet_color=sc.nextLine();
	}

	void getBike()
	{
		getVehicle();
		System.out.println("Helmet Color : "+helmet_color);
	}
}

class Car extends Vehicle
{
	float bootspace,trunkspace;

	Scanner sc=new Scanner(System.in);

	void setCar()
	{
		setVehicle();
		System.out.print("Enter Bootspace in m(square) : ");
		bootspace=sc.nextFloat();
		System.out.print("Enter Trunkspace in m(square) : ");
		trunkspace=sc.nextFloat();
	}

	void getCar()
	{
		getVehicle();
		System.out.println("Bootspace in m(square) : "+bootspace);
		System.out.println("Trunkspace in m(square) : "+trunkspace);
	}
}

class VehicleMain
{
	public static void main(String[] args) 
	{
		System.out.println("\nBike Details : \n");
		Bike b=new Bike();
		b.setBike();
		b.getBike();
		System.out.println("Total Price of Bikes : "+b.calVehicle());


		System.out.println("\nCar Details : \n");
		Car c=new Car();
		c.setCar();
		c.getCar();
		System.out.println("Total Price of Cars : "+c.calVehicle());
	}
}