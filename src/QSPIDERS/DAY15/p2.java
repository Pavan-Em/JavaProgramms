package QSPIDERS.DAY15;
					/* Sum of Elements in the Array   */
public class p2 {
	public static void main(String[] args) {
		int[] num= {1,7,8,9};
		int sum = getArraySum(num);
		System.out.println("Sum of Array Element : "+sum);
	}
	
	public static int getArraySum(int[] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++ )
		{
			sum+=num[i];
		}
		return sum;
	}
}
