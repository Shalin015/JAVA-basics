class reversenum
{
	public static void main(String ar[])
	{
		int a=1234;
		int i=0,digit;
		while(a!=0)
		{
			digit=a%10;
			i=i*10+digit;
			a=a/10;
		}
		System.out.println("Reverse number : "+i);
	}
}