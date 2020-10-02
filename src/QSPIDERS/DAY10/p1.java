package QSPIDERS.DAY10;

import java.util.Scanner;
                                  /*    WAP to determine the LCM of TWO Numbers   */
public class p1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number-1 : ");
		int num1=s.nextInt();
		System.out.print("Enter Number-2 : ");
		int num2=s.nextInt();
		int lcm=getLCM(num1, num2);
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
	}
	
	public static int getLCM(int num1,int num2)
	{
		int i=num1>num2?num1:num2;//---------------------------->Reducing Iteration
		while(true)
		{
			if(i%num1==0 && i%num2==0)
			{
				return i;
			}
			i+=num1>num2?num1:num2;;
		}
	}
}
