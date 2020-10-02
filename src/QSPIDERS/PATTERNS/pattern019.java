package QSPIDERS.PATTERNS;
					/* 
					                  *
					                * * *
					              * * * * *
					 */
public class pattern019 {
	public static void main(String[] args) {
		int n = 5;
		for(int row=0 ; row<n ; row++)
		{
			//col = spaces +stars
			for(int space=0 ; space<n-1-row ; space++)  //--->this is to print space here row decides how many spaces should be printed
			{
				System.out.print("  ");
			}
			for(int star=0 ; (2*row)>=star ; star++)   //---->this is to print stars
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
