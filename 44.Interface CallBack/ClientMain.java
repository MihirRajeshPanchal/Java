interface Callback
{
	void callback(int param);
}
class Client implements Callback
{
	public void callback(int p)
	{
		System.out.println("Callback called with "+p);
	}
	void nonIfaceMeth()
	{
		System.out.println("Classes that implement interfaces "+"may also define other members,too.");
	}
}

class ClientMain
{
	public static void main(String args[])
	{
		Client c=new Client();
		Callback cb;
		cb=c;
		cb.callback(5);
		//cb.nonIfaceMeth(); //error
	}
}