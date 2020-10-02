package QSPIDERS.DAY15;

public class p3 {
	public static void main(String[] args) {
		int[] num = {1,89,44,69,68,61,75};
		getOddEvenArrayCount(num);
	}
	public static void getOddEvenArrayCount(int[] num)
	{
		int odd=0;
		int even=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Odd Element   : "+odd);
		System.out.println("Even Elements : "+even);
	}
}
