package QSPIDERS.DAY2;
				/*The Parameter Weekday is true if it is a weekday , and the parameter vacation is true if we are on vacation.
				  We Sleep in if it is not a Weekday or we're on vacation,Return true if we sleep in.
				  
				  * sleepin(false , false)-->true
				  * sleepin(true  , false)-->false
				  * sleepin(true  , true )-->true
				  
				 */
import java.util.Scanner;

public class p1 {
	
	public static void main(String[] args) {
		 boolean weekday=true;
		 boolean vacation=true;
		Scanner s=new Scanner(System.in);
		System.out.print("Is today is Weekday\nType YES or NO:");
		String week=s.nextLine().trim().toLowerCase();
		if(week.equals("no"))
			weekday=false;
		System.out.print("Are in in Vacation\nType YES or NO:");
		String vac=s.nextLine().trim().toLowerCase();
		if(vac.equals("no"))
			vacation=false;
		if(weekday==false || vacation==true)
			System.out.println("Yes I'm Sleeping");
		else
			System.out.println("No I'm not Sleeping");
	}
	
	
}


