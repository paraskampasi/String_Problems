package chapter1;

import java.io.IOException;
import java.util.Scanner;

public class three {
	
	private static Scanner sc;

	public static void main(String args[])throws IOException
	{
	  sc = new Scanner(System.in);
	  System.out.println("Enter two string :");	
	  String s=sc.next();
	  String ss=sc.next();
	  permutation t = new permutation();
	  t.checkPerm(s, ss);
	}
	

}

class permutation
{ 
	public void checkPerm(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			{	System.out.println("Not a permutation of one another");
		         return;
			}    

	    int[] count=new int[256];
	    char arr[]=s1.toCharArray();
		for(Character c: arr)
		{
            count[c]++;
		}
	
	for(int i=0;i<s2.length();i++)
	{
		int c=s2.charAt(i);
		count[c]-=1;
		if(count[c]<0)
		{
			System.out.println("Not a permutation of one another");
			return;
		}
	}
	
	System.out.println("The strings are permutations of one another");
		return;
	}

}
