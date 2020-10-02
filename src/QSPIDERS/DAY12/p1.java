package QSPIDERS.DAY12;

import java.util.Scanner;

/* Convert Binary to Decimal   */
public class p1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Convert AnyNumber to Decimal");
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		System.out.print("Enter NumberSystem : ");
		int system=s.nextInt();
		int decimal=convert(num,system);
		System.out.println("Decimal Number for "+num+" is "+decimal);
	}
	
	public static int convert(int num,int system)
	{
		int n=num;
		int sum=0;
		//String temp="0123456789ABCDEF";
		int pow=0;
		while(n>0)
		{
			int last=n%10;
			sum=sum+(last*getmultiple(pow++,system));
			n=n/10;
		}
		return sum;
	}
	
	public static int getmultiple(int pow,int system)
	{
		if(pow!=0)
		{
			int mul=1;
			for(int i=1;i<=pow;i++)
			{
				mul=mul*system;
			}
			return mul;
		}
		else
			return 1;
	}
	

}

