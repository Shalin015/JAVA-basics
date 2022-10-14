final class a
{
	final int a=10;
	final void disp()
	{
		System.out.println("Hey Buddy");
	}
}
class b
{
	void disp()
	{
		System.out.println("Bye Buddys");
	}
}
class final1
{
	public static void main(String ar[])
	{
		a s1=new a();
		b s2=new b();
		s1.disp();
		s2.disp();
		System.out.println("A :"+s1.a);
	}
}