class avgarray
{
	public static void main(String ar[])
	{
		int n=5,r=0,avg;
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<n;i++)
		{
			r=r+a[i];
		}
		System.out.println("Sum ="+r);
		avg=r/10;
		System.out.println("Avg = "+avg);
	}
}