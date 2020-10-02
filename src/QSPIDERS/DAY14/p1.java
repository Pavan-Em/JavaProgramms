package QSPIDERS.DAY14;

import java.util.Scanner;
								/*-------------- Converting one NumberSystem to another NumberSystem -----------------*/
public class p1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Convert any NumberSystem to another NumberSystem");
		System.out.print("Enter From NumberSustem : ");
		int from=s.nextInt();
		System.out.print("Enetr To NumberSystem : ");
		int to=s.nextInt();
		s.nextLine();
		System.out.print("Enter Number : ");
		String num=s.nextLine().toUpperCase().trim();
		String out=convertTo(num, from, to);
		System.out.println("From : "+num);
		System.out.println("To   : "+out);
	}
	
	public static String convertTo(String num,int from,int to)
	{
		int n=getDecimal(num,from);
		String temp="0123456789ABCDEF";
		String out="";
		while(n>0)
		{
			int last=n%to;
			out=temp.charAt(last)+out;
			n=n/to;
		}
		return out;
	}
	
	public static int getDecimal(String num,int from)
	{
		String n=num;
		String temp="0123456789ABCDEF";
		int sum=0;
		int power=1;
		for(int i=n.length()-1;i>=0;i--)
		{
			sum=sum+(temp.indexOf(n.charAt(i))*power);
			power=power*from;
		}
		return sum;
	}
}
