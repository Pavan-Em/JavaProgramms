package QSPIDERS.DAY11;

import java.util.Scanner;

													/*  WAP to conver Decimal to HexaDecimal   */
public class p4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Convert Decimal to Any NumberSystem ");
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		String st=hexaDecimal(num);
		System.out.println("Your Required NumberSystem for "+num+" is "+st);
	}
	
	public static String hexaDecimal(int num)
	{
		int n=num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter NumberSystem : ");
		int numberSystem=s.nextInt();
		String hexa="";
		while(n>0)
		{
			int last=n%numberSystem;
			switch(last)
			{
			case 10: hexa='A'+hexa;
			break;
			case 11: hexa='B'+hexa;
			break;
			case 12: hexa='C'+hexa;
			break;
			case 13: hexa='D'+hexa;
			break;
			case 14: hexa='E'+hexa;
			break;
			case 15: hexa='F'+hexa;
			break;
			default : hexa=last+hexa;
			}
			n=n/numberSystem;
		}
		return hexa;
	}
}
