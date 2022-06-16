class Deposit
{
	int p,n;
	double r;
	double a;
	double termDeposit(int p,double r,int n)//termdeposit parameterized function
	{
		this.p=p;
		this.r=r;
		this.n=n;
		a=p*Math.pow((1+(r/100)),n);//formula given
		System.out.println("Term Deposit : "+a);
		return 0;
	}

	double recurDeposit(int p,double r,int n)//recurdeposit parameterized function
	{
		this.p=p;
		this.r=r;
		this.n=n;
		a=p*n+p*(n*(n+1))/2*r/100*1/12;//formula given
		System.out.println("Recur Deposit : "+a);
		return 0;
	}
}
class DepositMain
{
	public static void main(String args[])
	{
		Deposit d=new Deposit();//object create
		d.termDeposit(5000,5,5);//call
		d.recurDeposit(5000,5,5);//call
		
	}
}