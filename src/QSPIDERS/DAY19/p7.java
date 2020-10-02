package QSPIDERS.DAY19;

import java.util.Arrays;

					/*  WAP to print non repeated Element in the Array  */
public class p7 {
	public static void main(String[] args) {
		int[] num = {5,6,4,2,1,1,7,5,6,4};
		System.out.println("Original Arrays : "+Arrays.toString(num));
		printNonRepeatedElement(num);
		
	}
	
	public static void printNonRepeatedElement(int[] num) {
		System.out.print("Non Repeated Elements : ");
		int n=num.length;
		for(int i=0 ; i<n ; i++)
		{
			int count = 0;
			for(int j=i+1 ; j<n ; j++)
			{
				if(num[i]==num[j])
				{
					for(int k=j ; k<n-1 ; k++)
					{
						num[k]=num[k+1];
					}
					count++;
					j--;
					n--;
				}
			}
			if(count==0)
				System.out.print(num[i]+" ");
		}
	}
}
