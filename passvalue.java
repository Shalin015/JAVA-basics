class a
{	
	int b=100;
	void get(int b)
	{
		System.out.println("B :"+b);
	}
}
class passvalue
{
	public static void main(String ar[])
	{
		a s1=new a();
		System.out.println("globle B :"+s1.b);
		s1.get(200);
	}
}
