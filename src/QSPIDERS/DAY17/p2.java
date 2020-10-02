package QSPIDERS.DAY17;

import java.util.Arrays;

											/* WAP to reverse the Given Array */
public class p2 {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println(Arrays.toString(num));
		int[] reverse1=reverseArray(num);
		
		System.out.println("Reversed Array");
		System.out.println(Arrays.toString(reverse1));
		
		int[] reverse2=reverseArrayBySwap(num);
		System.out.println(Arrays.toString(reverse2));
	}
	
	//Swaping using one more Array Variable
	public static int[] reverseArray(int[] num)
	{
		int[] rev = new int[num.length];
		int count=0;
		for(int i=num.length-1;i>=0;i--)
		{
			rev[count++]=num[i];
		}
		return rev;
	}
	
	//By using Swap
	public static int[] reverseArrayBySwap(int[] num)
	{
		System.out.println("Reverse By Swaping");
		int n=num.length/2;
		for(int i=0,j=num.length-1;i<n;i++,j--)
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
		}
		return num;
	}
}
