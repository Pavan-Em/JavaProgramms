package QSPIDERS.DAY17;

import java.util.Arrays;
										/* WAP to Print the Missing Numbers in the Array  */
public class p1 {
	public static void main(String[] args) {
		int[] num = {5,9,12,19};
		printMissingNumber(num);
		printMissingNumber2(num);
	}
	
	public static void printMissingNumber(int[] num)
	{
		System.out.println("Actual Array : "+Arrays.toString(num));
		System.out.println("Missing Numbers in the Array");
		System.out.println("CASE 1");
		int n=0;
		for(int i=num[n];i<num[num.length-1];i++)
		{
			if(i!=num[n])
			{
				System.out.print(i+" ");
				continue;
			}
			n++;
		}
	}
	
	//CASE 2
	public static void printMissingNumber2(int[] num)
	{
		System.out.println("\nCASE 2");
		for(int i=0;i<num.length-1;i++)   //Mess here i < num.length-1 , Reason---> inside for loop j < num[i+1] leads to AIOOBE
		{
			for(int j=num[i]+1;j<num[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}
	}
}
