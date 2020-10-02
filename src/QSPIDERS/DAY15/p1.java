package QSPIDERS.DAY15;

import java.util.Arrays;
import java.util.Random;

public class p1 {
	public static void main(String[] args)
	{
		int[] num = new int[20];
		System.out.println(Arrays.toString(num));
		
		//Using Math Class
		for(int i=0;i<num.length;i++)
			num[i]=(int)(Math.random()*10)+1;
		System.out.println(Arrays.toString(num));
		
		//Using Random class
		Random r=new Random();
		for(int i=0;i<num.length;i++)
			num[i]=r.nextInt(100);
		System.out.println(Arrays.toString(num));
	}
}
