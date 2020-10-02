package QSPIDERS.DAY9;

import java.util.Scanner;

/* WAP to check given number is Perfect Number or Not  */
public class p2 {
	public static void main(String[] args) {
		System.out.println("Check for Perfect Number");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		if(isPerfect(num))
			System.out.println(num+" is a Perfect Number");
		else
			System.out.println(num+" is not a Perfect Number");
		System.out.println("======================================");
		
		//Perfect Number in the Range of Numbers
		System.out.println("Check for Perfect Numbers in the Range of Numbers");
		System.out.print("Enter from Number : ");
		int num1=s.nextInt();
		System.out.print("enter To Number : ");
		int num2=s.nextInt();
		perfectInRange(num1, num2);
	}
	
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)              //------------------>Maximum Divisor is num/2
		{
			if(num%i==0)
				sum+=i;
		}
		return sum==num;
	}
	
	public static void perfectInRange(int num1,int num2)
	{
		System.out.println("Perfect Numbers in the Range "+num1+" to "+num2);
		for(int i=num1;i<=num2;i++)
		{
			if(isPerfect(i))
				System.out.println(i);
		}
	}
	
	
}
