import java.io.*;

class shalin
{
	shalin(String name)	// parameterized constructor create
	{
		System.out.println("Hiii "+name+" , Welcome!!!");
	}
}
class paraconstructor
{
	public static void main(String ar[])
	{
		shalin s=new shalin("Shalin");	// parameterized constructor call with given value
	}
}