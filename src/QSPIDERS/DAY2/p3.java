package QSPIDERS.DAY2;			
					/* Given tow int Values, return their sum. Unless the values are the same,
					   then return double their Sum
					   
					   * sumDouble(1 , 2)-->3
					   * sumDouble(3 , 2)-->5
					   * sumDouble(2 , 2)-->8
					
					 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class p3 {

	public static void main(String[] args) {
		int a=0,x=0,y=0;
		do
		{
			try
			{
				Scanner s=new Scanner(System.in);
				System.out.print("Enter value of X:");
				x=s.nextInt();
				System.out.print("Enter value of Y:");
				y=s.nextInt();
				a=1;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Only Enter a Number");
			}
		} while(a==0);
		
		int sum=x+y;
		if(x==y)
			System.out.println("Sum:"+sum*2);
		else
			System.out.println("Sum:"+sum);
	}
}
