package QSPIDERS.DAY11;
							/*   WAP to convrt Decimal to Octal   */
import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Conver Decimal to Octal");
		System.out.print("Enter a Number : ");
		int num=s.nextInt();
		String st=toOctal(num);
		System.out.println("Binary Number for "+num+" is "+st);
	}
	
	public static String toOctal(int num)
	{
		int n=num;
		String octal="";
		while(n>0)
		{
			octal=n%8+octal;
			n=n/8;
		}
		return octal;
	}
}
