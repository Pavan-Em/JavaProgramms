package QSPIDERS.DAY3;
						
						/*  given an int n,return the absolute difference between n and 21
						except return double the absolute difference if n is over 21.
						
						diff21(19) --> 2
						diff21(10) --> 11
						diff21(21) --> 0
						
						
						*/

import java.util.Scanner;

public class p2 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=s.nextInt();
		if(n>21)
			System.out.println((n-21)*2);
		else
			System.out.println(21-n);  //this statement include equals to 21 also
	}

}
