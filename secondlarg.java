class secondlarg
{
	public static void main(String ar[])
	{
		int a=10,b=30,c=20;
		if(a>b && a<c || a<b && a>c)
		{
			System.out.println("A is second large number");
		}
		else if(b>a && b<c || b<a && b>c)
		{
			System.out.println("B is second large number");
		}
		else if(a=b && b=c)
		{
			System.out.println("All value are equal");
			System.out.println("All value are equal");
		}
		else
		{
			System.out.println("C is second large number");
		}
	}
}