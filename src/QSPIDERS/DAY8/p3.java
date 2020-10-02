package QSPIDERS.DAY8;
							/* WAP to Display Prime Numbers   */
import java.util.Scanner;

public class p3 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		//to check the number is Prime or not
		System.out.println("Check for Prime Number");
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		if(isPrime(num))
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not a Prime Number");
		System.out.println("=======================================");
		
		//Displaying all the prime numbers in the Range of Numbers
		System.out.println("Display Prime NUmbers in the Range of Numbers");
		System.out.print("Enter From Number : ");
		int num1=s.nextInt();
		System.out.print("Enter To Number : ");
		int num2=s.nextInt();
		printPrine(num1, num2);
		System.out.println("========================================");
		
		//Display first 4 PrimeNumbers
		System.out.println("Display Next PrimeNumbers from the given Number");
		nextprimt();
		System.out.println("========================================");
		
		//Sum of Prime Numbers from given numbers
		System.out.println("Display Sum of next PrimeNumbers from the given Number ");
		primesum();
	}
	public static boolean isPrime(int num)
	{
		int n=num;
		for(int i=2;i<=num/2;i++)  //------------------------------------> Increment till num/2 is Enough
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void printPrine(int num1,int num2)
	{
		System.out.println("PrimeNumbers in the Range "+num1+" to "+num2+" are");
		for(int i=num1;i<=num2;i++)
		{
			if(i>1)
			{
				if(isPrime(i))
					System.out.println(i);
			}
		}
	}
	public static void nextprimt()
	{
		System.out.print("Enetr Number : ");
		int n=s.nextInt();
		System.out.print("Enter Count of PrineNumber : ");
		int num=s.nextInt();
		int count=1;
		System.out.println("Next "+num+" PrimeNumbers from "+n);
		for(int i=n;count<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				count++;
			}
		}	
	}
	public static void primesum()
	{
		System.out.print("Enter Number : ");
		int n=s.nextInt();
		System.out.println("Enter Count of PrimeNumber : ");
		int num=s.nextInt();
		int count=1;
		int sum=0;
		System.out.println("Sum of Next "+num+" PrimeNumber from "+n);
		for(int i=n;count<=num;i++)
		{
			if(isPrime(i))
			{
				sum=sum+i;
				count++;
			}
		}
		System.out.println("Sum : "+sum);
	}
}
