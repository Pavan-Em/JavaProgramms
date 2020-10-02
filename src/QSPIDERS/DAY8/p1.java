package QSPIDERS.DAY8;

import java.util.Scanner;
											/* Find the factorial of given number  */
public class p1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=s.nextInt();
		int fact=findfact(n);
		System.out.println("\nUsing Recursion with ReturnType\nFactorial of "+n+" is "+fact);
		
		System.out.println("=======================================");
		
		System.out.println("Using Loop");
		int res=findfact3(n);
		System.out.println("Using Loop\nFactorial of "+n+" is "+res);
		
		System.out.println("=======================================");
		System.out.println("Using Recursion Without ReturnType");
		findfact2(n, 1);
	}
	
	public static int findfact(int n)
	{
		if(n==1)
			return 1;
		return findfact(n-1)*n;
	}
	
	public static void findfact2(int num,int res)
	{
		if(num==1)
			System.out.println("Factorial is "+res);
		else
		{
			res=res*num;
			findfact2(num-1,res);
		}
	}
	
	public static int findfact3(int n)
	{
		int out=1;
		for(int i=n;i>1;i--)
		{
			out=out*i;
		}
		return out;
	}
}
