package QSPIDERS.DAY2;
					/* We have tow Monkeys, a and b and the parameters aSmile and bsmile indicate if each
					   is smiling. We are in Trouble if they are both Smiling or if neither is smiling return 
					   true if we are in trouble
					   
					 *  monkeyTrouble(true  ,  true )-->true
					 *  monkeyTrouble(false ,  false)-->true
					 *  monkeyTrouble(true  ,  false)-->false
					   
					 */
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		boolean m1smile = true;
		boolean m2smile = true;
		Scanner s = new Scanner(System.in);
		System.out.print("Is Monkey 1 Smiling\nType YES or No:");
		String s1 = s.nextLine().trim().toLowerCase();
		if(s1.equals("no"))
			m1smile=false;
		System.out.print("Is Monkey 2 Smiling\nType YESY or No:");
		String s2 = s.nextLine().trim().toLowerCase();
		if(s2.equals("no"))
			m1smile = false;
		if(m1smile == m2smile)
			System.out.println("We're in TROUBLE");
		else
			System.out.println("We're not in TROUBLE");
		
		/*    OR      */
		
		System.out.println("=============================================================");
		String st = m1smile==m2smile?"In TRouble":"Not in Trouble";
		System.out.println(st);
	}
}
