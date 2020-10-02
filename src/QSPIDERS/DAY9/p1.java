package QSPIDERS.DAY9;

import java.util.Scanner;

										/* 
										   WAP to determine weather the given number is ArmStrong Number or Not
										   5    == 5 power 1
										   153  == 1 power 3 + 5 power 3 + 3 power 3
										   2266 == 2 power 4 + 2 power 4 + 6 power 4 + 6 power 4
									   */
public class p1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Check for AmStrong Number");
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		if(isArmStrong(num))
			System.out.println(num+" is an ArmStrong Number");
		else
			System.out.println(num+" is not an ArmStrong Number");
		System.out.println("==================================================");
		System.out.println("ArmStrong Numbers in the Range of Numbers");
		System.out.println("Enter From Number : ");
		int num1=s.nextInt();
		System.out.println("Enter To Number :" );
		int num2=s.nextInt();
		isArmStrongRange(num1, num2);
	}
	
	public static int getLength(int num)
	{
		int n=num;
		int length=0;
		while(n>0)
		{
			n=n/10;
			length++;
		}
		//System.out.println("Lenght 1 :"+length);
		
		//different way to find length
		int length2=(int)Math.floor(Math.log10(num))+1;
		//System.out.println("Length 2 : "+length2);
		return length;
	}
	
	public static boolean isArmStrong(int num)
	{
		int length=getLength(num);
		int n=num;
		int sum=0;		
		while(n>0)
		{
			int last=n%10;
			sum=sum+getMul(last,length);
			n=n/10;
		}
		return num==sum;
	}
	
	public static int getMul(int num,int length)
	{
		int mul=1;
			for(int i=1;i<=length;i++)
			{
				mul=mul*num;
				
			}
		return mul;
	}
	
	public static void isArmStrongRange(int num1,int num2)
	{
		System.out.println("ArmStrong Numbers in Rnage "+num1+" to "+num2);
		for(int i=num1;i<=num2;i++)
		{
			if(isArmStrong(i))
				System.out.println(i);
		}
	}
}
