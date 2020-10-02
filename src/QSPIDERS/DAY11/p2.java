package QSPIDERS.DAY11;
								/* WAP to convert Decimal to Binart   */
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=s.nextInt();
		String st=toBinary(num);
		int binarynum=Integer.parseInt(st);
		System.out.println("Binary Number for "+num+" is "+binarynum);
	}
	
	public static String toBinary(int num)
	{
		int n=num;
		String binary="";
		while(n>0)
		{
			binary=n%2+binary;
			n=n/2;
		}
		return binary;
	}
	
}
