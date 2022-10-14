class a
{
	run()
	{
		System.out.println("Walk");
	}
}
class b extends a
{
	run()
	{
		System.out.println("Run");
	}
}
class c
{
	public static void main(String ar[])
	{
		b d=new b();
		d.run();
		b e= new a();
		e.run();
	}
}