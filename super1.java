class a
{
	void get()
	{
		System.out.println("Hiii");
	}
}
class b extends a
{
	void put()
	{
		super.get();
		System.out.println("Hey buddy");
	}
}
class super1
{
	public static void main(String ar[])
	{
		b s1=new b();
		s1.put();
	}
}