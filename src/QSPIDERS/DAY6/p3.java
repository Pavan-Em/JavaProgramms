package QSPIDERS.DAY6;

import java.util.Scanner;

						/*  Given a non-negative int n, compute the occurance of 8 as a digit,
							Except that an 8 with another 8 immedietly to its left count double
							so 8818 yield 4.
							
							count8(8)--->1
							count8(818)->2
							count8(8818)>4
							
							*/
public class p3 {
	 public static void main(String[] args)
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter Non-Negative Number : ");
		 int m=s.nextInt();
		 int n=m;
		 System.out.print("Enetr Target Number : ");
		 int target=s.nextInt();
		 int count=0;
		 int last1=n%10;
		 if(n>=0)
		 {
			 while(n>0)
			 {
				 n=n/10;
				 int last2=n%10;
				 if(last1==target)
				 {
					 if(last1==last2)
						 count+=2;
					 else
						 count++;
				 }
				 last1=last2;
			 }
		 }
		 else
			 System.out.println("You Entered a Negative Number");
		 System.out.println("number of "+target+" present in "+m+" is "+count);
		 s.close();
	 }

}
