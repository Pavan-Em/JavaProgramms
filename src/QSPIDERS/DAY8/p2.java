package QSPIDERS.DAY8;

import java.util.Scanner;
						/* String number 
						 * Sum of factorial of all the digits in the number equal to given number
						 */
public class p2 {

	public static void main(String[] args) {
		
		//todeteimine given number is Strong or Not
		System.out.println("Check fro StrongNumber");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=s.nextInt();
		boolean check=isStrong1(num);
		if(check)
			System.out.println(num+" is  StrongNumber");
		else
			System.out.println(num+" is Not a StrongNumber");
		System.out.println("=================================");
		
		//to display all the StrongNumber in that Range Of Numbers
		System.out.println("Strong Number in that Range Of Number");
		System.out.print("Enetr From Number:");
		int num1=s.nextInt();
		System.out.print("Enter To Number:");
		int num2=s.nextInt();
		isStrongRange(num1, num2);
		System.out.println("=================================");
		
		//Display first 4 StrongNumber
		System.out.println("Display StrongNumbers");
		first4Strong();
		System.out.println("=================================");
		
		//Display Sum of First 4 StrongNumber
		System.out.println("Display Sum of StrongNumber");
		sumof4Strong();
	}
	
	public static boolean isStrong1(int num)
	{
		int n=num;
		int sum=0;
		while(n>0)
		{
			int last=n%10;
			sum=sum+loopfact(last);
			n=n/10;
		}
		return sum==num;
	}
	public static int fact(int num)
	{
		if(num==1)
			return 1;
		return fact(num-1)*num;
	}
	public static int loopfact(int num)
	{
		int res=1;
		for(int i=num;i>1;i--)
		{
			res=res*i;
		}
		return res;
	}
	public static void isStrongRange(int num1,int num2)
	{
		System.out.println("Strong Numbers in the Range "+num1+" and "+num2+" are");
		for(int i=num1;i<=num2;i++)
		{
			if(isStrong1(i))
				System.out.println(i);
		}
	}
	public static void first4Strong()
	{		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number of Strong Number you want:");
		int num=s.nextInt();
		System.out.println("First "+num+" StrongNumbers are");
		int count=1;
		for(int i=1;count<=num;i++)
		{
			if(isStrong1(i))
			{
				System.out.println(i);
				count++;
			}
		}
	}
	public static void sumof4Strong()
	{
		Scanner s=new Scanner(System.in);
		int count=1;
		int sum=0;
		System.out.print("Enetr Count of StrongNumber");
		int num=s.nextInt();
		for(int i=1;count<=num;i++)
		{
			if(isStrong1(i))
			{
				sum=sum+i;
				count++;
			}
		}
		System.out.println("Sum : "+sum);
	}
}
