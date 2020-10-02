package QSPIDERS.DAY5;
						/* 
						   In Triangle 1st row 1 block , 2nd row 2 block like that
						   like that print number of blocks in Triangle Based on Rows
						   
						 */

import java.util.Scanner;

public class p3 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Rows fro Triangle:");
		int n=s.nextInt();
		int blocks=0;
		for(int row=1;row<=n ;row++)
			blocks=blocks+row;
		System.out.println("Number of blocks in Triangle:"+blocks);
		
	}

}
