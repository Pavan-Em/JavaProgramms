package QSPIDERS.DAY14;
import java.util.Scanner;
							/*-------------------------  Fibonanci Series ------------------------*/
public class p2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Count of Number : ");
		int range=s.nextInt();
		displayFibonanci(range);
		System.out.println("\n===================================");
		System.out.print("Enter Number to get Fibonanci : ");
		int at=s.nextInt();
		int getFibonanci=getFibonanci(at);
		System.out.println(at+"th Fibonanci Number is "+getFibonanci);
	}
	
	public static void displayFibonanci(int range)
	{
		int a=0,b=1;
		if(range <= 2)
		{
			System.out.print(a+" ");
			if(range == 2)
				System.out.println(b+" ");
		}
		
		for(int i=1;i<=range-2;i++)
		{
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}
	
	public static int getFibonanci(int at)
	{
		int a=0,b=1;
		if(at==1)
			return a;
		else if(at==2 )
			return b;
		else
		{
			for(int i=1;i<=at;i++)
			{
				int sum=a+b;
				if(i==at-2)
					return sum;
				a=b;
				b=sum;
			}
		}
		return 0;
	}
}
