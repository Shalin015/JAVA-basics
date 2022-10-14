import java.util.*;
import java.io.*;

class fibonacci
{
	public static void main(String ar[])
	{
		int a=0, b=1, c, e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of fibonacci series want : ");
		e=sc.nextInt();
		System.out.println(a+"\n"+b);
		for(int i=2; i<e; i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}
}