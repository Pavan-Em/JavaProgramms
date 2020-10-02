package LEVEL1;
import java.util.*;
public class numarrangement {
	public static void main(String[] args) {
		int min,temp=0;
		int[] num=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			min=i;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[j]<num[min])
				{
					min=j;
				}
			}
			//these 3 lines to swap numbers
			temp=num[i];
			num[i]=num[min];
			num[min]=temp;
		}
		System.out.println(Arrays.toString(num));
	}
}

