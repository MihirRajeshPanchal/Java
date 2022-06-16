interface InheritanceInterface
{
	void interfaceMessage();
}
class Inheritance
{
	void inheritanceMessage()
	{
		System.out.println("Hello");
	}
}
class MultipleInheritance extends Inheritance implements InheritanceInterface 
{
	public void interfaceMessage()
	{
		System.out.println("Interface Message");
	}
}
class MultipleInheritanceMain
{
	public static void main(String args[])
	{
		MultipleInheritance mi=new MultipleInheritance();
		mi.inheritanceMessage();
		mi.interfaceMessage();
	}
}
//output
//Hello
//Interface Message