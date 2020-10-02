package QSPIDERS.DAY19;
					/* WAP to count of Repeated Elements in the Array  */
public class p6 {
	public static void main(String[] args) {
		int[] num = {2,2,2,1,1,1};
		printRepeatedElements(num);
	}

	public static void printRepeatedElements(int[] num)
	{
		   
		int n=num.length;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(num[i]==num[j])
				{
					for(int k=j;k<n-1;k++)
					{
						num[k]=num[k+1];
					}
					count++;
					n--; 	
					j--;	     
				}
			}
			if(count > 0)
			System.out.println(num[i]+" is Repeating "+(count)+" Times");
		}
	}
}
