import java.util.Scanner;
class Vehicle
{
	String model;
	int rnumber;
	float fcapacity,fconsume,vspeed;
	Scanner sc=new Scanner(System.in);

	Vehicle(String model,int rnumber,float vspeed,float fcapacity,float fconsume)
	{
		this.model=model;
		this.rnumber=rnumber;
		this.vspeed=vspeed;
		this.fcapacity=fcapacity;
		this.fconsume=fconsume;
	}

	void setModel()
	{
		System.out.print("Enter Vehicle Model : ");
		model=sc.nextLine();
	}

	void setRNumber()
	{
		System.out.print("Enter Registration Number : ");
		rnumber=sc.nextInt();
	}

	void setVSpeed()
	{
		System.out.print("Enter Vehicle Speed : ");
		vspeed=sc.nextFloat();
	}

	void setFCapacity()
	{
		System.out.print("Enter Fuel Capacity : ");
		fcapacity=sc.nextFloat();
	}

	void setFConsume()
	{
		System.out.print("Enter Fuel Consumption : ");
		fconsume=sc.nextFloat();
	}

	String getModel()
	{
		return model;
	}

	int getRNumber()
	{
		return rnumber;
	}

	float getFCapacity()
	{
		return fcapacity;
	}

	float getFConsume()
	{
		return fconsume;
	}

	float getVSpeed()
	{
		return vspeed;
	}

	double fuelNeeded(double km)
	{
		return km/fconsume;
	}

	double distanceCovered(double time)
	{
		return vspeed*time;
	}

	void display()
	{
		System.out.println("Vehicle Model : "+model);
		System.out.println("Registration Number : "+rnumber);
		System.out.println("Vehicle Speed : "+vspeed);
		System.out.println("Fuel Capacity : "+fcapacity);
		System.out.println("Fuel Consumption : "+fconsume);
	}
}

class Truck extends Vehicle
{
	int cweight;
	Truck(String model,int rnumber,float vspeed,float fcapacity,float fconsume,int cweight)
	{
		super(model,rnumber,vspeed,fcapacity,fconsume);
		this.cweight=cweight;
	}

	void setCWeight()
	{
		System.out.print("\nEnter Cargo Weight : ");
		cweight=sc.nextInt();
	}

	int getCWeight()
	{
		return cweight;
	}

	void display()
	{
		System.out.println();
		super.display();
		System.out.println("Cargo Weight : "+cweight);
	}
}

class Bus extends Vehicle
{
	int npassengers;
	Bus(String model,int rnumber,float vspeed,float fcapacity,float fconsume,int npassengers)
	{
		super(model,rnumber,vspeed,fcapacity,fconsume);
		this.npassengers=npassengers;
	}

	int getNPassengers()
	{
		return npassengers;
	}

	void display()
	{
		System.out.println();
		super.display();
		System.out.println("Number of Passengers : "+npassengers);
	}	
}

class Transport
{
	public static void main(String args[])
	{
		Truck t1=new Truck("Tata",1001,40,2000,3,10);//String model,int rnumber,float vspeed,float fcapacity,float fconsume,int cweight
		//if you dont want to initialize set every field by t1.setModel(); ......
		System.out.println("\nFuel Needed By Truck : "+t1.fuelNeeded(5));
		System.out.println("Distance Covered By Truck : "+t1.distanceCovered(1));
		t1.display();

		Bus b1=new Bus("Mahindra",2008,60,1500,3.6f,60);//String model,int rnumber,float vspeed,float fcapacity,float fconsume,int npassengers
		//if you dont want to initialize set every field by t1.setModel(); ......
		System.out.println("\nFuel Needed By Bus : "+b1.fuelNeeded(10));
		System.out.println("Distance Covered By Bus : "+b1.distanceCovered(2));
		b1.display();
	}
}