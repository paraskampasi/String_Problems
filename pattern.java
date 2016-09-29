package strngs;
import java.util.*;
public class pattern
{
  
public boolean test(String str1, String str2)
{
	   Boolean b=true;
	   StringBuilder str=new StringBuilder(str1);
	   Set<Character> pattrn= new HashSet<>();
	   
	   for(int i=0;i<str2.length();i++)//Add characters to pattrn
	   {
		 pattrn.add(str2.charAt(i));
	   }
	
	   for(int i=str1.length()-1; i>=0; i--)//deleting characters from str which are not present in the pattern
	   {
		   
		   if(!pattrn.contains(str.charAt(i)))
			   str.deleteCharAt(i);
	   }

       for(int i=str.length()-1;i>0;i--)//removing consecutive duplicates of pattrn elements
       {
    	   if(str.charAt(i)==str.charAt(i-1))
    		   str.deleteCharAt(i);
       }

       if(str2.length()!=str.length())//checking for equal lengths
    	   return false;
     
       if(!str2.equalsIgnoreCase(str.toString()))
       { return false;}
       
       return b;

}
}
class driver
{
   public static void main(String args[])
   {
	   
	   Scanner sc=new Scanner(System.in);
	   String string,pattern;
	   
	   System.out.println("Enter the string");
	   string=sc.nextLine();
	   
	   System.out.println("Enter the pattern");
	   pattern=sc.nextLine();
	   
	   pattern obj = new pattern();
	   Boolean b=obj.test(string,pattern);
	   
	   if(b==true)
	   System.out.println("pattern is present");
	   else
	   System.out.println("pattern is absent");
	   
	   
   }

}