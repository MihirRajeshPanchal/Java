import java.util.Scanner;
class Invoice
{
	private String id,desc;
	private int qty;
	private double unitPrice;

	Invoice(String id,String desc,int qty,double unitPrice)
	{
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}

	String getID()
	{
		return id;
	}

	String getDesc()
	{
		return desc;
	}

	int getQty()
	{
		return qty;
	}

	void setQty(int qty)
	{
		this.qty=qty;
	}

	double getUnitPrice()
	{
		return unitPrice;
	}

	void setUnitPrice(double unitPrice)
	{
		this.unitPrice=unitPrice;
	}

	double getTotal()
	{
		return unitPrice*qty;
	}

	public String toString()
	{
		return "InvoiceItem[ID="+id+",Desc="+desc+",Qty="+qty+",UnitPrice="+unitPrice+"]\n";
	}

}
class InvoiceMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int qty;
		double unitPrice;
		Invoice i1=new Invoice("I0001","CD",5,50.0);
		System.out.println("ID : "+i1.getID());
		System.out.println("Desc : "+i1.getDesc());
		System.out.println("Quantity : "+i1.getQty());
		System.out.println("Unit Price : "+i1.getUnitPrice());
		System.out.println("Total : "+i1.getTotal());
		System.out.println(i1.toString());

		Invoice i2=new Invoice("I0001","CD",0,0.0);
		System.out.print("Enter Quantity : ");
		qty=sc.nextInt();
		i2.setQty(qty);
		System.out.print("Enter Unit Price : ");
		unitPrice=sc.nextDouble();
		i2.setUnitPrice(unitPrice);
		System.out.println("\nID : "+i2.getID());
		System.out.println("Desc : "+i2.getDesc());
		System.out.println("Quantity : "+i2.getQty());
		System.out.println("Unit Price : "+i2.getUnitPrice());
		System.out.println("Total : "+i2.getTotal());
		System.out.println(i2.toString());
	}
}