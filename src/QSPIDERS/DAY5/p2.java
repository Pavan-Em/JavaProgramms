package QSPIDERS.DAY5;

import java.util.Scanner;

/* We have bunnies standing in a line, numbered 1,2,..... The odd bunnies(1,3,..)
					   have the normal 2 ears. The Even bunnies(2,4,....) we'll say have 3 ears return 
					   the number of "ears" in the bunny line 1,2,....n
					   
					   bunnyEars2(0)---0
					   bunnyEars2(1)---2
					   bunnyEars2(2)---5  from 2 bunnies total 5 ears
					   
					   
					 */
public class p2 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number of Bunnies:");
		int n=s.nextInt();
		int ears=0;
		for(int i=1;i<=n ;i++)
			ears=ears+(i%2==0?3:2);
		System.out.println("Totle nNumber of Ears:"+ears);
	}

}
