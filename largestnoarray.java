import java.util.*;
import java.io.*;

class ary
{
	public static void main(String ar[])
	{
		int[] i={5,10,21,3,15,34};
		int a=i.length;
		int max=i[0];
		for(int j=0;j<a;j++)
		{
			if(i[j]>max)
			{
				max=i[j];			
			}
		}
		System.out.println("max value is  : "+max);	
	}
}
