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

	void getBoxWeight()
	{
		System.out.println(weight);
	}
}
class BoxWeightMain
{
	public static void main(String args[])
	{
	BoxWeight bw1=new BoxWeight(1.1,2.2,3.3,25);
	bw1.getBox();
	bw1.getBoxWeight();
	bw1.volume();
	}
}