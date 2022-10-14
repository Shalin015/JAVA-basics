import java.util.*;
import java.io.*;

class arr
{
	public static void main(String ar[])
	{
		int[] a={3,4,5,6,7};
		int temp1=0,temp2=0,sum=0;
		int b=a.length;
		for(int i=0;i<=b;i++)
		{
			for(int j=0;j<=b;j++)
			{
				if(a[j]>a[i])
				{
					temp1=a[j];
					temp2=a[i];
				}
			}
		}
		sum=temp1-temp2;
		System.out.println(sum);
	}
}