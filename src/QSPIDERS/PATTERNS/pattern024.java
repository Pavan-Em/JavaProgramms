package QSPIDERS.PATTERNS;
					/*						    1 
										      2 2 2 
										    3 3 3 3 3 
										  4 4 4 4 4 4 4 
										5 5 5 5 5 5 5 5 5 
										  4 4 4 4 4 4 4 
										    3 3 3 3 3 
										      2 2 2 
										        1 
										        */
public class pattern024 {
public static void main(String[] args) {
		
		int n=5;
		for(int row=0 ; row<n ; row++)
		{
			//col = spaces +stars
			for(int space=0 ; space<n-1-row ; space++)  //--->this is to print space here row decides how many spaces should be printed
			{
				System.out.print("  ");
			}
			for(int star=0 ; (2*row)>=star ; star++)   //---->this is to print stars
			{
				System.out.print(row+1+" ");
			}
			System.out.println();
		}
		for(int row=n-2 ; row>=0 ; row--)
		{
			
			for(int space=0 ; space<n-1-row ; space++)  //--->this is to print space
			{
				System.out.print("  ");
			}
			for(int star=0 ; (2*row)>=star ; star++)   //---->this is to print stars
			{
				System.out.print(row+1+" ");
			}
			System.out.println();
			

		}
	}

}
