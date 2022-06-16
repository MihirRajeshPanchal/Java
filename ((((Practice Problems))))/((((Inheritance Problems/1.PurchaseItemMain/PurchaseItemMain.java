class PurchaseItem
{
	String name;
	double unitPrice;
	PurchaseItem()
	{
		name="";
		unitPrice=0;
	}
	PurchaseItem(String name,double unitPrice)
	{
		this.name=name;
		this.unitPrice=unitPrice;
	}

	double getPrice()
	{
		return unitPrice;
	}

	void setPrice(double unitPrice)
	{
		this.unitPrice=unitPrice;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name=name;
	}

	public String toString()
	{
		return name+"@"+unitPrice;
	}

}

class WeightedItem extends PurchaseItem
{
	double weight;
	WeightedItem(String name,double unitPrice,double weight)
	{
		super(name,unitPrice);
		this.weight=weight;
	}

	double getWeight()
	{
		return weight;
	}

	double getPrice()
	{
		return unitPrice*weight;
	}

	public String toString()
	{
		return name+"\t@"+unitPrice+"\t"+weight+"\t"+getPrice();
	}
}

class CountedItem extends PurchaseItem
{
	int quantity;
	CountedItem(String name,double unitPrice,int quantity)
	{
		super(name,unitPrice);
		this.quantity=quantity;
	}

	int getQuantity()
	{
		return quantity;
	}

	double getPrice()
	{
		return unitPrice*quantity;
	}

	public String toString()
	{
		return name+"\t@"+unitPrice+"\t"+quantity+"\t"+getPrice();
	}

}

class PurchaseItemMain
{
	public static void main(String args[])
	{
		WeightedItem w1=new WeightedItem("Banana",3.00,1.37);
		System.out.println("\nName : "+w1.getName());
		System.out.println("Unit Price : "+w1.getPrice());
		System.out.println("Weight : "+w1.getWeight());
		System.out.println(w1.toString());

		CountedItem c1=new CountedItem("Pens",4.50,10);
		System.out.println("\nName : "+c1.getName());
		System.out.println("Unit Price : "+c1.getPrice());
		System.out.println("Quantity : "+c1.getQuantity());
		System.out.println(c1.toString());

	}
}