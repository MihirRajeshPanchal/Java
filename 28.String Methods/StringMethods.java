import java.util.Scanner;
class StringMethods
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

	//String Length
	String str="Mihir";
	int l=str.length();
	System.out.println("Length of String 'Mihir' is "+l);

	//Character array into string
	char c[]={'D','A','Y'};
	String s = new String(c);
	System.out.println("Array of Character to String : "+s);

	//Finding char at specified Index
	String a="Hello";
	char ch = a.charAt(3);
	System.out.println("Finding char at specified Index : "+ch);

	//Finding index at specified Character
	String b="Good";
	int x= b.indexOf('o');//will return first occurence
	System.out.println("Finding index at specified Character : "+x);

	//Finding last index at specified Character
	String d="ABCDEFGHIJKLMNOPQRSTUVWXYZA";
	int y= d.lastIndexOf('A');//will return first occurence
	System.out.println("Finding last index at specified Character : "+y);

	//Extracting string from another string
	String e="Hello Friends!!!!";
	String ex=e.substring(6,12);
	System.out.println("Extracting string from another string : "+ex);

	//To convert a string into an array of characters
	String f="Hello";
	char fa[]=f.toCharArray();
	System.out.print("Character Array is :    ");
	for(int i=0;i<fa.length;i++)
	{
		System.out.print(fa[i]+"\t");
	}
	System.out.print("\n");
	//Convert String to upper case
	String g="Music";
	System.out.println("Convert String to upper case : "+g.toUpperCase());

	//Convert String to lower case
	String h="Dance";
	System.out.println("Convert String to upper case : "+h.toLowerCase());

	//String Concatenation
	String i="Mihir";
	String j="Panchal";
	String k=i.concat(j);
	System.out.println("String Concatenation : "+k);

	//String Replace
	String n="Hello";
	String m=n.replace('l','k');
	System.out.println("Replace Character in string : "+m);

	//String Trim
	String o="                      Hello All          ";
	System.out.println("String Trim : "+o.trim());

	//String Equals;
	String p="Mihir";
	String q="Mihir";
	System.out.println("String Equals : "+p.equals(q));

	//String Equals Ignore;
	String r="Mihir";
	String t="mihir";
	System.out.println("String Equals : "+r.equalsIgnoreCase(t));

	//String Compares To
	String u="A";
	String v="1";
	System.out.println("String Compare A-B : "+u.compareTo(v));
	System.out.println("String Compare B-A : "+v.compareTo("1"));

	System.out.print("GOCORONA".substring(2,5));
	//
	}
}