package QSPIDERS.DAY14;

import java.util.Scanner;
						/*----------------------------- Reverse Number ---------------------------------*/
public class p3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		String reverseNumber = revNumber(num);
		System.out.println("Reverse Number of "+num+" is "+reverseNumber);
	}
	
	public static String revNumber(int num)
	{
		int n=num;
		int reverseNumber=0;
		String reverse="";
		while(n>0)
		{
			int last=n%10;
			//reverseNumber=reverseNumber*10+last;
			reverse=reverse+last;
			n=n/10;
		}
		return reverse;
	}
}
