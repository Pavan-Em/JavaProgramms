package QSPIDERS.DAY6;
import java.util.Scanner;
					/* 
					  Given a non-negetive int n, return the sum of its number
					  
					  sumDigit(126)--->9
					  sumDigit(49)---->13
					  
					 */
public class p1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Non-Negetive Number:");
		int n=s.nextInt();
		int m=n;
		int sum=0;
		if(m>=0)
		{
			while(m>0)
			{
				int last=m%10;
				sum=sum+last;
				m=m/10;
			}
		}
		else
			System.out.println("You Entered No");
		System.out.println("The Individual Number Sum of "+n+" is : "+sum);
		s.close();
	}
}
