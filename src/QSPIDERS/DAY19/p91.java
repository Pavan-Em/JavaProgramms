package QSPIDERS.DAY19;

import java.util.Arrays;

/* WAP to Print Sum of Non Repeated Element in the Array  */
public class p91 {
	public static void main(String[] args) {
		System.out.println("Print Sum of Non Repeated Element in the Array");
		int[] num = {1,5,4,6,6,4,4};
		System.out.println("Array : "+Arrays.toString(num));
		int sum = getSumOfNonRepeatedElement(num);
		System.out.println("Sum : "+sum);
	}
	
	public static int getSumOfNonRepeatedElement(int[] num) {
		System.out.print("Non Repeated Elements : ");
		int n=num.length;
		int sum=0;
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
				sum+=num[i];
		}
		return sum;
	}
}
