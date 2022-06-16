class Box
{
	private double w,d,h; //
	Box(){}
	Box(double we,double de,double he)
	{
	w=we;
	d=de;
	h=he;
	}

	double volume()
	{
	return w*d*h;
	}

	void getBox()
	{
		System.out.println("Width : "+w);
		System.out.println("Depth : "+d);
		System.out.println("Height : "+h);
	}
}
class BoxWeight extends Box 
{
	double weight;
	BoxWeight(double we,double de,double he,double wgt)
	{
	super(we,de,he);
	/*w=we;
	d=de;
	h=he;8*/
	weight=wgt;
	}	

	double getBoxWeight()
	{
		return weight;
	}
}

class BoxShipment extends BoxWeight
{
	double cost;
	BoxShipment(double we,double de,double he,double wgt,double cost)
	{
		super(we,de,he,wgt);
		this.cost=cost;
	}

	double getBoxCost()
	{
		return cost*weight;
	}
}
class BoxShipmentMain
{
	public static void main(String args[])
	{
	BoxShipment bw1=new BoxShipment(1.1,2.2,3.3,25,5);
	bw1.getBox();
	System.out.println("Weight Of Box : "+bw1.getBoxWeight());
	System.out.println("Volume Of Box : "+bw1.volume());
	System.out.println("Shipment Cost Of Box : "+bw1.getBoxCost());
	}
}