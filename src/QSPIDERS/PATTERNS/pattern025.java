package QSPIDERS.PATTERNS;
										/*            1 
												    1 2 1 
												  1 2 3 2 1       //--->dive this in to two(1st 3 lines and next 4 lines)
												1 2 3 4 3 2 1 
										*/		
public class pattern025 {
	public static void main(String[] args) {
		int n = 4;
		
		for(int row=0 ; row<n ; row++)
		{
			int count=1;
			//col = spaces +stars
			for(int space=0 ; space<n-1-row ; space++)  //--->this is to print space here row decides how many spaces should be printed
			{
				System.out.print("  ");
			}
			for(int star=0 ; (2*row)>=star ; star++)   //---->this is to print stars
			{
				if(row>star)
					System.out.print(count++ + " ");
				else
					System.out.print(count-- + " ");

			}
			System.out.println();
		}
	}
}
