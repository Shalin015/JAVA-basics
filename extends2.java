class a
{
	void get()
	{
		int d=50;
		System.out.println("D : "+d);
	}
}
class b extends a
{
	void put()
	{
		System.out.println("Hey buddy's");
	}
}
class extends2
{
	public static void main(String ar[])
	{
		b s1=new b();
		s1.put();
		s1.get();
	}
}