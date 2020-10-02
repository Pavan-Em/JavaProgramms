package QSPIDERS.DAY19;

import java.util.Scanner;

/* WAP which takes a string aa input and remove every repeated character except the last ,
				  Even remove the first one and print the result String as oupput
				  
				  TEST CASE
				  nextgencoder---->xtgncoder        Welcome---->Upper case not allowed
				  hello       ---->helo             welcome---->wlcome
				  
				 */
public class p92 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Word : ");
		String word = s.nextLine();
		removeDuplicateElement(word);
		
	}
	
	public static void removeDuplicateElement(String s)
	{
		if(s.matches("[a-z]+"))
		{
			String res = "";
			for(int i=s.length()-1 ;i>=0 ; i--)
			{
				char temp = s.charAt(i);
				if(!res.contains(""+temp))
				{
					res=temp+res;
				}
			}
			System.out.println("Original word : "+s);
			System.out.println("Altered Word  : "+res);
		}
		else
			System.out.println("Upper case not Allowed");
	}
}