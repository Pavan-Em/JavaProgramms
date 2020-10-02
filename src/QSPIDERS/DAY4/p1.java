package QSPIDERS.DAY4;

import java.util.Scanner;

						/*You driving a little too fast , and a police officer stops you. write code to compute
						  the result,encode as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed
						  is 60 or less, the result is 0, if speed is between 61 and 80 inclusive, the result 1.
						  if speed is 81 or more, the esult is 2. Unless it is your bday -- on that day, your speed 
						  can be 5 higher in all cases.
						  
						  caughtSpeeding(60 , false)-->0
						  caughtSpeeding(65 , false)-->1
						  caughtSpeeding(65 , true )-->0
						  
						 */
public class p1 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Speed:");
		int speed=s.nextInt();
		s.nextLine();
		boolean isbday=false;
		if(speed>=0)
		{
			System.out.print("Today is your Birthday\nEnter YES or No:");
			String bday=s.nextLine().strip().toLowerCase();
			if ( bday.equals("yes") )
				isbday=true;
			int extraspeed=0;
			if ( isbday )
				extraspeed=5;
			if ( speed<=(60+extraspeed) )
				System.out.println("No Ticket for You");
			else if ( speed>=(61+extraspeed) && speed<=(80+extraspeed) )
				System.out.println("Small Ticket for You");
			else
				System.out.println("Big Ticket for You");
		}
		else
			System.out.println("Speed Should not be Negetive");
	}

}
