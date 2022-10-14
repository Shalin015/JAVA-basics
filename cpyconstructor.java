import java.io.*;

class shalin
{
	int a;
	String n;
	shalin(int age, String name)
	{
		this.a=age;
		this.n=name;
		System.out.println("Given value is store");
	}
	shalin(shalin s)
	{
		System.out.println("You Name : "+s.n+"\nYour Age : "+s.a);
	}
}
class cpyconstructor
{
	public static void main (String ar[])
	{
		shalin s1=new shalin(15,"shalin");
		shalin s2=new shalin(s1);
	}
}
