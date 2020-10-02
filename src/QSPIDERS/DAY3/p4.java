package QSPIDERS.DAY3;
						/*
						  
						   Write a java programm to Display
						 > DELHI
						   condition : Enter num is Divisible by 2 and 3
						 > BANGALORE
						   condition : Enter num is Divisible by 2 
						 > MUMBAI
						   condition : Enter num is Divisible by 3
						 > KOLKATA
						   condition : None of the condition is holds
						   
						 */

import java.util.Scanner;

public class p4 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter X:");
		int x=s.nextInt();
		if(x%2==0 && x%3==0)
			System.out.println("DELHI");
		else if(x%2==0)
			System.out.println("BANGALORE");
		else if(x%3==0)
			System.out.println("MUMBAI");
		else
			System.out.println("KOLKATA");
	}

}
