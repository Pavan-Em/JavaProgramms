package QSPIDERS.DAY19;
										/* WAP to Print Occurence of Elements in an array  */
public class p3 {
	public static void main(String[] args) {
		int[] num= {2,2,2,1,1,1};
		printOccurence(num);
	}
	
	public static void printOccurence(int[] num)
	{
		   
		int n=num.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
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
			System.out.println(num[i]+" is Occuring "+(count)+" Times");
		}
	}
}
