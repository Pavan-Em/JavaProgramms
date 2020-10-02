package LEVEL1;

import java.util.InputMismatchException;
import java.util.Scanner;
				//Write this programm Again Again And Again
//numfrequency
public class numfrequency {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a=1;
		int freq = 0;
		System.out.print("Enter frequency:");
		while(a==1)
		{
			try
			{
				freq=s.nextInt();//if u want use if for only positive numbers
				a=2;
				
			}
			catch(InputMismatchException e)
			{
				System.out.println(freq);//this to check what is Assigned to Freq
				System.out.println("Enter only Number");
				System.out.print("Re-Enter Frequency:");
				s.nextLine();//if u dont use this consumer it'll become infiniity loop bcoz of inputmissmatch exception
			}
		}
		int[] count=new int[freq+1];
		System.out.println("Enter number Between 1-10:");//if u want give user input for range also
		for(int i=0;i<freq;i++)
		{
			int c=1;
			do
			{
				int num=0;
			try
			{
				int b=1;
				do
				{
				 num=s.nextInt();
				if(num>0 && num<11)
				{
					++count[num];
					b=2;
				}
				else
					System.out.println("Only enter num Between 1-10");
				}while(b==1);
				c=2;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter number only");
				s.nextLine();//if u dont use consumer itll become infinity loop
			}
			}while(c==1);
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			System.out.println(""+i+"-->"+count[i]);
		}
		
	}
}
