package QSPIDERS.DAY6;

import java.util.Scanner;

/*
									     WAP to print Without using Loop
									     98765432123456789  
									     
									 */

public class p5 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Non-Negative Number:");
		int n=s.nextInt();
		print(n);
	}
	
	public static void print(int n)
	{
		if(n==1)
		{
			System.out.print(n);
			return;
		}
		System.out.print(n);		
		print(n-1);
		System.out.print(n);
	}

}
