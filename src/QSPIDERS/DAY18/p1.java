package QSPIDERS.DAY18;

import java.util.Arrays;

/* WAP to Delete Repeated Elements in an Array  */
public class p1 {
	public static void main(String[] args) {
		int[] num = {2,2,2,1,1};
		int[] alteredNum=deleteDuplicate(num);
		System.out.println(Arrays.toString(alteredNum));
	}
	
	public static int[] deleteDuplicate(int[] num)
	{
		int count=0;   //----->to know number of duplictes 
		int n=num.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(num[i]==num[j])
				{
					for(int k=j;k<n-1;k++)
					{
						num[k]=num[k+1];
					}
					count++;
					n--; 	//------>to reduce iteration 
					j--;	//------>to compare with the modifide element present in index 1       
				}
			}
		}
		int[] alteredNum= new int[n];
		for(int i=0;i<alteredNum.length;i++)
		{
			alteredNum[i]=num[i];
		}
		
		return alteredNum;
	}
}
