class typecast
{
	public static void main(String ar[])
	{
		int a=10;
		float pi;
		pi=a;
		System.out.println("Implicit A :"+a);
		System.out.println("Implicit pi :"+pi);
		int s=30;
		float u=(int)s;
		System.out.println("Explicit S :"+s);
		System.out.println("Explicit U :"+u);
	}
}