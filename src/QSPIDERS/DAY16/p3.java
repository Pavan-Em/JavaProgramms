package QSPIDERS.DAY16;

import java.util.Arrays;
							/*-------------------- BUBBLE SORT -----------------------*/
								/* WAp to Sort the Given Array in Acending Order  */
public class p3 {
	public static void main(String[] args) {
		int[] num = {1,9,4,65,98,21,19};
		System.out.println(Arrays.toString(num));
		num=sortA(num);
		System.out.println(Arrays.toString(num));
		num=sortD(num);
		System.out.println(Arrays.toString(num));
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
