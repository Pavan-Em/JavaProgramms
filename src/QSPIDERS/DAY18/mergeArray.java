package QSPIDERS.DAY18;

import java.util.Arrays;

public class mergeArray {
	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = {4,5,6,7};
		int[] mergeArray = new int[num1.length+num2.length];
		int i;
		for(i=0;i<num1.length;i++)
		{
			int key = num1[i];
			Arrays.fill(mergeArray,i,i+1,key);
		}
		int index=0;
		for(int j=i;j<num2.length+i;j++)
		{
			int key = num2[index++];
			Arrays.fill(mergeArray,j,j+1,key);
		}
		System.out.println(Arrays.toString(mergeArray));
	}
}
