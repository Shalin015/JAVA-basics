class largestnoarray
{
	public static int array(int[] a)
	{
		int l=a.length;
		int big;
		for(int i=0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(a[i]>a[j])
				{
					big=a[i];
					a[i]=a[j];
					a[j]=big;
				}
			}
		}
		return a[l-1];
	}
	public static void main (String ar[])
	{
		int a[]={1,2,3,4,5,7,6};
		System.out.println(""+array(a));
	}
}
