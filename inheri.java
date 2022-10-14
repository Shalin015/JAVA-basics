class demo1
{
	void abc()
	{
		int a=10;
		System.out.println("A :"+a);
	}
}
class demo2 extends demo1
{
	void def()
	{
		System.out.println("class demo2 call demo1");
	}
}
class inheri
{
	public static void main(String ar[])
	{
		demo2 s1=new demo2();
		s1.abc();
		s1.def();
	}
}