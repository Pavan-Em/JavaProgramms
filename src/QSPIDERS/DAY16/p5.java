package QSPIDERS.DAY16;
										/* WAP to find 1st two Minimum Numbers in Array  */
public class p5 {
	public static void main(String[] args) {
		int[] num = {56,98,42,12,69,97,17,2};
		get2Min(num);
	}
	
	public static void get2Min(int[] num)
	{
		int min1=num[0];
		int min2=num[1];
		int index1=0;
		int index2=1;
		for(int i=1 ; i < num.length ; i++)
		{
			if(num[i] < min1)
			{
				min2   = min1;
				index2 = index1;
				min1   = num[i];
				index1 = i;
			}
			else if(num[i] < min2)
			{
				min2   = num[i];
				index2 = i;
			}
		}
		System.out.println("Minimum-1 : "+min1+"   "+"At Index : "+index1);
		System.out.println("Minimum-2 : "+min2+"   "+"At Index : "+index2);
	}
}
