package QSPIDERS.DAY14;

import java.util.Scanner;
						/*------------------------ Check Number is Palindrome ----------------------*/
public class p4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Check Palindrome");
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		boolean isPalindrome=isPalindrome(num);
		if(isPalindrome)
			System.out.println(num+" is a Palindrome Number");
		else
			System.out.println(num+" is Not a Palindrome Number");
	}
	
	public static boolean isPalindrome(int num)
	{
		int n=num;
		int num2=0;
		while(n>0)
		{
			int last=n%10;
			num2=num2*10+last;
			n=n/10;
		}
		if(num2 == num)
			return true;
		else
			return false;
	}
}
