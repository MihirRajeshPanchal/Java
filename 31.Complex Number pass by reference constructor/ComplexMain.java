class Complex
{
	int real,img;
	Complex(){}
	Complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}

	void getComp()
	{
		System.out.println("Real Part = "+real);
		System.out.println("Imaginary Part = "+img);
	}

	Complex addComp(Complex c2)
	{
		Complex ans=new Complex();
		ans.real=this.real+c2.real;
		ans.img=this.img+c2.img;
		return ans;
	}
}
class ComplexMain
{
	public static void main(String args[])
	{
		Complex c1=new Complex(2,5);
		Complex c2=new Complex(4,8);
		c1.getComp();
		c2.getComp();
		Complex c3;
		c3=c1.addComp(c2);
		c3.getComp();
	}
}