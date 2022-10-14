import java.io.*;
import java.util.*;

class DigitSum
{
	public static void main(String ar[])
	{
		int i,a,j,b,s=0;
		String num;
		Scanner sc = new Scanner(System.in); // create scanner for take value from user 
		System.out.println("Enter digits : ");
		num = sc.next(); // take value from user in string
		int[] digit = new int[num.length()]; // string length take as a number of elements in array
		for(b=0;b<num.length();b++) // loop to call all character one by one using there position
		{
			digit[b] = Integer.parseInt(Character.toString(num.charAt(b))); // string digit convert to integer 
		}
		a=digit.length; // take array length to number of time loop can run
		for(j=0;j<a;j++) // using loop we call values by there position
		{
			s = s + digit[j]; // digit call then doing sum and store value into the "s" variable
		}
		System.out.println("Your sum : "+s);
	}
}