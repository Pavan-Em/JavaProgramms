package QSPIDERS.DAY6;

import java.util.Scanner;

/*
					   Give a non negative int n, return the count of occurence of 7
					   as a digit, so for example 717 yields 2
					   
					   count7(717)--->2
					   count7(7)----->1
					   count7(123)--->0
					   
					 */
public class p2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Non Negative Number:");
		int m=s.nextInt();
		int n=m;
		System.out.print("Enter Target Number:");
		int check=s.nextInt();
		int count=0;
		if(n>=0)
		{
			while(n>0)
			{
				int last=n%10;
				if(last==check)
					count++;
				n=n/10;
			}
		}
		else
			System.out.println("You Entered a Negative Number");
		System.out.println("Number of "+check+"'s in number "+m+" is : "+count);
		s.close();
				
	}

}
