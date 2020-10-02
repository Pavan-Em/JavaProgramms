package QSPIDERS.DAY3;
					/* Given 2 int Values, return true if they are both in the range 30...40 inclusive
					   or they are both in the range 40...50 inclusive.
					   
					   in30..50(30 , 31)-->true
					   in30..50(30 , 41)-->false
					   in30..50(40 , 50)-->true
					   
					 */
import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter X:");
		int x=s.nextInt();
		System.out.print("Enter Y:");
		int y=s.nextInt();
		if( ((x>=30 && x<=40)&&(y>=30 && y<=40)) || ((x>=40 && x<=50)&&(y>=40 && y<=50)) )
		{
				System.out.println("True");
		}
		else
			System.out.println("False");
	}
}
