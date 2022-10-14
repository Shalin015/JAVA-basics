abstract class a
{
	abstract void get();
}
class b extends a
{
	void get()
	{
		System.out.println("Hey Buddy's");
	}
}
class abstract1
{
	public static void main(String ar[])
	{
		b s1=new b();
		s1.get();
	}
}