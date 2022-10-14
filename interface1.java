interface abc
{
	int a=10;
	void disp();
}
interface def
{
	void disp2();
}
class ghi implements def,abc
{
	public void disp()
	{
		System.out.println("Hello...");
	}
	public void disp2()
	{
		System.out.println("Gmm...");
	}
}
class interface1
{
	public static void main(String ar[])
	{
		ghi s1=new ghi();
		s1.disp();
		s1.disp2();
	}
}