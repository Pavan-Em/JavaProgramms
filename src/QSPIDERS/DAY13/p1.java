package QSPIDERS.DAY13;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		System.out.println('A'%'0');
		Scanner s=new Scanner(System.in);
		System.out.println("Convert AnyNumber to DecimalNumber");
		System.out.print("Enter Number : ");
		String num=s.nextLine().toUpperCase().trim();
		System.out.print("Enter NumberSystem : ");
		int numberSystem=s.nextInt();
		int decimal=toConvert(num, numberSystem);
		System.out.println("Converted NumberSystem of "+num+" is "+decimal);
	}
	
	public static int toConvert(String num,int numberSystem)
	{
		String temp="0123456789ABCDEF";
		int sum=0;
		int pow=0;
		int power=1;
		for(int i=num.length()-1;i>=0;i--)
		{
			//System.out.println(num.charAt(i));
			//System.out.println(temp.indexOf(num.charAt(i)));
			//sum=sum+(temp.indexOf(num.charAt(i))*getMultiple(pow++,numberSystem));  //---->Beware of this Line
						/*       OR        */
			sum=sum+(temp.indexOf(num.charAt(i))*power);  //----->very very optimized code
			power=power*numberSystem;
		}
		return sum;
	}
	
	public static int getMultiple(int pow,int numberSystem)
	{
		int mul=1;
			for(int i=1;i<=pow;i++)
			{
				mul=mul*numberSystem;
			}
			return mul;
	}
}

