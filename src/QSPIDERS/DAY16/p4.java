package QSPIDERS.DAY16;

import java.util.Arrays;
import java.util.Scanner;

									/*------ WAp to DEtermine nth Maximum Number -------*/
public class p4 {
	public static void main(String[] args) {
		int[] num = {2,45,61,79,34,12,19,94,54};
		System.out.println(Arrays.toString(num));
		System.out.println("Find nth Maximum of Above Array");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Value for n : ");
		int n=s.nextInt();
		 num=sortD(num);
		System.out.println(n+"th Laegest Number is "+num[n-1]);
	}
	
	public static int[] sortA(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[j]<num[i])  //====> When Second Number is lesser Swap
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num;
	}
	
	public static int[] sortD(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[j]>num[i])   //====>when Second Number is Higher Swap
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num;
	}
}
