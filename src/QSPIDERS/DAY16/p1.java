package QSPIDERS.DAY16;

import java.util.Arrays;

/*  Find the Maximum Element Present in the Array   */
public class p1 {
	public static void main(String[] args) {
		int[] num = {10,56,3,48,4,22};
		Arrays.sort(num);
		System.out.println("Maximum Element : "+num[num.length-1]);
		
		System.out.println("===================================================");
		
		int max = num[0];
		int index=0;
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
				index=i;
			}
		}
		System.out.println("Maximum Element : "+max);
		System.out.println("At Index        : "+index);
	}
}
