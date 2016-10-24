package chapter1;
import java.io.*;
import java.util.*;
public class one 
{

	private static Scanner sc;

	public static void main(String args[])throws IOException
	{
	  sc = new Scanner(System.in);
	  System.out.println("Enter string :");	
	  String s=sc.next();
	  test t = new test();
	  t.setTest(s);
	  t.getResult();
	  t.getResult2();
	}
	
	
}

 class test
{
	String test="";
	
	public void setTest(String test) {
		this.test = test;
	}
	
    
	public void getResult() //First method with time-complexity O(n^2)
	{
		int flag=0;
		String temp=test;
		int length=test.length();
		for(int i=0;i<length;i++)
		{
			if(temp.charAt(i)==' ') {System.out.println("helooo"); continue; }
				
			
			for(int j=i+1;j<length-1;j++)
			{
				
				
				if(temp.charAt(i)==temp.charAt(j))
				{ 
					flag=1;
					System.out.println("All characters are not unique");	
				}
			}
		}
		
		if(flag==0)
		System.out.println("All unique characters");
		
	}

	
	public void getResult2()//Second method with time-complexity O(n)
	{
		int flag = 0;

		boolean[] arr=new boolean[256];// Since Unicode has 256 alphabets
	    for(int i=0;i<test.length(); i++)
	    {
	    	int val=test.charAt(i);
	    	if(arr[val])
	    	{
	    	    flag = 1;
				System.out.println("All characters are not unique");	
	    	    return;
	    	}
	    arr[val]=true;
	    
	    }
	    if(flag==0)
		System.out.println("All unique characters");
	
	}
	
	
}