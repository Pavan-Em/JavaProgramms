package QSPIDERS.DAY16;
					           /* Find Fiest 2 Maximum Number and Index in Array   */
public class p2 {
	public static void main(String[] args) {
		int[] num= {0,0,54,67,61,53,12};
		get2Max(num);
	}
	
	public static void get2Max(int[] num)
	{
		int max1=num[0];
		int max2=num[1];
		int index1=0;
		int index2=1;
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max1)
			{
				max2=max1;
				index2=index1;
				max1=num[i];
				index1=i;
			}
			else if(num[i]> max2)
			{
				max2=num[i];
				index2=i;
			}
		}
		System.out.println("Maximum-1 : "+max1+"   "+"Index : "+index1);
		System.out.println("Maximum-2 : "+max2+"   "+"Index : "+index2);
	}
}
