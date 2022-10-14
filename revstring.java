// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

class revstring
{
    public static void main(String[] args) 
	{
        System.out.println("Hello, World!");
        String a = "madhav";
        String rev="";
        for(char c:a.toCharArray())
		{ 
            rev=c+rev;
        }
         System.out.println(rev);
    }
}