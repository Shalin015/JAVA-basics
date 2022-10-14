import java.util.*;
import java.io.*;

class pali
{
	public static void main(String ar[])
	{
		int n,temp,r,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrom number");
		}
		else
		{
			System.out.println("Not palindrom number");
		}
	}
}