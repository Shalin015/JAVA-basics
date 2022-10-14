class a
{
	c()
	{
		System.out.println("Helloo");
	}
	c(int d)
	{
		System.out.println(d);
	}
}
class e
{
	public static void main(String ar[])
	{
		a a1=new a();
		a1.c();
		a1.c(12);
	}
}