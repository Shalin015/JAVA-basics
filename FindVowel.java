import java.util.*;
import java.io.*;

class FindVowel
{
	public static char vowel[]={'a','e','i','o','u','A','E','I','O','U'}; // Vowel add into array
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word : "); 
		String word=sc.nextLine(); // take string from user
		
		int i,j;
		int v=0;
		int c=word.length(); // take String length and store into c variable
		for(i=0;i<9;i++) // loop for vowel check 9 is a total number of vowel
		{
			for(j=0;j<word.length();j++) // loop for word character
			{
				if(word.charAt(j) == vowel[i]) // compair word character with vowel array character 
				{
					v++; // if vowel comes in word then v value will increase 
				}
			}
		}
		c = c-v; // c(word length) - v(number of vowel)  to get number of consonants in word
		System.out.println("Number of vowels is : "+v);
		System.out.println("Number of consonants is : "+c);
		System.out.println("Number of Character in word is : "+word.length());
	}
}