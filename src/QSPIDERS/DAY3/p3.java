package QSPIDERS.DAY3;
						/* 
						  
						    Given an int n, return true if it is within 10 of 100 ot 200
						    compute the absolute value of a number
						    
						    nearHundard(105)-->true
						    nearHundard(206)-->true
						    nearHundard(93) -->true
						    
						    90-110
						    190-210
						    
						    
						 */

import java.util.Scanner;

public class p3 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=s.nextInt();
		if((n>=90 && n<=110) || (n>=190 && n<=210))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
